package FilesReaders;

import FILES.FileCARDispatches;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;

import static FilesReaders.Reads_excel_from_cloud.carDispatches;

public class FileCARDispatchesRead_csv {
    private static final Logger LOG = LogManager.getLogger();
    public static Map<String, FileCARDispatches> readFileCARDispatches(String FILE_PATH) throws FileNotFoundException {
        Map<String, FileCARDispatches> CarDispatchesMAP = new HashMap<>();

        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(carDispatches + "CAR Dispatches.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                records.add(Arrays.asList(values));
            }

        } catch (IOException e) {
            LOG.error("Fail in CarDispatches reader : "+ LocalDateTime.now());
        }
        setFileCARDispatches(CarDispatchesMAP, records);
        return CarDispatchesMAP;
    }

    public static void setFileCARDispatches(Map<String, FileCARDispatches> carDispatchesMAP, List<List<String>> records) {
        for (int i = 1; i < records.size(); i++) {
            FileCARDispatches fileCARDispatches = new FileCARDispatches();
            fileCARDispatches.setDPS(records.get(i).get(0));
            fileCARDispatches.setDPStype(records.get(i).get(1));
            fileCARDispatches.setCallType(records.get(i).get(2));
            fileCARDispatches.setDPScreatedTime(records.get(i).get(3));
            fileCARDispatches.setDPSapprovedTime(records.get(i).get(4));
            fileCARDispatches.setCutOffTime(records.get(i).get(5));
            fileCARDispatches.setCountry(records.get(i).get(6));
            fileCARDispatches.setDSP_EMEA(records.get(i).get(7));
            fileCARDispatches.setActivityStatus(records.get(i).get(8));
            fileCARDispatches.setAccountName(records.get(i).get(9));
            fileCARDispatches.setContact(records.get(i).get(10));
            fileCARDispatches.setLocation(records.get(i).get(11));
            fileCARDispatches.setActivityCreatorGroup(records.get(i).get(12));
            fileCARDispatches.setEntitlementName(records.get(i).get(13));
            fileCARDispatches.setServiceTag(records.get(i).get(14));
            fileCARDispatches.setSerialNumber(records.get(i).get(15));
            fileCARDispatches.setShipDate(records.get(i).get(16));
            fileCARDispatches.setDaysSinceShipped(records.get(i).get(17));
            fileCARDispatches.setServiceRequestNumber(records.get(i).get(18));
            fileCARDispatches.setCCN(records.get(i).get(19));
            fileCARDispatches.setAddressLine1(records.get(i).get(20));
            fileCARDispatches.setAddressLine2(records.get(i).get(21));
            fileCARDispatches.setPostalCode(records.get(i).get(22));
            fileCARDispatches.setCity(records.get(i).get(23));

            carDispatchesMAP.put(fileCARDispatches.getDPS(), fileCARDispatches);

        }
    }
}