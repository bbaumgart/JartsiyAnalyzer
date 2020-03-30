package BasicCarFunctions;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Formater {

    public static String dateFormater(String date) throws ParseException {
        String dateOut = null;

        SimpleDateFormat formatIn1 = new SimpleDateFormat("MMM dd, yyyy hh:mm:ss a");
        SimpleDateFormat formatIn2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat formatIn3 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat outFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            dateOut = outFormat.format(formatIn1.parse(date));

        } catch (ParseException e) {
            try {
                dateOut = outFormat.format(formatIn2.parse(date));
            } catch (Exception e1) {
                try {
                    dateOut = outFormat.format(formatIn3.parse(date));
                } catch (Exception e2){
                    dateOut = "";
                }
            }
        }
        return dateOut;
    }

    public static void ValuePasreToDouble(Integer value) {
        double ValuePasreToDouble = 0;
        ValuePasreToDouble(Integer.valueOf(String.valueOf(value)));
    }
}
