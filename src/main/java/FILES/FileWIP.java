package FILES;


import java.util.Objects;

public class FileWIP {
    private String CLIENT_NAME;
    private String CONTRACT_NAME;
    private String UNIT_BCN;
    private String SERIAL_NO;
    private String PART_NO;
    private String PART_DESC;
    private String HOLD_STATUS;
    private String REASON_FOR_HOLD;
    private String STORAGE_HOLD_CODE;
    private String STORAGE_HOLD_CODE_DESC;
    private String DAYS_ON_HOLD;
    private String NetDaysonHold;
    private String SUM_WEEKDAYS_ON_HOLD;
    private String CURRENT_WORKCENTER;
    private String DESTINATION_WORKCENTER;
    private String LAST_UPDATE;
    private String RECEIPT_TIMESTAMP;
    private String Part_Req_fulfillment;
    private String DAYS_IN_WIP;
    private String DAYS_IN_WIP_WEEK;
    private String DAYS_IN_WIP_RND;
    private String DAYS_IN_WIP_WEEK_RND;
    private String ORDER_PROCESS_TYPE_CODE;
    private String REFERENCE_ORDER_ID;
    private String WORKORDER_ID;
    private String WO_Created_Timestamp;
    private String CUSTOMER_PO_NO;
    private String CLIENT_REFERENCE_NO1;
    private String CLIENT_REFERENCE_NO2;
    private String Routing;
    private String ReleasedFromNPI;
    private String Receipt_SN;
    private String BIN;
    private String TATinPROCESS;
    private String PRODUCT_CLASS;
    private String DELIVERY;
    private String PUT_ON_HOLD_DATE;
    private String RELEASED_MOVE_FROM_HOLD_DATE;
    private String Price;
    private String InvtoryNotes;
    private String RO_CREATED_TIMESTAMP;
    private String REVISION_LEVEL;
    private String CALL_TYPE;
    private String VIP_UNIT;
    private String NFF_SOFTWARE;
    private String NFF_OTHER_INF;
    private String INTERNAL_NOTES;
    private String CANCELLATION_REASON;
    private String DEVICE_INTERFACE;
    private String FUSION_CREATED_DATE;
    private String WI_FUSION;
    private String SERVICE_EVENT;
    private String SERVICE_STATUS;
    private String ORIGINAL_COUNTRY;
    private String RETAILER;
    private String NFF_SPEC_ACCES;
    private String ADDITIONAL_INFORMATION;
    private String EXCEPTION_CODE;

    public FileWIP() {
    }

    public FileWIP(String CLIENT_NAME, String CONTRACT_NAME, String UNIT_BCN, String SERIAL_NO, String PART_NO, String PART_DESC, String HOLD_STATUS, String REASON_FOR_HOLD, String STORAGE_HOLD_CODE, String STORAGE_HOLD_CODE_DESC, String DAYS_ON_HOLD, String netDaysonHold, String SUM_WEEKDAYS_ON_HOLD, String CURRENT_WORKCENTER, String DESTINATION_WORKCENTER, String LAST_UPDATE, String RECEIPT_TIMESTAMP, String part_Req_fulfillment, String DAYS_IN_WIP, String DAYS_IN_WIP_WEEK, String DAYS_IN_WIP_RND, String DAYS_IN_WIP_WEEK_RND, String ORDER_PROCESS_TYPE_CODE, String REFERENCE_ORDER_ID, String WORKORDER_ID, String WO_Created_Timestamp, String CUSTOMER_PO_NO, String CLIENT_REFERENCE_NO1, String CLIENT_REFERENCE_NO2, String routing, String releasedFromNPI, String receipt_SN, String BIN, String TATinPROCESS, String PRODUCT_CLASS, String DELIVERY, String PUT_ON_HOLD_DATE, String RELEASED_MOVE_FROM_HOLD_DATE, String price, String invtoryNotes, String RO_CREATED_TIMESTAMP, String CALL_TYPE, String VIP_UNIT, String NFF_SOFTWARE, String NFF_OTHER_INF, String INTERNAL_NOTES, String CANCELLATION_REASON, String DEVICE_INTERFACE, String FUSION_CREATED_DATE, String WI_FUSION, String SERVICE_EVENT, String SERVICE_STATUS, String ORIGINAL_COUNTRY, String RETAILER, String NFF_SPEC_ACCES, String ADDITIONAL_INFORMATION, String EXCEPTION_CODE) {
        this.CLIENT_NAME = CLIENT_NAME;
        this.CONTRACT_NAME = CONTRACT_NAME;
        this.UNIT_BCN = UNIT_BCN;
        this.SERIAL_NO = SERIAL_NO;
        this.PART_NO = PART_NO;
        this.PART_DESC = PART_DESC;
        this.HOLD_STATUS = HOLD_STATUS;
        this.REASON_FOR_HOLD = REASON_FOR_HOLD;
        this.STORAGE_HOLD_CODE = STORAGE_HOLD_CODE;
        this.STORAGE_HOLD_CODE_DESC = STORAGE_HOLD_CODE_DESC;
        this.DAYS_ON_HOLD = DAYS_ON_HOLD;
        NetDaysonHold = netDaysonHold;
        this.SUM_WEEKDAYS_ON_HOLD = SUM_WEEKDAYS_ON_HOLD;
        this.CURRENT_WORKCENTER = CURRENT_WORKCENTER;
        this.DESTINATION_WORKCENTER = DESTINATION_WORKCENTER;
        this.LAST_UPDATE = LAST_UPDATE;
        this.RECEIPT_TIMESTAMP = RECEIPT_TIMESTAMP;
        Part_Req_fulfillment = part_Req_fulfillment;
        this.DAYS_IN_WIP = DAYS_IN_WIP;
        this.DAYS_IN_WIP_WEEK = DAYS_IN_WIP_WEEK;
        this.DAYS_IN_WIP_RND = DAYS_IN_WIP_RND;
        this.DAYS_IN_WIP_WEEK_RND = DAYS_IN_WIP_WEEK_RND;
        this.ORDER_PROCESS_TYPE_CODE = ORDER_PROCESS_TYPE_CODE;
        this.REFERENCE_ORDER_ID = REFERENCE_ORDER_ID;
        this.WORKORDER_ID = WORKORDER_ID;
        this.WO_Created_Timestamp = WO_Created_Timestamp;
        this.CUSTOMER_PO_NO = CUSTOMER_PO_NO;
        this.CLIENT_REFERENCE_NO1 = CLIENT_REFERENCE_NO1;
        this.CLIENT_REFERENCE_NO2 = CLIENT_REFERENCE_NO2;
        Routing = routing;
        ReleasedFromNPI = releasedFromNPI;
        Receipt_SN = receipt_SN;
        this.BIN = BIN;
        this.TATinPROCESS = TATinPROCESS;
        this.PRODUCT_CLASS = PRODUCT_CLASS;
        this.DELIVERY = DELIVERY;
        this.PUT_ON_HOLD_DATE = PUT_ON_HOLD_DATE;
        this.RELEASED_MOVE_FROM_HOLD_DATE = RELEASED_MOVE_FROM_HOLD_DATE;
        Price = price;
        InvtoryNotes = invtoryNotes;
        this.RO_CREATED_TIMESTAMP = RO_CREATED_TIMESTAMP;
        this.CALL_TYPE = CALL_TYPE;
        this.VIP_UNIT = VIP_UNIT;
        this.NFF_SOFTWARE = NFF_SOFTWARE;
        this.NFF_OTHER_INF = NFF_OTHER_INF;
        this.INTERNAL_NOTES = INTERNAL_NOTES;
        this.CANCELLATION_REASON = CANCELLATION_REASON;
        this.DEVICE_INTERFACE = DEVICE_INTERFACE;
        this.FUSION_CREATED_DATE = FUSION_CREATED_DATE;
        this.WI_FUSION = WI_FUSION;
        this.SERVICE_EVENT = SERVICE_EVENT;
        this.SERVICE_STATUS = SERVICE_STATUS;
        this.ORIGINAL_COUNTRY = ORIGINAL_COUNTRY;
        this.RETAILER = RETAILER;
        this.NFF_SPEC_ACCES = NFF_SPEC_ACCES;
        this.ADDITIONAL_INFORMATION = ADDITIONAL_INFORMATION;
        this.EXCEPTION_CODE = EXCEPTION_CODE;
        this.REVISION_LEVEL = REVISION_LEVEL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileWIP fileWIP = (FileWIP) o;
        return Objects.equals(CLIENT_NAME, fileWIP.CLIENT_NAME) &&
                Objects.equals(CONTRACT_NAME, fileWIP.CONTRACT_NAME) &&
                Objects.equals(UNIT_BCN, fileWIP.UNIT_BCN) &&
                Objects.equals(SERIAL_NO, fileWIP.SERIAL_NO) &&
                Objects.equals(PART_NO, fileWIP.PART_NO) &&
                Objects.equals(PART_DESC, fileWIP.PART_DESC) &&
                Objects.equals(HOLD_STATUS, fileWIP.HOLD_STATUS) &&
                Objects.equals(REASON_FOR_HOLD, fileWIP.REASON_FOR_HOLD) &&
                Objects.equals(STORAGE_HOLD_CODE, fileWIP.STORAGE_HOLD_CODE) &&
                Objects.equals(STORAGE_HOLD_CODE_DESC, fileWIP.STORAGE_HOLD_CODE_DESC) &&
                Objects.equals(DAYS_ON_HOLD, fileWIP.DAYS_ON_HOLD) &&
                Objects.equals(NetDaysonHold, fileWIP.NetDaysonHold) &&
                Objects.equals(SUM_WEEKDAYS_ON_HOLD, fileWIP.SUM_WEEKDAYS_ON_HOLD) &&
                Objects.equals(CURRENT_WORKCENTER, fileWIP.CURRENT_WORKCENTER) &&
                Objects.equals(DESTINATION_WORKCENTER, fileWIP.DESTINATION_WORKCENTER) &&
                Objects.equals(LAST_UPDATE, fileWIP.LAST_UPDATE) &&
                Objects.equals(RECEIPT_TIMESTAMP, fileWIP.RECEIPT_TIMESTAMP) &&
                Objects.equals(Part_Req_fulfillment, fileWIP.Part_Req_fulfillment) &&
                Objects.equals(DAYS_IN_WIP, fileWIP.DAYS_IN_WIP) &&
                Objects.equals(DAYS_IN_WIP_WEEK, fileWIP.DAYS_IN_WIP_WEEK) &&
                Objects.equals(DAYS_IN_WIP_RND, fileWIP.DAYS_IN_WIP_RND) &&
                Objects.equals(DAYS_IN_WIP_WEEK_RND, fileWIP.DAYS_IN_WIP_WEEK_RND) &&
                Objects.equals(ORDER_PROCESS_TYPE_CODE, fileWIP.ORDER_PROCESS_TYPE_CODE) &&
                Objects.equals(REFERENCE_ORDER_ID, fileWIP.REFERENCE_ORDER_ID) &&
                Objects.equals(WORKORDER_ID, fileWIP.WORKORDER_ID) &&
                Objects.equals(WO_Created_Timestamp, fileWIP.WO_Created_Timestamp) &&
                Objects.equals(CUSTOMER_PO_NO, fileWIP.CUSTOMER_PO_NO) &&
                Objects.equals(CLIENT_REFERENCE_NO1, fileWIP.CLIENT_REFERENCE_NO1) &&
                Objects.equals(CLIENT_REFERENCE_NO2, fileWIP.CLIENT_REFERENCE_NO2) &&
                Objects.equals(Routing, fileWIP.Routing) &&
                Objects.equals(ReleasedFromNPI, fileWIP.ReleasedFromNPI) &&
                Objects.equals(Receipt_SN, fileWIP.Receipt_SN) &&
                Objects.equals(BIN, fileWIP.BIN) &&
                Objects.equals(TATinPROCESS, fileWIP.TATinPROCESS) &&
                Objects.equals(PRODUCT_CLASS, fileWIP.PRODUCT_CLASS) &&
                Objects.equals(DELIVERY, fileWIP.DELIVERY) &&
                Objects.equals(PUT_ON_HOLD_DATE, fileWIP.PUT_ON_HOLD_DATE) &&
                Objects.equals(RELEASED_MOVE_FROM_HOLD_DATE, fileWIP.RELEASED_MOVE_FROM_HOLD_DATE) &&
                Objects.equals(Price, fileWIP.Price) &&
                Objects.equals(InvtoryNotes, fileWIP.InvtoryNotes) &&
                Objects.equals(RO_CREATED_TIMESTAMP, fileWIP.RO_CREATED_TIMESTAMP) &&
                Objects.equals(CALL_TYPE, fileWIP.CALL_TYPE) &&
                Objects.equals(VIP_UNIT, fileWIP.VIP_UNIT) &&
                Objects.equals(NFF_SOFTWARE, fileWIP.NFF_SOFTWARE) &&
                Objects.equals(NFF_OTHER_INF, fileWIP.NFF_OTHER_INF) &&
                Objects.equals(INTERNAL_NOTES, fileWIP.INTERNAL_NOTES) &&
                Objects.equals(CANCELLATION_REASON, fileWIP.CANCELLATION_REASON) &&
                Objects.equals(DEVICE_INTERFACE, fileWIP.DEVICE_INTERFACE) &&
                Objects.equals(FUSION_CREATED_DATE, fileWIP.FUSION_CREATED_DATE) &&
                Objects.equals(WI_FUSION, fileWIP.WI_FUSION) &&
                Objects.equals(SERVICE_EVENT, fileWIP.SERVICE_EVENT) &&
                Objects.equals(SERVICE_STATUS, fileWIP.SERVICE_STATUS) &&
                Objects.equals(ORIGINAL_COUNTRY, fileWIP.ORIGINAL_COUNTRY) &&
                Objects.equals(RETAILER, fileWIP.RETAILER) &&
                Objects.equals(NFF_SPEC_ACCES, fileWIP.NFF_SPEC_ACCES) &&
                Objects.equals(ADDITIONAL_INFORMATION, fileWIP.ADDITIONAL_INFORMATION) &&
                Objects.equals(EXCEPTION_CODE, fileWIP.EXCEPTION_CODE)&&
                Objects.equals(REVISION_LEVEL, fileWIP.REVISION_LEVEL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CLIENT_NAME, CONTRACT_NAME, UNIT_BCN, SERIAL_NO, PART_NO, PART_DESC, HOLD_STATUS, REASON_FOR_HOLD, STORAGE_HOLD_CODE, STORAGE_HOLD_CODE_DESC, DAYS_ON_HOLD, NetDaysonHold, SUM_WEEKDAYS_ON_HOLD, CURRENT_WORKCENTER, DESTINATION_WORKCENTER, LAST_UPDATE, RECEIPT_TIMESTAMP, Part_Req_fulfillment, DAYS_IN_WIP, DAYS_IN_WIP_WEEK, DAYS_IN_WIP_RND, DAYS_IN_WIP_WEEK_RND, ORDER_PROCESS_TYPE_CODE, REFERENCE_ORDER_ID, WORKORDER_ID, WO_Created_Timestamp, CUSTOMER_PO_NO, CLIENT_REFERENCE_NO1, CLIENT_REFERENCE_NO2, Routing, ReleasedFromNPI, Receipt_SN, BIN, TATinPROCESS, PRODUCT_CLASS, DELIVERY, PUT_ON_HOLD_DATE, RELEASED_MOVE_FROM_HOLD_DATE, Price, InvtoryNotes, RO_CREATED_TIMESTAMP, CALL_TYPE, VIP_UNIT, NFF_SOFTWARE, NFF_OTHER_INF, INTERNAL_NOTES, CANCELLATION_REASON, DEVICE_INTERFACE, FUSION_CREATED_DATE, WI_FUSION, SERVICE_EVENT, SERVICE_STATUS, ORIGINAL_COUNTRY, RETAILER, NFF_SPEC_ACCES, ADDITIONAL_INFORMATION, EXCEPTION_CODE,REVISION_LEVEL);
    }

    @Override
    public String toString() {
        return "FileWIP{" +
                "CLIENT_NAME='" + CLIENT_NAME + '\'' +
                ", CONTRACT_NAME='" + CONTRACT_NAME + '\'' +
                ", UNIT_BCN='" + UNIT_BCN + '\'' +
                ", SERIAL_NO='" + SERIAL_NO + '\'' +
                ", PART_NO='" + PART_NO + '\'' +
                ", PART_DESC='" + PART_DESC + '\'' +
                ", HOLD_STATUS='" + HOLD_STATUS + '\'' +
                ", REASON_FOR_HOLD='" + REASON_FOR_HOLD + '\'' +
                ", STORAGE_HOLD_CODE='" + STORAGE_HOLD_CODE + '\'' +
                ", STORAGE_HOLD_CODE_DESC='" + STORAGE_HOLD_CODE_DESC + '\'' +
                ", DAYS_ON_HOLD='" + DAYS_ON_HOLD + '\'' +
                ", NetDaysonHold='" + NetDaysonHold + '\'' +
                ", SUM_WEEKDAYS_ON_HOLD='" + SUM_WEEKDAYS_ON_HOLD + '\'' +
                ", CURRENT_WORKCENTER='" + CURRENT_WORKCENTER + '\'' +
                ", DESTINATION_WORKCENTER='" + DESTINATION_WORKCENTER + '\'' +
                ", LAST_UPDATE='" + LAST_UPDATE + '\'' +
                ", RECEIPT_TIMESTAMP='" + RECEIPT_TIMESTAMP + '\'' +
                ", Part_Req_fulfillment='" + Part_Req_fulfillment + '\'' +
                ", DAYS_IN_WIP='" + DAYS_IN_WIP + '\'' +
                ", DAYS_IN_WIP_WEEK='" + DAYS_IN_WIP_WEEK + '\'' +
                ", DAYS_IN_WIP_RND='" + DAYS_IN_WIP_RND + '\'' +
                ", DAYS_IN_WIP_WEEK_RND='" + DAYS_IN_WIP_WEEK_RND + '\'' +
                ", ORDER_PROCESS_TYPE_CODE='" + ORDER_PROCESS_TYPE_CODE + '\'' +
                ", REFERENCE_ORDER_ID='" + REFERENCE_ORDER_ID + '\'' +
                ", WORKORDER_ID='" + WORKORDER_ID + '\'' +
                ", WO_Created_Timestamp='" + WO_Created_Timestamp + '\'' +
                ", CUSTOMER_PO_NO='" + CUSTOMER_PO_NO + '\'' +
                ", CLIENT_REFERENCE_NO1='" + CLIENT_REFERENCE_NO1 + '\'' +
                ", CLIENT_REFERENCE_NO2='" + CLIENT_REFERENCE_NO2 + '\'' +
                ", Routing='" + Routing + '\'' +
                ", ReleasedFromNPI='" + ReleasedFromNPI + '\'' +
                ", Receipt_SN='" + Receipt_SN + '\'' +
                ", BIN='" + BIN + '\'' +
                ", TATinPROCESS='" + TATinPROCESS + '\'' +
                ", PRODUCT_CLASS='" + PRODUCT_CLASS + '\'' +
                ", DELIVERY='" + DELIVERY + '\'' +
                ", PUT_ON_HOLD_DATE='" + PUT_ON_HOLD_DATE + '\'' +
                ", RELEASED_MOVE_FROM_HOLD_DATE='" + RELEASED_MOVE_FROM_HOLD_DATE + '\'' +
                ", Price='" + Price + '\'' +
                ", InvtoryNotes='" + InvtoryNotes + '\'' +
                ", RO_CREATED_TIMESTAMP='" + RO_CREATED_TIMESTAMP + '\'' +
                ", CALL_TYPE='" + CALL_TYPE + '\'' +
                ", VIP_UNIT='" + VIP_UNIT + '\'' +
                ", NFF_SOFTWARE='" + NFF_SOFTWARE + '\'' +
                ", NFF_OTHER_INF='" + NFF_OTHER_INF + '\'' +
                ", INTERNAL_NOTES='" + INTERNAL_NOTES + '\'' +
                ", CANCELLATION_REASON='" + CANCELLATION_REASON + '\'' +
                ", DEVICE_INTERFACE='" + DEVICE_INTERFACE + '\'' +
                ", FUSION_CREATED_DATE='" + FUSION_CREATED_DATE + '\'' +
                ", WI_FUSION='" + WI_FUSION + '\'' +
                ", SERVICE_EVENT='" + SERVICE_EVENT + '\'' +
                ", SERVICE_STATUS='" + SERVICE_STATUS + '\'' +
                ", ORIGINAL_COUNTRY='" + ORIGINAL_COUNTRY + '\'' +
                ", RETAILER='" + RETAILER + '\'' +
                ", NFF_SPEC_ACCES='" + NFF_SPEC_ACCES + '\'' +
                ", ADDITIONAL_INFORMATION='" + ADDITIONAL_INFORMATION + '\'' +
                ", EXCEPTION_CODE='" + EXCEPTION_CODE + '\'' +
                ", REVISION_LEVEL='" + REVISION_LEVEL + '\'' +
                '}';
    }

    public String getCLIENT_NAME() {
        return CLIENT_NAME;
    }

    public void setCLIENT_NAME(String CLIENT_NAME) {
        this.CLIENT_NAME = CLIENT_NAME;
    }

    public String getCONTRACT_NAME() {
        return CONTRACT_NAME;
    }

    public void setCONTRACT_NAME(String CONTRACT_NAME) {
        this.CONTRACT_NAME = CONTRACT_NAME;
    }

    public String getUNIT_BCN() {
        return UNIT_BCN;
    }

    public void setUNIT_BCN(String UNIT_BCN) {
        this.UNIT_BCN = UNIT_BCN;
    }

    public String getSERIAL_NO() {
        return SERIAL_NO;
    }

    public void setSERIAL_NO(String SERIAL_NO) {
        this.SERIAL_NO = SERIAL_NO;
    }

    public String getPART_NO() {
        return PART_NO;
    }

    public void setPART_NO(String PART_NO) {
        this.PART_NO = PART_NO;
    }

    public String getPART_DESC() {
        return PART_DESC;
    }

    public void setPART_DESC(String PART_DESC) {
        this.PART_DESC = PART_DESC;
    }

    public String getHOLD_STATUS() {
        return HOLD_STATUS;
    }

    public void setHOLD_STATUS(String HOLD_STATUS) {
        this.HOLD_STATUS = HOLD_STATUS;
    }

    public String getREASON_FOR_HOLD() {
        return REASON_FOR_HOLD;
    }

    public void setREASON_FOR_HOLD(String REASON_FOR_HOLD) {
        this.REASON_FOR_HOLD = REASON_FOR_HOLD;
    }

    public String getSTORAGE_HOLD_CODE() {
        return STORAGE_HOLD_CODE;
    }

    public void setSTORAGE_HOLD_CODE(String STORAGE_HOLD_CODE) {
        this.STORAGE_HOLD_CODE = STORAGE_HOLD_CODE;
    }

    public String getSTORAGE_HOLD_CODE_DESC() {
        return STORAGE_HOLD_CODE_DESC;
    }

    public void setSTORAGE_HOLD_CODE_DESC(String STORAGE_HOLD_CODE_DESC) {
        this.STORAGE_HOLD_CODE_DESC = STORAGE_HOLD_CODE_DESC;
    }

    public String getDAYS_ON_HOLD() {
        return DAYS_ON_HOLD;
    }

    public void setDAYS_ON_HOLD(String DAYS_ON_HOLD) {
        this.DAYS_ON_HOLD = DAYS_ON_HOLD;
    }

    public String getNetDaysonHold() {
        return NetDaysonHold;
    }

    public void setNetDaysonHold(String netDaysonHold) {
        NetDaysonHold = netDaysonHold;
    }

    public String getSUM_WEEKDAYS_ON_HOLD() {
        return SUM_WEEKDAYS_ON_HOLD;
    }

    public void setSUM_WEEKDAYS_ON_HOLD(String SUM_WEEKDAYS_ON_HOLD) {
        this.SUM_WEEKDAYS_ON_HOLD = SUM_WEEKDAYS_ON_HOLD;
    }

    public String getCURRENT_WORKCENTER() {
        return CURRENT_WORKCENTER;
    }

    public void setCURRENT_WORKCENTER(String CURRENT_WORKCENTER) {
        this.CURRENT_WORKCENTER = CURRENT_WORKCENTER;
    }

    public String getDESTINATION_WORKCENTER() {
        return DESTINATION_WORKCENTER;
    }

    public void setDESTINATION_WORKCENTER(String DESTINATION_WORKCENTER) {
        this.DESTINATION_WORKCENTER = DESTINATION_WORKCENTER;
    }

    public String getLAST_UPDATE() {
        return LAST_UPDATE;
    }

    public void setLAST_UPDATE(String LAST_UPDATE) {
        this.LAST_UPDATE = LAST_UPDATE;
    }

    public String getRECEIPT_TIMESTAMP() {
        return RECEIPT_TIMESTAMP;
    }

    public void setRECEIPT_TIMESTAMP(String RECEIPT_TIMESTAMP) {
        this.RECEIPT_TIMESTAMP = RECEIPT_TIMESTAMP;
    }

    public String getPart_Req_fulfillment() {
        return Part_Req_fulfillment;
    }

    public void setPart_Req_fulfillment(String part_Req_fulfillment) {
        Part_Req_fulfillment = part_Req_fulfillment;
    }

    public String getDAYS_IN_WIP() {
        return DAYS_IN_WIP;
    }

    public void setDAYS_IN_WIP(String DAYS_IN_WIP) {
        this.DAYS_IN_WIP = DAYS_IN_WIP;
    }

    public String getDAYS_IN_WIP_WEEK() {
        return DAYS_IN_WIP_WEEK;
    }

    public void setDAYS_IN_WIP_WEEK(String DAYS_IN_WIP_WEEK) {
        this.DAYS_IN_WIP_WEEK = DAYS_IN_WIP_WEEK;
    }

    public String getDAYS_IN_WIP_RND() {
        return DAYS_IN_WIP_RND;
    }

    public void setDAYS_IN_WIP_RND(String DAYS_IN_WIP_RND) {
        this.DAYS_IN_WIP_RND = DAYS_IN_WIP_RND;
    }

    public String getDAYS_IN_WIP_WEEK_RND() {
        return DAYS_IN_WIP_WEEK_RND;
    }

    public void setDAYS_IN_WIP_WEEK_RND(String DAYS_IN_WIP_WEEK_RND) {
        this.DAYS_IN_WIP_WEEK_RND = DAYS_IN_WIP_WEEK_RND;
    }

    public String getORDER_PROCESS_TYPE_CODE() {
        return ORDER_PROCESS_TYPE_CODE;
    }

    public void setORDER_PROCESS_TYPE_CODE(String ORDER_PROCESS_TYPE_CODE) {
        this.ORDER_PROCESS_TYPE_CODE = ORDER_PROCESS_TYPE_CODE;
    }

    public String getREFERENCE_ORDER_ID() {
        return REFERENCE_ORDER_ID;
    }

    public void setREFERENCE_ORDER_ID(String REFERENCE_ORDER_ID) {
        this.REFERENCE_ORDER_ID = REFERENCE_ORDER_ID;
    }

    public String getWORKORDER_ID() {
        return WORKORDER_ID;
    }

    public void setWORKORDER_ID(String WORKORDER_ID) {
        this.WORKORDER_ID = WORKORDER_ID;
    }

    public String getWO_Created_Timestamp() {
        return WO_Created_Timestamp;
    }

    public void setWO_Created_Timestamp(String WO_Created_Timestamp) {
        this.WO_Created_Timestamp = WO_Created_Timestamp;
    }

    public String getCUSTOMER_PO_NO() {
        return CUSTOMER_PO_NO;
    }

    public void setCUSTOMER_PO_NO(String CUSTOMER_PO_NO) {
        this.CUSTOMER_PO_NO = CUSTOMER_PO_NO;
    }

    public String getCLIENT_REFERENCE_NO1() {
        return CLIENT_REFERENCE_NO1;
    }

    public void setCLIENT_REFERENCE_NO1(String CLIENT_REFERENCE_NO1) {
        this.CLIENT_REFERENCE_NO1 = CLIENT_REFERENCE_NO1;
    }

    public String getCLIENT_REFERENCE_NO2() {
        return CLIENT_REFERENCE_NO2;
    }

    public void setCLIENT_REFERENCE_NO2(String CLIENT_REFERENCE_NO2) {
        this.CLIENT_REFERENCE_NO2 = CLIENT_REFERENCE_NO2;
    }

    public String getRouting() {
        return Routing;
    }

    public void setRouting(String routing) {
        Routing = routing;
    }

    public String getReleasedFromNPI() {
        return ReleasedFromNPI;
    }

    public void setReleasedFromNPI(String releasedFromNPI) {
        ReleasedFromNPI = releasedFromNPI;
    }

    public String getReceipt_SN() {
        return Receipt_SN;
    }

    public void setReceipt_SN(String receipt_SN) {
        Receipt_SN = receipt_SN;
    }

    public String getBIN() {
        return BIN;
    }

    public void setBIN(String BIN) {
        this.BIN = BIN;
    }

    public String getTATinPROCESS() {
        return TATinPROCESS;
    }

    public void setTATinPROCESS(String TATinPROCESS) {
        this.TATinPROCESS = TATinPROCESS;
    }

    public String getPRODUCT_CLASS() {
        return PRODUCT_CLASS;
    }

    public void setPRODUCT_CLASS(String PRODUCT_CLASS) {
        this.PRODUCT_CLASS = PRODUCT_CLASS;
    }

    public String getDELIVERY() {
        return DELIVERY;
    }

    public void setDELIVERY(String DELIVERY) {
        this.DELIVERY = DELIVERY;
    }

    public String getPUT_ON_HOLD_DATE() {
        return PUT_ON_HOLD_DATE;
    }

    public void setPUT_ON_HOLD_DATE(String PUT_ON_HOLD_DATE) {
        this.PUT_ON_HOLD_DATE = PUT_ON_HOLD_DATE;
    }

    public String getRELEASED_MOVE_FROM_HOLD_DATE() {
        return RELEASED_MOVE_FROM_HOLD_DATE;
    }

    public void setRELEASED_MOVE_FROM_HOLD_DATE(String RELEASED_MOVE_FROM_HOLD_DATE) {
        this.RELEASED_MOVE_FROM_HOLD_DATE = RELEASED_MOVE_FROM_HOLD_DATE;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getInvtoryNotes() {
        return InvtoryNotes;
    }

    public void setInvtoryNotes(String invtoryNotes) {
        InvtoryNotes = invtoryNotes;
    }

    public String getRO_CREATED_TIMESTAMP() {
        return RO_CREATED_TIMESTAMP;
    }

    public void setRO_CREATED_TIMESTAMP(String RO_CREATED_TIMESTAMP) {
        this.RO_CREATED_TIMESTAMP = RO_CREATED_TIMESTAMP;
    }

    public String getCALL_TYPE() {
        return CALL_TYPE;
    }

    public void setCALL_TYPE(String CALL_TYPE) {
        this.CALL_TYPE = CALL_TYPE;
    }

    public String getVIP_UNIT() {
        return VIP_UNIT;
    }

    public void setVIP_UNIT(String VIP_UNIT) {
        this.VIP_UNIT = VIP_UNIT;
    }

    public String getNFF_SOFTWARE() {
        return NFF_SOFTWARE;
    }

    public void setNFF_SOFTWARE(String NFF_SOFTWARE) {
        this.NFF_SOFTWARE = NFF_SOFTWARE;
    }

    public String getNFF_OTHER_INF() {
        return NFF_OTHER_INF;
    }

    public void setNFF_OTHER_INF(String NFF_OTHER_INF) {
        this.NFF_OTHER_INF = NFF_OTHER_INF;
    }

    public String getINTERNAL_NOTES() {
        return INTERNAL_NOTES;
    }

    public void setINTERNAL_NOTES(String INTERNAL_NOTES) {
        this.INTERNAL_NOTES = INTERNAL_NOTES;
    }

    public String getCANCELLATION_REASON() {
        return CANCELLATION_REASON;
    }

    public void setCANCELLATION_REASON(String CANCELLATION_REASON) {
        this.CANCELLATION_REASON = CANCELLATION_REASON;
    }

    public String getDEVICE_INTERFACE() {
        return DEVICE_INTERFACE;
    }

    public void setDEVICE_INTERFACE(String DEVICE_INTERFACE) {
        this.DEVICE_INTERFACE = DEVICE_INTERFACE;
    }

    public String getFUSION_CREATED_DATE() {
        return FUSION_CREATED_DATE;
    }

    public void setFUSION_CREATED_DATE(String FUSION_CREATED_DATE) {
        this.FUSION_CREATED_DATE = FUSION_CREATED_DATE;
    }

    public String getWI_FUSION() {
        return WI_FUSION;
    }

    public void setWI_FUSION(String WI_FUSION) {
        this.WI_FUSION = WI_FUSION;
    }

    public String getSERVICE_EVENT() {
        return SERVICE_EVENT;
    }

    public void setSERVICE_EVENT(String SERVICE_EVENT) {
        this.SERVICE_EVENT = SERVICE_EVENT;
    }

    public String getSERVICE_STATUS() {
        return SERVICE_STATUS;
    }

    public void setSERVICE_STATUS(String SERVICE_STATUS) {
        this.SERVICE_STATUS = SERVICE_STATUS;
    }

    public String getORIGINAL_COUNTRY() {
        return ORIGINAL_COUNTRY;
    }

    public void setORIGINAL_COUNTRY(String ORIGINAL_COUNTRY) {
        this.ORIGINAL_COUNTRY = ORIGINAL_COUNTRY;
    }

    public String getRETAILER() {
        return RETAILER;
    }

    public void setRETAILER(String RETAILER) {
        this.RETAILER = RETAILER;
    }

    public String getNFF_SPEC_ACCES() {
        return NFF_SPEC_ACCES;
    }

    public void setNFF_SPEC_ACCES(String NFF_SPEC_ACCES) {
        this.NFF_SPEC_ACCES = NFF_SPEC_ACCES;
    }

    public String getADDITIONAL_INFORMATION() {
        return ADDITIONAL_INFORMATION;
    }

    public void setADDITIONAL_INFORMATION(String ADDITIONAL_INFORMATION) {
        this.ADDITIONAL_INFORMATION = ADDITIONAL_INFORMATION;
    }

    public String getEXCEPTION_CODE() {
        return EXCEPTION_CODE;
    }

    public void setEXCEPTION_CODE(String EXCEPTION_CODE) {
        this.EXCEPTION_CODE = EXCEPTION_CODE;
    }

    public String getREVISION_LEVEL() {
        return REVISION_LEVEL;
    }

    public void setREVISION_LEVEL(String REVISION_LEVEL) {
        this.REVISION_LEVEL = REVISION_LEVEL;
    }
}
