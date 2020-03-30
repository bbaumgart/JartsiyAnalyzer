package BasicCarFunctions;

import DailyDellCARPulsReport.ListToDailyDellCARPuls;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WarrantyByCallType {
    private static final Logger LOG = LogManager.getLogger();

    public static String WarrantyCallType(ListToDailyDellCARPuls StatusColumn) {
        String warranty = null;
        try {
            switch (StatusColumn.getCall_Type()) {
                case "PKD":
                case "PRP":
                case "CRP":
                case "CKD":
                    warranty ="ARC Desktop";
                    break;
                case "CRA":
                case "CRD":
                case "PRA":
                case "PRD":
                    warranty=("ARC Laptop");
                    break;
                case "HTS":
                case "OC1":
                case "ODC":
                case "OCF":
                case "OCL":
                case "OCR":
                case "OCS":
                    warranty=("OOW");
                    break;
                case "OCP":
                case "OGF":
                    warranty=("OOP");
                    break;
                default:
                    warranty=("IW");
                    break;
            }
        } catch (Exception e) {
            LOG.error("warranty by Call Type - fail Set Up" +e);
        }
        return warranty;
    }
    public static String setWarranty2(ListToDailyDellCARPuls StatusColumn) {
        String warranty2 = "";

        switch (StatusColumn.getWarranty()) {
            case "IW":
            case "ARC Laptop":
            case "ARC Desktop":
                warranty2 = "IW";
                break;
            default:
                warranty2 = "OOW";
        }

        return warranty2;
    }
}
