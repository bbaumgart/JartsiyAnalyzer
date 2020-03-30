package BasicCarFunctions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TatCalculateNetworkDays {
    private static final Logger LOG = LogManager.getLogger();

    public static String RepairAging(String startdate) {

        return getEndDate(startdate, "dd-MM-yyyy");
    }

    public static String IncydentAging(String startdate) {

        return getEndDate(startdate, "MM-dd-yyyy");
    }

    @NotNull
    private static String getEndDate(String startdate, String s) {
        String enddate = new SimpleDateFormat("MM/dd/yy HH:mm").format(new Date());
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy HH:mm");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat(s);
        SimpleDateFormat sdf4 = new SimpleDateFormat("MMM dd, yyyy hh:mm:ss a");

        String Aging;
        try {
            Calendar start = Calendar.getInstance();
            try {
                start.setTime(sdf.parse(startdate));
            } catch (ParseException e) {
                try {
                    start.setTime(sdf2.parse(startdate));
                } catch (ParseException e1) {
                    try {
                        start.setTime(sdf3.parse(startdate));
                    } catch (ParseException e2) {
                        try {
                            start.setTime(sdf4.parse(startdate));
                        } catch (ParseException e3) {
                            Aging = " ";
                        }
                    }
                }
            }
            Calendar end = Calendar.getInstance();
            end.setTime(sdf.parse(enddate));

            int workingDays = 0;
            while (!start.after(end)) {
                int day = start.get(Calendar.DAY_OF_WEEK);
                if ((day != Calendar.SATURDAY) && (day != Calendar.SUNDAY))
                    workingDays++;
                start.add(Calendar.DATE, 1);
            }
            Aging = (String.valueOf(workingDays - 1));
        } catch (Exception e) {
            Aging = "";
            LOG.error("błąd w liczeniu networkdays " + e);
            e.printStackTrace();
        }
        return Aging;
    }

    public static String getWorkingDaysBetweenTwoDates(String startDateS, String endDateS) throws ParseException {
        String result;
        Date startDate;
        Date endDate;

        if (startDateS.equals("")) {
            startDate = new Date();
        }else {
            startDate = new SimpleDateFormat("dd-MM-yyyy").parse(startDateS);
        }

        if (endDateS.equals("")) {
            endDate = new Date();
        }else {
            endDate = new SimpleDateFormat("dd-MM-yyyy").parse(endDateS);
        }

        try {

            Calendar startCal = Calendar.getInstance();
            startCal.setTime(startDate);

            Calendar endCal = Calendar.getInstance();
            endCal.setTime(endDate);

            int workDays = 0;

            //Return 0 if start and end are the same
            if (startCal.getTimeInMillis() == endCal.getTimeInMillis()) {

                return "0";
            }

            if (startCal.getTimeInMillis() > endCal.getTimeInMillis()) {
                startCal.setTime(endDate);
                endCal.setTime(startDate);
            }

            do {
                //excluding start date
                startCal.add(Calendar.DAY_OF_MONTH, 1);
                if (startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                    ++workDays;
                }
            } while (startCal.getTimeInMillis() < endCal.getTimeInMillis()); //excluding end date

            result = String.valueOf(workDays);
        } catch (NullPointerException e) {
            return "0";
        }
        return result;
    }
}
