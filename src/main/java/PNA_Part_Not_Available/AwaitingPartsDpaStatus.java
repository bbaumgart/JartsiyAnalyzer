package PNA_Part_Not_Available;

import FILES.FileAwpGetSequenceLineDetails;
import FILES.FileWIP;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static FilesReaders.DataBaseFromFiles.fileAwpGetSequenceLineDetailsMap;
import static FilesReaders.DataBaseFromFiles.fileWIPMap;

public class AwaitingPartsDpaStatus {

    public Map<String, List<FileAwpGetSequenceLineDetails>> getAwpMap() throws ParseException, IOException {

        Map<String, List<FileAwpGetSequenceLineDetails>> awpReport = new HashMap<>(fileAwpGetSequenceLineDetailsMap);
        Map<String, FileWIP> fileWipAwpMap = new HashMap<>(fileWIPMap);

        for (List<FileAwpGetSequenceLineDetails> awpStatus : awpReport.values()) {

            for (FileAwpGetSequenceLineDetails status : awpStatus) {
                if (fileWipAwpMap.get(status.getDPS()) != null) {
                    status.setLastUpdate(fileWipAwpMap.get(status.getDPS()).getLAST_UPDATE());
                }
            }
        }

        Map<String, String> noEta = new HashMap<>();
        Map<String, String> EtaToday = new HashMap<>();
        Map<String, String> EtaTomorrow = new HashMap<>();
        Map<String, String> EtaOtherDay = new HashMap<>();

        awpReport.entrySet().removeIf(entry -> entry.getKey().equals("DPS"));

        for (List<FileAwpGetSequenceLineDetails> u : awpReport.values()) {
            String ETA = "";
            for (FileAwpGetSequenceLineDetails awpGetSequenceLineDetails : u) {

                Date PartReq = null;
                Date LastUpdate = null;
                Date EtaForPart;
                Date today = new Date();
                Calendar cal = Calendar.getInstance();
                cal.setTime(today);

                String callCreated = awpGetSequenceLineDetails.getCall_Created();
                String eta = awpGetSequenceLineDetails.getETA();
                String lastUpdate = awpGetSequenceLineDetails.getLastUpdate();

                try {
                    PartReq = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(callCreated);
                    LastUpdate = new SimpleDateFormat("MMM dd, yyyy hh:mm:ss a").parse(lastUpdate);
                    EtaForPart = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(eta);
                } catch (NullPointerException | ParseException e) {
                    EtaForPart = null;

//                    System.out.println("nie parsuje daty Last Update " + e + " " + awpGetSequenceLineDetails.getLastUpdate());
//                    System.out.println("nie parsuje daty Call Create " + e + " " + awpGetSequenceLineDetails.getCall_Created());
//                    System.out.println("nie parsuje daty ETA " + e + " " + awpGetSequenceLineDetails.getETA());
//                    System.out.println("nie parsuje daty DPS " + e + " " + awpGetSequenceLineDetails.getDPS());
                }

//              nadaje status dla lini
                assert PartReq != null;
                assert LastUpdate != null;
                assert EtaForPart != null;
                try {

                    if (!EtaForPart.after(today)
                            && awpGetSequenceLineDetails.getAwpLineStatus().equals("ETA for other day")
                    ) {
                        awpGetSequenceLineDetails.setAwpLineStatus("partReceived");
                    }
                } catch (NullPointerException e) {
                    EtaForPart = null;
                }
//                if (awpGetSequenceLineDetails.getDPS().equals("04719159579")) {
//
//                    System.out.println("Last update " + awpGetSequenceLineDetails.getLastUpdate());
//                    System.out.println("ordered PN" + awpGetSequenceLineDetails.getOrig_Part());
//                    System.out.println("Status line " + awpGetSequenceLineDetails.getAwpLineStatus());
//
//                }
                try {


                    if (PartReq.after(LastUpdate)
                    ) {

                        switch (awpGetSequenceLineDetails.getAwpLineStatus()) {
                            case "no ETA for part":
                                noEta.put(awpGetSequenceLineDetails.getDPS(), "No Eta");
                                break;
                            case "ETA Today":
                                EtaToday.put(awpGetSequenceLineDetails.getDPS(), "Parts Today");
                                break;
                            case "ETA Tomorrow":
                                EtaTomorrow.put(awpGetSequenceLineDetails.getDPS(), "Parts Tomorrow");
                                break;
                            case "ETA for other day":
                                EtaOtherDay.put(awpGetSequenceLineDetails.getDPS(), "Parts for other day");
                                ETA = awpGetSequenceLineDetails.getETA();
                                break;
                        }
                    } else {
                        awpGetSequenceLineDetails.setAwpLineStatus("No current part req");
                    }
                } catch (NullPointerException e){
                    System.out.println("null jest w "+ PartReq + awpGetSequenceLineDetails.getDPS());
                    System.out.println("null jest w "+ LastUpdate + awpGetSequenceLineDetails.getDPS());
                }
            }

// nadaje status dla naprawy

            if (!noEta.isEmpty()) {
                for (FileAwpGetSequenceLineDetails fileAwpGetSequenceLineDetails : u) {
                    fileAwpGetSequenceLineDetails.setAwpDpsStatus("no ETA for parts");
                }
                EtaOtherDay.clear();
                EtaTomorrow.clear();
                EtaToday.clear();

            } else if (!EtaOtherDay.isEmpty()
            ) {
                for (FileAwpGetSequenceLineDetails fileAwpGetSequenceLineDetails : u) {
                    fileAwpGetSequenceLineDetails.setAwpDpsStatus("Parts for other day - > " + ETA);
                }
                EtaTomorrow.clear();
                noEta.clear();
                EtaToday.clear();

            } else if (!EtaTomorrow.isEmpty()) {
                for (FileAwpGetSequenceLineDetails fileAwpGetSequenceLineDetails : u) {
                    fileAwpGetSequenceLineDetails.setAwpDpsStatus("Parts Tomorrow");
                }

                EtaOtherDay.clear();
                noEta.clear();
                EtaToday.clear();

            } else if (!EtaToday.isEmpty()) {
                for (FileAwpGetSequenceLineDetails fileAwpGetSequenceLineDetails : u) {
                    fileAwpGetSequenceLineDetails.setAwpDpsStatus("Parts Today");
                }
                EtaOtherDay.clear();
                EtaTomorrow.clear();
                noEta.clear();
            } else {
                for (FileAwpGetSequenceLineDetails fileAwpGetSequenceLineDetails : u) {
                    fileAwpGetSequenceLineDetails.setAwpDpsStatus("No req in Cdmv ");
                }
            }
            EtaOtherDay.clear();
            EtaTomorrow.clear();
            noEta.clear();
            EtaToday.clear();
        }

        return awpReport;
    }
}