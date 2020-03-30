package DailyDellCARPulsReport;

import FILES.FileDellCarReport;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ListToDailyDellCARPuls {

    private String DPS_Number;
    private String Service_Tag;
    private String Service_Request_Number;
    private String Country;
    private String Warranty;
    private String Call_Type;
    private String Entitlement_Type;
    private String Status;
    private String Sub_status;
    private String Aging_DCR;
    private String Aging_DCR_Holidays;
    private String Aging_OCB;
    private String Aging_Bucket;
    private String OCB_Overdue_Flag;
    private String Out_of_SLA_Flag;
    private String Out_of_SLA_Flag_GCC;
    private String DPS_Created_Date_By_DCR;
    private String Unit_Arrival_To_Depot_Date;
    private String Ship_Date;
    private String POD_Date;
    private String Order_Status_DCR;
    private String Storage_Hold_Code;
    private String Storage_Hold_Code_Desc;
    private String Destination_Workcenter;
    private String Current_Workcenter;
    private String Hold_Status;
    private String owner;
    private String ExceptionCode;
    private String Location;
    private String Historic_iQor;
    private String Activity_Creator_Group;
    private String Last_Update;
    private String Incident_Number;
    private String ADDITIONAL_INFORMATION;
    private String InvtoryNotes;
    private String OCB_backlog_breakdown;
    private String OCB_breakdown;
    private String DaysOverSLA;
    private String DaysOnCurrentHold;
    private String Warranty2;
    private String ProcessType;
    private String Owner2;
    private String HoldDaysTotal;
    private String CtpIncydentCreateDate;
    private String CtpType;
    private String CtpIncydentAge;
    private String DeliveryTracking;
    private String BiggestContributorOfDelay;
    private List<DpsHistoryWithAging> dpsHistoryWithAging;
    private String InboundAging;
    private String WipAging;
    private String OutboundAging;

    public ListToDailyDellCARPuls(FileDellCarReport fileDellCarReport) {

        this.DPS_Number = fileDellCarReport.getDPS();
        Service_Tag = fileDellCarReport.getServiceTag();
        Service_Request_Number = "";
        Country = fileDellCarReport.getCountry();
        Warranty = "";
        Call_Type = fileDellCarReport.getCallType();
        Entitlement_Type = "";
        Status = "";
        Sub_status = "";
        Aging_DCR = fileDellCarReport.getTATwithoutEXEcodeToPOD().trim();
        Aging_DCR_Holidays = "";
        Aging_OCB = "";
        Aging_Bucket = "";
        this.OCB_Overdue_Flag = "";
        Out_of_SLA_Flag = "";
        Out_of_SLA_Flag_GCC = "";
        DPS_Created_Date_By_DCR = fileDellCarReport.getCallCreateDate();
        Unit_Arrival_To_Depot_Date = fileDellCarReport.getUnitArrivalToDepotDate();
        Ship_Date = fileDellCarReport.getShipAndClosedDate();
        POD_Date = fileDellCarReport.getUnitDeliveryToCustomerDate();
        Order_Status_DCR = fileDellCarReport.getOrderStatus();
        Storage_Hold_Code = "";
        Storage_Hold_Code_Desc = "";
        Destination_Workcenter = "";
        Current_Workcenter = "";
        Hold_Status = "";
        owner = "";
        ExceptionCode = fileDellCarReport.getCurrentExceptionCode();
        Location = "";
        Historic_iQor = "";
        Activity_Creator_Group = "";
        Last_Update = "";
        Incident_Number = "";
        ADDITIONAL_INFORMATION = "";
        InvtoryNotes = "";
        OCB_backlog_breakdown = "";
        OCB_breakdown = "";
        DaysOverSLA = "";
        DaysOnCurrentHold = "";
        ProcessType = "";
        Owner2 = "";
        HoldDaysTotal = "";
        CtpIncydentCreateDate = "";
        CtpType = "";
        CtpIncydentAge = "";
        DeliveryTracking =fileDellCarReport.getDeliveryTR();
        BiggestContributorOfDelay ="";
        InboundAging="0";
        WipAging="0";
        OutboundAging="0";
    }
}