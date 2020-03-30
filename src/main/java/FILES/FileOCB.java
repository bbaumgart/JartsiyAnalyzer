package FILES;

import java.util.Objects;

public class FileOCB {

    private String Report_Date;
    private String Region;
    private String Sub_Region_Code;
    private String Country;
    private String DPS_Number;
    private String DPS_Type;
    private String Call_Type;
    private String DSP_NAME;
    private String DLP_Name;
    private String Dispatch_Approved_Date;
    private String Service_Incident_Queue_Date;
    private String Parts_Status;
    private String Labor_Status;
    private String Billing_Company;
    private String Billing_Contact;
    private String City;
    private String Service_Tag;
    private String With_in_SLA_Window;
    private String Activity_Status;
    private String Reporting_Age;
    private String Overdue_Flag;
    private String Overdue_Date;
    private String ISP_Service_Window_Start;
    private String ISP_Service_Window_End;
    private String SLA_END_DT;
    private String FSD_Overdue_Flag;
    private String Employee_Group_Name;
    private String Location;
    private String Jack;
    private String Employee_Manager_Badge_Number;
    private String LOB_Group;
    private String Group_Desc;
    private String Activity_Alarm_Flag;
    private String Defer_Date;
    private String Defer_Call;
    private String Def_Preferred_Time;
    private String Business_Unit_Desc;
    private String Billable_Flag_B2C_or_B2D;
    private String ISP_Reference;
    private String State;
    private String Alternate_Customer_;
    private String DSP_Code;
    private String DPS_Created_Time;
    private String SLA;
    private String Responsibility;
    private String Cutoff;
    private String Service_Type_Code;
    private String Activity_Closed_Date;
    private String Quote_Created;
    private String Activity_Creator_Group;
    private String Created_By;
    private String Time_Zone;
    private String Activity_Type;
    private String ISP_Oconus_System;
    private String ISP_Oconus_BUID;
    private String Activity_Created_Date;
    private String Last_Upd_Date;
    private String DPS_CreatedLocal;
    private String Entitlement_Name;
    private String No_Of_Holidays;
    private String DPS_and_Call_Type;
    private String Transport_DLP;
    private String SLA_DPS_Type;
    private String Service_Request_Number;
    private String DOSD;
    private String Source;
    private String of_Activities;
    private String Customer;
    private String Account_Name;
    private String Description;
    private String Last_Exception_Code_Flag;
    private String Last_Exception_Description;
    private String Delta_Reply_Code_Descriptin;
    private String ISP_Sequence;
    private String Delta_Reply_Code;
    private String Latest_Reply_Code;
    private String Responsibility_age_Carrier;
    private String Responsibility_age_CIS;
    private String Responsibility_age_CIS_Center;
    private String Responsibility_age_Dell_TS;
    private String Responsibility_age_DLP;
    private String Responsibility_age_DSP;
    private String Responsibility_age_Frieght;
    private String Responsibility_age_GCC;
    private String Responsibility_age_Parts;
    private String Responsibility_age_TS;
    private String DSP_Schedule_Windows_End_Date;
    private String DSP_Schedule_Windows_Start_Date;
    private String Strategic_Customer_Flag;
    private String Parent_Account;
    private String Parent_Account_Name;
    private String TAM_Name;
    private String OCB_Aging;

    public FileOCB(String report_Date, String region, String sub_Region_Code, String country, String DPS_Number, String DPS_Type, String call_Type, String DSP_NAME, String DLP_Name, String dispatch_Approved_Date, String service_Incident_Queue_Date, String parts_Status, String labor_Status, String billing_Company, String billing_Contact, String city, String service_Tag, String with_in_SLA_Window, String activity_Status, String reporting_Age, String overdue_Flag, String overdue_Date, String ISP_Service_Window_Start, String ISP_Service_Window_End, String SLA_END_DT, String FSD_Overdue_Flag, String employee_Group_Name, String location, String jack, String employee_Manager_Badge_Number, String LOB_Group, String group_Desc, String activity_Alarm_Flag, String defer_Date, String defer_Call, String def_Preferred_Time, String business_Unit_Desc, String billable_Flag_B2C_or_B2D, String ISP_Reference, String state, String alternate_Customer_, String DSP_Code, String DPS_Created_Time, String SLA, String responsibility, String cutoff, String service_Type_Code, String activity_Closed_Date, String quote_Created, String activity_Creator_Group, String created_By, String time_Zone, String activity_Type, String ISP_Oconus_System, String ISP_Oconus_BUID, String activity_Created_Date, String last_Upd_Date, String DPS_CreatedLocal, String entitlement_Name, String no_Of_Holidays, String DPS_and_Call_Type, String transport_DLP, String SLA_DPS_Type, String service_Request_Number, String DOSD, String source, String of_Activities, String customer, String account_Name, String description, String last_Exception_Code_Flag, String last_Exception_Description, String delta_Reply_Code_Descriptin, String ISP_Sequence, String delta_Reply_Code, String latest_Reply_Code, String responsibility_age_Carrier, String responsibility_age_CIS, String responsibility_age_CIS_Center, String responsibility_age_Dell_TS, String responsibility_age_DLP, String responsibility_age_DSP, String responsibility_age_Frieght, String responsibility_age_GCC, String responsibility_age_Parts, String responsibility_age_TS, String DSP_Schedule_Windows_End_Date, String DSP_Schedule_Windows_Start_Date, String strategic_Customer_Flag, String parent_Account, String parent_Account_Name, String TAM_Name, String OCB_Aging) {
        Report_Date = report_Date;
        Region = region;
        Sub_Region_Code = sub_Region_Code;
        Country = country;
        this.DPS_Number = DPS_Number;
        this.DPS_Type = DPS_Type;
        Call_Type = call_Type;
        this.DSP_NAME = DSP_NAME;
        this.DLP_Name = DLP_Name;
        Dispatch_Approved_Date = dispatch_Approved_Date;
        Service_Incident_Queue_Date = service_Incident_Queue_Date;
        Parts_Status = parts_Status;
        Labor_Status = labor_Status;
        Billing_Company = billing_Company;
        Billing_Contact = billing_Contact;
        City = city;
        Service_Tag = service_Tag;
        With_in_SLA_Window = with_in_SLA_Window;
        Activity_Status = activity_Status;
        Reporting_Age = reporting_Age;
        Overdue_Flag = overdue_Flag;
        Overdue_Date = overdue_Date;
        this.ISP_Service_Window_Start = ISP_Service_Window_Start;
        this.ISP_Service_Window_End = ISP_Service_Window_End;
        this.SLA_END_DT = SLA_END_DT;
        this.FSD_Overdue_Flag = FSD_Overdue_Flag;
        Employee_Group_Name = employee_Group_Name;
        Location = location;
        Jack = jack;
        Employee_Manager_Badge_Number = employee_Manager_Badge_Number;
        this.LOB_Group = LOB_Group;
        Group_Desc = group_Desc;
        Activity_Alarm_Flag = activity_Alarm_Flag;
        Defer_Date = defer_Date;
        Defer_Call = defer_Call;
        Def_Preferred_Time = def_Preferred_Time;
        Business_Unit_Desc = business_Unit_Desc;
        Billable_Flag_B2C_or_B2D = billable_Flag_B2C_or_B2D;
        this.ISP_Reference = ISP_Reference;
        State = state;
        Alternate_Customer_ = alternate_Customer_;
        this.DSP_Code = DSP_Code;
        this.DPS_Created_Time = DPS_Created_Time;
        this.SLA = SLA;
        Responsibility = responsibility;
        Cutoff = cutoff;
        Service_Type_Code = service_Type_Code;
        Activity_Closed_Date = activity_Closed_Date;
        Quote_Created = quote_Created;
        Activity_Creator_Group = activity_Creator_Group;
        Created_By = created_By;
        Time_Zone = time_Zone;
        Activity_Type = activity_Type;
        this.ISP_Oconus_System = ISP_Oconus_System;
        this.ISP_Oconus_BUID = ISP_Oconus_BUID;
        Activity_Created_Date = activity_Created_Date;
        Last_Upd_Date = last_Upd_Date;
        this.DPS_CreatedLocal = DPS_CreatedLocal;
        Entitlement_Name = entitlement_Name;
        No_Of_Holidays = no_Of_Holidays;
        this.DPS_and_Call_Type = DPS_and_Call_Type;
        Transport_DLP = transport_DLP;
        this.SLA_DPS_Type = SLA_DPS_Type;
        Service_Request_Number = service_Request_Number;
        this.DOSD = DOSD;
        Source = source;
        this.of_Activities = of_Activities;
        Customer = customer;
        Account_Name = account_Name;
        Description = description;
        Last_Exception_Code_Flag = last_Exception_Code_Flag;
        Last_Exception_Description = last_Exception_Description;
        Delta_Reply_Code_Descriptin = delta_Reply_Code_Descriptin;
        this.ISP_Sequence = ISP_Sequence;
        Delta_Reply_Code = delta_Reply_Code;
        Latest_Reply_Code = latest_Reply_Code;
        Responsibility_age_Carrier = responsibility_age_Carrier;
        Responsibility_age_CIS = responsibility_age_CIS;
        Responsibility_age_CIS_Center = responsibility_age_CIS_Center;
        Responsibility_age_Dell_TS = responsibility_age_Dell_TS;
        Responsibility_age_DLP = responsibility_age_DLP;
        Responsibility_age_DSP = responsibility_age_DSP;
        Responsibility_age_Frieght = responsibility_age_Frieght;
        Responsibility_age_GCC = responsibility_age_GCC;
        Responsibility_age_Parts = responsibility_age_Parts;
        Responsibility_age_TS = responsibility_age_TS;
        this.DSP_Schedule_Windows_End_Date = DSP_Schedule_Windows_End_Date;
        this.DSP_Schedule_Windows_Start_Date = DSP_Schedule_Windows_Start_Date;
        Strategic_Customer_Flag = strategic_Customer_Flag;
        Parent_Account = parent_Account;
        Parent_Account_Name = parent_Account_Name;
        this.TAM_Name = TAM_Name;
        this.OCB_Aging = OCB_Aging;
        int quantity = 1;
    }

    public FileOCB() {
    }

    public FileOCB(FileOCB fileOCB, FileWIP fileWIP) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileOCB fileOCB = (FileOCB) o;
        return Objects.equals(Report_Date, fileOCB.Report_Date) &&
                Objects.equals(Region, fileOCB.Region) &&
                Objects.equals(Sub_Region_Code, fileOCB.Sub_Region_Code) &&
                Objects.equals(Country, fileOCB.Country) &&
                Objects.equals(DPS_Number, fileOCB.DPS_Number) &&
                Objects.equals(DPS_Type, fileOCB.DPS_Type) &&
                Objects.equals(Call_Type, fileOCB.Call_Type) &&
                Objects.equals(DSP_NAME, fileOCB.DSP_NAME) &&
                Objects.equals(DLP_Name, fileOCB.DLP_Name) &&
                Objects.equals(Dispatch_Approved_Date, fileOCB.Dispatch_Approved_Date) &&
                Objects.equals(Service_Incident_Queue_Date, fileOCB.Service_Incident_Queue_Date) &&
                Objects.equals(Parts_Status, fileOCB.Parts_Status) &&
                Objects.equals(Labor_Status, fileOCB.Labor_Status) &&
                Objects.equals(Billing_Company, fileOCB.Billing_Company) &&
                Objects.equals(Billing_Contact, fileOCB.Billing_Contact) &&
                Objects.equals(City, fileOCB.City) &&
                Objects.equals(Service_Tag, fileOCB.Service_Tag) &&
                Objects.equals(With_in_SLA_Window, fileOCB.With_in_SLA_Window) &&
                Objects.equals(Activity_Status, fileOCB.Activity_Status) &&
                Objects.equals(Reporting_Age, fileOCB.Reporting_Age) &&
                Objects.equals(Overdue_Flag, fileOCB.Overdue_Flag) &&
                Objects.equals(Overdue_Date, fileOCB.Overdue_Date) &&
                Objects.equals(ISP_Service_Window_Start, fileOCB.ISP_Service_Window_Start) &&
                Objects.equals(ISP_Service_Window_End, fileOCB.ISP_Service_Window_End) &&
                Objects.equals(SLA_END_DT, fileOCB.SLA_END_DT) &&
                Objects.equals(FSD_Overdue_Flag, fileOCB.FSD_Overdue_Flag) &&
                Objects.equals(Employee_Group_Name, fileOCB.Employee_Group_Name) &&
                Objects.equals(Location, fileOCB.Location) &&
                Objects.equals(Jack, fileOCB.Jack) &&
                Objects.equals(Employee_Manager_Badge_Number, fileOCB.Employee_Manager_Badge_Number) &&
                Objects.equals(LOB_Group, fileOCB.LOB_Group) &&
                Objects.equals(Group_Desc, fileOCB.Group_Desc) &&
                Objects.equals(Activity_Alarm_Flag, fileOCB.Activity_Alarm_Flag) &&
                Objects.equals(Defer_Date, fileOCB.Defer_Date) &&
                Objects.equals(Defer_Call, fileOCB.Defer_Call) &&
                Objects.equals(Def_Preferred_Time, fileOCB.Def_Preferred_Time) &&
                Objects.equals(Business_Unit_Desc, fileOCB.Business_Unit_Desc) &&
                Objects.equals(Billable_Flag_B2C_or_B2D, fileOCB.Billable_Flag_B2C_or_B2D) &&
                Objects.equals(ISP_Reference, fileOCB.ISP_Reference) &&
                Objects.equals(State, fileOCB.State) &&
                Objects.equals(Alternate_Customer_, fileOCB.Alternate_Customer_) &&
                Objects.equals(DSP_Code, fileOCB.DSP_Code) &&
                Objects.equals(DPS_Created_Time, fileOCB.DPS_Created_Time) &&
                Objects.equals(SLA, fileOCB.SLA) &&
                Objects.equals(Responsibility, fileOCB.Responsibility) &&
                Objects.equals(Cutoff, fileOCB.Cutoff) &&
                Objects.equals(Service_Type_Code, fileOCB.Service_Type_Code) &&
                Objects.equals(Activity_Closed_Date, fileOCB.Activity_Closed_Date) &&
                Objects.equals(Quote_Created, fileOCB.Quote_Created) &&
                Objects.equals(Activity_Creator_Group, fileOCB.Activity_Creator_Group) &&
                Objects.equals(Created_By, fileOCB.Created_By) &&
                Objects.equals(Time_Zone, fileOCB.Time_Zone) &&
                Objects.equals(Activity_Type, fileOCB.Activity_Type) &&
                Objects.equals(ISP_Oconus_System, fileOCB.ISP_Oconus_System) &&
                Objects.equals(ISP_Oconus_BUID, fileOCB.ISP_Oconus_BUID) &&
                Objects.equals(Activity_Created_Date, fileOCB.Activity_Created_Date) &&
                Objects.equals(Last_Upd_Date, fileOCB.Last_Upd_Date) &&
                Objects.equals(DPS_CreatedLocal, fileOCB.DPS_CreatedLocal) &&
                Objects.equals(Entitlement_Name, fileOCB.Entitlement_Name) &&
                Objects.equals(No_Of_Holidays, fileOCB.No_Of_Holidays) &&
                Objects.equals(DPS_and_Call_Type, fileOCB.DPS_and_Call_Type) &&
                Objects.equals(Transport_DLP, fileOCB.Transport_DLP) &&
                Objects.equals(SLA_DPS_Type, fileOCB.SLA_DPS_Type) &&
                Objects.equals(Service_Request_Number, fileOCB.Service_Request_Number) &&
                Objects.equals(DOSD, fileOCB.DOSD) &&
                Objects.equals(Source, fileOCB.Source) &&
                Objects.equals(of_Activities, fileOCB.of_Activities) &&
                Objects.equals(Customer, fileOCB.Customer) &&
                Objects.equals(Account_Name, fileOCB.Account_Name) &&
                Objects.equals(Description, fileOCB.Description) &&
                Objects.equals(Last_Exception_Code_Flag, fileOCB.Last_Exception_Code_Flag) &&
                Objects.equals(Last_Exception_Description, fileOCB.Last_Exception_Description) &&
                Objects.equals(Delta_Reply_Code_Descriptin, fileOCB.Delta_Reply_Code_Descriptin) &&
                Objects.equals(ISP_Sequence, fileOCB.ISP_Sequence) &&
                Objects.equals(Delta_Reply_Code, fileOCB.Delta_Reply_Code) &&
                Objects.equals(Latest_Reply_Code, fileOCB.Latest_Reply_Code) &&
                Objects.equals(Responsibility_age_Carrier, fileOCB.Responsibility_age_Carrier) &&
                Objects.equals(Responsibility_age_CIS, fileOCB.Responsibility_age_CIS) &&
                Objects.equals(Responsibility_age_CIS_Center, fileOCB.Responsibility_age_CIS_Center) &&
                Objects.equals(Responsibility_age_Dell_TS, fileOCB.Responsibility_age_Dell_TS) &&
                Objects.equals(Responsibility_age_DLP, fileOCB.Responsibility_age_DLP) &&
                Objects.equals(Responsibility_age_DSP, fileOCB.Responsibility_age_DSP) &&
                Objects.equals(Responsibility_age_Frieght, fileOCB.Responsibility_age_Frieght) &&
                Objects.equals(Responsibility_age_GCC, fileOCB.Responsibility_age_GCC) &&
                Objects.equals(Responsibility_age_Parts, fileOCB.Responsibility_age_Parts) &&
                Objects.equals(Responsibility_age_TS, fileOCB.Responsibility_age_TS) &&
                Objects.equals(DSP_Schedule_Windows_End_Date, fileOCB.DSP_Schedule_Windows_End_Date) &&
                Objects.equals(DSP_Schedule_Windows_Start_Date, fileOCB.DSP_Schedule_Windows_Start_Date) &&
                Objects.equals(Strategic_Customer_Flag, fileOCB.Strategic_Customer_Flag) &&
                Objects.equals(Parent_Account, fileOCB.Parent_Account) &&
                Objects.equals(Parent_Account_Name, fileOCB.Parent_Account_Name) &&
                Objects.equals(TAM_Name, fileOCB.TAM_Name) &&
                Objects.equals(OCB_Aging, fileOCB.OCB_Aging);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Report_Date, Region, Sub_Region_Code, Country, DPS_Number, DPS_Type, Call_Type, DSP_NAME, DLP_Name, Dispatch_Approved_Date, Service_Incident_Queue_Date, Parts_Status, Labor_Status, Billing_Company, Billing_Contact, City, Service_Tag, With_in_SLA_Window, Activity_Status, Reporting_Age, Overdue_Flag, Overdue_Date, ISP_Service_Window_Start, ISP_Service_Window_End, SLA_END_DT, FSD_Overdue_Flag, Employee_Group_Name, Location, Jack, Employee_Manager_Badge_Number, LOB_Group, Group_Desc, Activity_Alarm_Flag, Defer_Date, Defer_Call, Def_Preferred_Time, Business_Unit_Desc, Billable_Flag_B2C_or_B2D, ISP_Reference, State, Alternate_Customer_, DSP_Code, DPS_Created_Time, SLA, Responsibility, Cutoff, Service_Type_Code, Activity_Closed_Date, Quote_Created, Activity_Creator_Group, Created_By, Time_Zone, Activity_Type, ISP_Oconus_System, ISP_Oconus_BUID, Activity_Created_Date, Last_Upd_Date, DPS_CreatedLocal, Entitlement_Name, No_Of_Holidays, DPS_and_Call_Type, Transport_DLP, SLA_DPS_Type, Service_Request_Number, DOSD, Source, of_Activities, Customer, Account_Name, Description, Last_Exception_Code_Flag, Last_Exception_Description, Delta_Reply_Code_Descriptin, ISP_Sequence, Delta_Reply_Code, Latest_Reply_Code, Responsibility_age_Carrier, Responsibility_age_CIS, Responsibility_age_CIS_Center, Responsibility_age_Dell_TS, Responsibility_age_DLP, Responsibility_age_DSP, Responsibility_age_Frieght, Responsibility_age_GCC, Responsibility_age_Parts, Responsibility_age_TS, DSP_Schedule_Windows_End_Date, DSP_Schedule_Windows_Start_Date, Strategic_Customer_Flag, Parent_Account, Parent_Account_Name, TAM_Name, OCB_Aging);
    }

    @Override
    public String toString() {
        return "FileOCB{" +
                "Report_Date='" + Report_Date + '\'' +
                ", Region='" + Region + '\'' +
                ", Sub_Region_Code='" + Sub_Region_Code + '\'' +
                ", Country='" + Country + '\'' +
                ", DPS_Number='" + DPS_Number + '\'' +
                ", DPS_Type='" + DPS_Type + '\'' +
                ", Call_Type='" + Call_Type + '\'' +
                ", DSP_NAME='" + DSP_NAME + '\'' +
                ", DLP_Name='" + DLP_Name + '\'' +
                ", Dispatch_Approved_Date='" + Dispatch_Approved_Date + '\'' +
                ", Service_Incident_Queue_Date='" + Service_Incident_Queue_Date + '\'' +
                ", Parts_Status='" + Parts_Status + '\'' +
                ", Labor_Status='" + Labor_Status + '\'' +
                ", Billing_Company='" + Billing_Company + '\'' +
                ", Billing_Contact='" + Billing_Contact + '\'' +
                ", City='" + City + '\'' +
                ", Service_Tag='" + Service_Tag + '\'' +
                ", With_in_SLA_Window='" + With_in_SLA_Window + '\'' +
                ", Activity_Status='" + Activity_Status + '\'' +
                ", Reporting_Age='" + Reporting_Age + '\'' +
                ", Overdue_Flag='" + Overdue_Flag + '\'' +
                ", Overdue_Date='" + Overdue_Date + '\'' +
                ", ISP_Service_Window_Start='" + ISP_Service_Window_Start + '\'' +
                ", ISP_Service_Window_End='" + ISP_Service_Window_End + '\'' +
                ", SLA_END_DT='" + SLA_END_DT + '\'' +
                ", FSD_Overdue_Flag='" + FSD_Overdue_Flag + '\'' +
                ", Employee_Group_Name='" + Employee_Group_Name + '\'' +
                ", Location='" + Location + '\'' +
                ", Jack='" + Jack + '\'' +
                ", Employee_Manager_Badge_Number='" + Employee_Manager_Badge_Number + '\'' +
                ", LOB_Group='" + LOB_Group + '\'' +
                ", Group_Desc='" + Group_Desc + '\'' +
                ", Activity_Alarm_Flag='" + Activity_Alarm_Flag + '\'' +
                ", Defer_Date='" + Defer_Date + '\'' +
                ", Defer_Call='" + Defer_Call + '\'' +
                ", Def_Preferred_Time='" + Def_Preferred_Time + '\'' +
                ", Business_Unit_Desc='" + Business_Unit_Desc + '\'' +
                ", Billable_Flag_B2C_or_B2D='" + Billable_Flag_B2C_or_B2D + '\'' +
                ", ISP_Reference='" + ISP_Reference + '\'' +
                ", State='" + State + '\'' +
                ", Alternate_Customer_='" + Alternate_Customer_ + '\'' +
                ", DSP_Code='" + DSP_Code + '\'' +
                ", DPS_Created_Time='" + DPS_Created_Time + '\'' +
                ", SLA='" + SLA + '\'' +
                ", Responsibility='" + Responsibility + '\'' +
                ", Cutoff='" + Cutoff + '\'' +
                ", Service_Type_Code='" + Service_Type_Code + '\'' +
                ", Activity_Closed_Date='" + Activity_Closed_Date + '\'' +
                ", Quote_Created='" + Quote_Created + '\'' +
                ", Activity_Creator_Group='" + Activity_Creator_Group + '\'' +
                ", Created_By='" + Created_By + '\'' +
                ", Time_Zone='" + Time_Zone + '\'' +
                ", Activity_Type='" + Activity_Type + '\'' +
                ", ISP_Oconus_System='" + ISP_Oconus_System + '\'' +
                ", ISP_Oconus_BUID='" + ISP_Oconus_BUID + '\'' +
                ", Activity_Created_Date='" + Activity_Created_Date + '\'' +
                ", Last_Upd_Date='" + Last_Upd_Date + '\'' +
                ", DPS_CreatedLocal='" + DPS_CreatedLocal + '\'' +
                ", Entitlement_Name='" + Entitlement_Name + '\'' +
                ", No_Of_Holidays='" + No_Of_Holidays + '\'' +
                ", DPS_and_Call_Type='" + DPS_and_Call_Type + '\'' +
                ", Transport_DLP='" + Transport_DLP + '\'' +
                ", SLA_DPS_Type='" + SLA_DPS_Type + '\'' +
                ", Service_Request_Number='" + Service_Request_Number + '\'' +
                ", DOSD='" + DOSD + '\'' +
                ", Source='" + Source + '\'' +
                ", of_Activities='" + of_Activities + '\'' +
                ", Customer='" + Customer + '\'' +
                ", Account_Name='" + Account_Name + '\'' +
                ", Description='" + Description + '\'' +
                ", Last_Exception_Code_Flag='" + Last_Exception_Code_Flag + '\'' +
                ", Last_Exception_Description='" + Last_Exception_Description + '\'' +
                ", Delta_Reply_Code_Descriptin='" + Delta_Reply_Code_Descriptin + '\'' +
                ", ISP_Sequence='" + ISP_Sequence + '\'' +
                ", Delta_Reply_Code='" + Delta_Reply_Code + '\'' +
                ", Latest_Reply_Code='" + Latest_Reply_Code + '\'' +
                ", Responsibility_age_Carrier='" + Responsibility_age_Carrier + '\'' +
                ", Responsibility_age_CIS='" + Responsibility_age_CIS + '\'' +
                ", Responsibility_age_CIS_Center='" + Responsibility_age_CIS_Center + '\'' +
                ", Responsibility_age_Dell_TS='" + Responsibility_age_Dell_TS + '\'' +
                ", Responsibility_age_DLP='" + Responsibility_age_DLP + '\'' +
                ", Responsibility_age_DSP='" + Responsibility_age_DSP + '\'' +
                ", Responsibility_age_Frieght='" + Responsibility_age_Frieght + '\'' +
                ", Responsibility_age_GCC='" + Responsibility_age_GCC + '\'' +
                ", Responsibility_age_Parts='" + Responsibility_age_Parts + '\'' +
                ", Responsibility_age_TS='" + Responsibility_age_TS + '\'' +
                ", DSP_Schedule_Windows_End_Date='" + DSP_Schedule_Windows_End_Date + '\'' +
                ", DSP_Schedule_Windows_Start_Date='" + DSP_Schedule_Windows_Start_Date + '\'' +
                ", Strategic_Customer_Flag='" + Strategic_Customer_Flag + '\'' +
                ", Parent_Account='" + Parent_Account + '\'' +
                ", Parent_Account_Name='" + Parent_Account_Name + '\'' +
                ", TAM_Name='" + TAM_Name + '\'' +
                ", OCB_Aging='" + OCB_Aging + '\'' +
                '}';
    }

    public String getReport_Date() {
        return Report_Date;
    }

    public void setReport_Date(String report_Date) {
        Report_Date = report_Date;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getSub_Region_Code() {
        return Sub_Region_Code;
    }

    public void setSub_Region_Code(String sub_Region_Code) {
        Sub_Region_Code = sub_Region_Code;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getDPS_Number() {
        return DPS_Number;
    }

    public void setDPS_Number(String DPS_Number) {
        this.DPS_Number = DPS_Number;
    }

    public String getDPS_Type() {
        return DPS_Type;
    }

    public void setDPS_Type(String DPS_Type) {
        this.DPS_Type = DPS_Type;
    }

    public String getCall_Type() {
        return Call_Type;
    }

    public void setCall_Type(String call_Type) {
        Call_Type = call_Type;
    }

    public String getDSP_NAME() {
        return DSP_NAME;
    }

    public void setDSP_NAME(String DSP_NAME) {
        this.DSP_NAME = DSP_NAME;
    }

    public String getDLP_Name() {
        return DLP_Name;
    }

    public void setDLP_Name(String DLP_Name) {
        this.DLP_Name = DLP_Name;
    }

    public String getDispatch_Approved_Date() {
        return Dispatch_Approved_Date;
    }

    public void setDispatch_Approved_Date(String dispatch_Approved_Date) {
        Dispatch_Approved_Date = dispatch_Approved_Date;
    }

    public String getService_Incident_Queue_Date() {
        return Service_Incident_Queue_Date;
    }

    public void setService_Incident_Queue_Date(String service_Incident_Queue_Date) {
        Service_Incident_Queue_Date = service_Incident_Queue_Date;
    }

    public String getParts_Status() {
        return Parts_Status;
    }

    public void setParts_Status(String parts_Status) {
        Parts_Status = parts_Status;
    }

    public String getLabor_Status() {
        return Labor_Status;
    }

    public void setLabor_Status(String labor_Status) {
        Labor_Status = labor_Status;
    }

    public String getBilling_Company() {
        return Billing_Company;
    }

    public void setBilling_Company(String billing_Company) {
        Billing_Company = billing_Company;
    }

    public String getBilling_Contact() {
        return Billing_Contact;
    }

    public void setBilling_Contact(String billing_Contact) {
        Billing_Contact = billing_Contact;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getService_Tag() {
        return Service_Tag;
    }

    public void setService_Tag(String service_Tag) {
        Service_Tag = service_Tag;
    }

    public String getWith_in_SLA_Window() {
        return With_in_SLA_Window;
    }

    public void setWith_in_SLA_Window(String with_in_SLA_Window) {
        With_in_SLA_Window = with_in_SLA_Window;
    }

    public String getActivity_Status() {
        return Activity_Status;
    }

    public void setActivity_Status(String activity_Status) {
        Activity_Status = activity_Status;
    }

    public String getReporting_Age() {
        return Reporting_Age;
    }

    public void setReporting_Age(String reporting_Age) {
        Reporting_Age = reporting_Age;
    }

    public String getOverdue_Flag() {
        return Overdue_Flag;
    }

    public void setOverdue_Flag(String overdue_Flag) {
        Overdue_Flag = overdue_Flag;
    }

    public String getOverdue_Date() {
        return Overdue_Date;
    }

    public void setOverdue_Date(String overdue_Date) {
        Overdue_Date = overdue_Date;
    }

    public String getISP_Service_Window_Start() {
        return ISP_Service_Window_Start;
    }

    public void setISP_Service_Window_Start(String ISP_Service_Window_Start) {
        this.ISP_Service_Window_Start = ISP_Service_Window_Start;
    }

    public String getISP_Service_Window_End() {
        return ISP_Service_Window_End;
    }

    public void setISP_Service_Window_End(String ISP_Service_Window_End) {
        this.ISP_Service_Window_End = ISP_Service_Window_End;
    }

    public String getSLA_END_DT() {
        return SLA_END_DT;
    }

    public void setSLA_END_DT(String SLA_END_DT) {
        this.SLA_END_DT = SLA_END_DT;
    }

    public String getFSD_Overdue_Flag() {
        return FSD_Overdue_Flag;
    }

    public void setFSD_Overdue_Flag(String FSD_Overdue_Flag) {
        this.FSD_Overdue_Flag = FSD_Overdue_Flag;
    }

    public String getEmployee_Group_Name() {
        return Employee_Group_Name;
    }

    public void setEmployee_Group_Name(String employee_Group_Name) {
        Employee_Group_Name = employee_Group_Name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getJack() {
        return Jack;
    }

    public void setJack(String jack) {
        Jack = jack;
    }

    public String getEmployee_Manager_Badge_Number() {
        return Employee_Manager_Badge_Number;
    }

    public void setEmployee_Manager_Badge_Number(String employee_Manager_Badge_Number) {
        Employee_Manager_Badge_Number = employee_Manager_Badge_Number;
    }

    public String getLOB_Group() {
        return LOB_Group;
    }

    public void setLOB_Group(String LOB_Group) {
        this.LOB_Group = LOB_Group;
    }

    public String getGroup_Desc() {
        return Group_Desc;
    }

    public void setGroup_Desc(String group_Desc) {
        Group_Desc = group_Desc;
    }

    public String getActivity_Alarm_Flag() {
        return Activity_Alarm_Flag;
    }

    public void setActivity_Alarm_Flag(String activity_Alarm_Flag) {
        Activity_Alarm_Flag = activity_Alarm_Flag;
    }

    public String getDefer_Date() {
        return Defer_Date;
    }

    public void setDefer_Date(String defer_Date) {
        Defer_Date = defer_Date;
    }

    public String getDefer_Call() {
        return Defer_Call;
    }

    public void setDefer_Call(String defer_Call) {
        Defer_Call = defer_Call;
    }

    public String getDef_Preferred_Time() {
        return Def_Preferred_Time;
    }

    public void setDef_Preferred_Time(String def_Preferred_Time) {
        Def_Preferred_Time = def_Preferred_Time;
    }

    public String getBusiness_Unit_Desc() {
        return Business_Unit_Desc;
    }

    public void setBusiness_Unit_Desc(String business_Unit_Desc) {
        Business_Unit_Desc = business_Unit_Desc;
    }

    public String getBillable_Flag_B2C_or_B2D() {
        return Billable_Flag_B2C_or_B2D;
    }

    public void setBillable_Flag_B2C_or_B2D(String billable_Flag_B2C_or_B2D) {
        Billable_Flag_B2C_or_B2D = billable_Flag_B2C_or_B2D;
    }

    public String getISP_Reference() {
        return ISP_Reference;
    }

    public void setISP_Reference(String ISP_Reference) {
        this.ISP_Reference = ISP_Reference;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getAlternate_Customer_() {
        return Alternate_Customer_;
    }

    public void setAlternate_Customer_(String alternate_Customer_) {
        Alternate_Customer_ = alternate_Customer_;
    }

    public String getDSP_Code() {
        return DSP_Code;
    }

    public void setDSP_Code(String DSP_Code) {
        this.DSP_Code = DSP_Code;
    }

    public String getDPS_Created_Time() {
        return DPS_Created_Time;
    }

    public void setDPS_Created_Time(String DPS_Created_Time) {
        this.DPS_Created_Time = DPS_Created_Time;
    }

    public String getSLA() {
        return SLA;
    }

    public void setSLA(String SLA) {
        this.SLA = SLA;
    }

    public String getResponsibility() {
        return Responsibility;
    }

    public void setResponsibility(String responsibility) {
        Responsibility = responsibility;
    }

    public String getCutoff() {
        return Cutoff;
    }

    public void setCutoff(String cutoff) {
        Cutoff = cutoff;
    }

    public String getService_Type_Code() {
        return Service_Type_Code;
    }

    public void setService_Type_Code(String service_Type_Code) {
        Service_Type_Code = service_Type_Code;
    }

    public String getActivity_Closed_Date() {
        return Activity_Closed_Date;
    }

    public void setActivity_Closed_Date(String activity_Closed_Date) {
        Activity_Closed_Date = activity_Closed_Date;
    }

    public String getQuote_Created() {
        return Quote_Created;
    }

    public void setQuote_Created(String quote_Created) {
        Quote_Created = quote_Created;
    }

    public String getActivity_Creator_Group() {
        return Activity_Creator_Group;
    }

    public void setActivity_Creator_Group(String activity_Creator_Group) {
        Activity_Creator_Group = activity_Creator_Group;
    }

    public String getCreated_By() {
        return Created_By;
    }

    public void setCreated_By(String created_By) {
        Created_By = created_By;
    }

    public String getTime_Zone() {
        return Time_Zone;
    }

    public void setTime_Zone(String time_Zone) {
        Time_Zone = time_Zone;
    }

    public String getActivity_Type() {
        return Activity_Type;
    }

    public void setActivity_Type(String activity_Type) {
        Activity_Type = activity_Type;
    }

    public String getISP_Oconus_System() {
        return ISP_Oconus_System;
    }

    public void setISP_Oconus_System(String ISP_Oconus_System) {
        this.ISP_Oconus_System = ISP_Oconus_System;
    }

    public String getISP_Oconus_BUID() {
        return ISP_Oconus_BUID;
    }

    public void setISP_Oconus_BUID(String ISP_Oconus_BUID) {
        this.ISP_Oconus_BUID = ISP_Oconus_BUID;
    }

    public String getActivity_Created_Date() {
        return Activity_Created_Date;
    }

    public void setActivity_Created_Date(String activity_Created_Date) {
        Activity_Created_Date = activity_Created_Date;
    }

    public String getLast_Upd_Date() {
        return Last_Upd_Date;
    }

    public void setLast_Upd_Date(String last_Upd_Date) {
        Last_Upd_Date = last_Upd_Date;
    }

    public String getDPS_CreatedLocal() {
        return DPS_CreatedLocal;
    }

    public void setDPS_CreatedLocal(String DPS_CreatedLocal) {
        this.DPS_CreatedLocal = DPS_CreatedLocal;
    }

    public String getEntitlement_Name() {
        return Entitlement_Name;
    }

    public void setEntitlement_Name(String entitlement_Name) {
        Entitlement_Name = entitlement_Name;
    }

    public String getNo_Of_Holidays() {
        return No_Of_Holidays;
    }

    public void setNo_Of_Holidays(String no_Of_Holidays) {
        No_Of_Holidays = no_Of_Holidays;
    }

    public String getDPS_and_Call_Type() {
        return DPS_and_Call_Type;
    }

    public void setDPS_and_Call_Type(String DPS_and_Call_Type) {
        this.DPS_and_Call_Type = DPS_and_Call_Type;
    }

    public String getTransport_DLP() {
        return Transport_DLP;
    }

    public void setTransport_DLP(String transport_DLP) {
        Transport_DLP = transport_DLP;
    }

    public String getSLA_DPS_Type() {
        return SLA_DPS_Type;
    }

    public void setSLA_DPS_Type(String SLA_DPS_Type) {
        this.SLA_DPS_Type = SLA_DPS_Type;
    }

    public String getService_Request_Number() {
        return Service_Request_Number;
    }

    public void setService_Request_Number(String service_Request_Number) {
        Service_Request_Number = service_Request_Number;
    }

    public String getDOSD() {
        return DOSD;
    }

    public void setDOSD(String DOSD) {
        this.DOSD = DOSD;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getOf_Activities() {
        return of_Activities;
    }

    public void setOf_Activities(String of_Activities) {
        this.of_Activities = of_Activities;
    }

    public String getCustomer() {
        return Customer;
    }

    public void setCustomer(String customer) {
        Customer = customer;
    }

    public String getAccount_Name() {
        return Account_Name;
    }

    public void setAccount_Name(String account_Name) {
        Account_Name = account_Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getLast_Exception_Code_Flag() {
        return Last_Exception_Code_Flag;
    }

    public void setLast_Exception_Code_Flag(String last_Exception_Code_Flag) {
        Last_Exception_Code_Flag = last_Exception_Code_Flag;
    }

    public String getLast_Exception_Description() {
        return Last_Exception_Description;
    }

    public void setLast_Exception_Description(String last_Exception_Description) {
        Last_Exception_Description = last_Exception_Description;
    }

    public String getDelta_Reply_Code_Descriptin() {
        return Delta_Reply_Code_Descriptin;
    }

    public void setDelta_Reply_Code_Descriptin(String delta_Reply_Code_Descriptin) {
        Delta_Reply_Code_Descriptin = delta_Reply_Code_Descriptin;
    }

    public String getISP_Sequence() {
        return ISP_Sequence;
    }

    public void setISP_Sequence(String ISP_Sequence) {
        this.ISP_Sequence = ISP_Sequence;
    }

    public String getDelta_Reply_Code() {
        return Delta_Reply_Code;
    }

    public void setDelta_Reply_Code(String delta_Reply_Code) {
        Delta_Reply_Code = delta_Reply_Code;
    }

    public String getLatest_Reply_Code() {
        return Latest_Reply_Code;
    }

    public void setLatest_Reply_Code(String latest_Reply_Code) {
        Latest_Reply_Code = latest_Reply_Code;
    }

    public String getResponsibility_age_Carrier() {
        return Responsibility_age_Carrier;
    }

    public void setResponsibility_age_Carrier(String responsibility_age_Carrier) {
        Responsibility_age_Carrier = responsibility_age_Carrier;
    }

    public String getResponsibility_age_CIS() {
        return Responsibility_age_CIS;
    }

    public void setResponsibility_age_CIS(String responsibility_age_CIS) {
        Responsibility_age_CIS = responsibility_age_CIS;
    }

    public String getResponsibility_age_CIS_Center() {
        return Responsibility_age_CIS_Center;
    }

    public void setResponsibility_age_CIS_Center(String responsibility_age_CIS_Center) {
        Responsibility_age_CIS_Center = responsibility_age_CIS_Center;
    }

    public String getResponsibility_age_Dell_TS() {
        return Responsibility_age_Dell_TS;
    }

    public void setResponsibility_age_Dell_TS(String responsibility_age_Dell_TS) {
        Responsibility_age_Dell_TS = responsibility_age_Dell_TS;
    }

    public String getResponsibility_age_DLP() {
        return Responsibility_age_DLP;
    }

    public void setResponsibility_age_DLP(String responsibility_age_DLP) {
        Responsibility_age_DLP = responsibility_age_DLP;
    }

    public String getResponsibility_age_DSP() {
        return Responsibility_age_DSP;
    }

    public void setResponsibility_age_DSP(String responsibility_age_DSP) {
        Responsibility_age_DSP = responsibility_age_DSP;
    }

    public String getResponsibility_age_Frieght() {
        return Responsibility_age_Frieght;
    }

    public void setResponsibility_age_Frieght(String responsibility_age_Frieght) {
        Responsibility_age_Frieght = responsibility_age_Frieght;
    }

    public String getResponsibility_age_GCC() {
        return Responsibility_age_GCC;
    }

    public void setResponsibility_age_GCC(String responsibility_age_GCC) {
        Responsibility_age_GCC = responsibility_age_GCC;
    }

    public String getResponsibility_age_Parts() {
        return Responsibility_age_Parts;
    }

    public void setResponsibility_age_Parts(String responsibility_age_Parts) {
        Responsibility_age_Parts = responsibility_age_Parts;
    }

    public String getResponsibility_age_TS() {
        return Responsibility_age_TS;
    }

    public void setResponsibility_age_TS(String responsibility_age_TS) {
        Responsibility_age_TS = responsibility_age_TS;
    }

    public String getDSP_Schedule_Windows_End_Date() {
        return DSP_Schedule_Windows_End_Date;
    }

    public void setDSP_Schedule_Windows_End_Date(String DSP_Schedule_Windows_End_Date) {
        this.DSP_Schedule_Windows_End_Date = DSP_Schedule_Windows_End_Date;
    }

    public String getDSP_Schedule_Windows_Start_Date() {
        return DSP_Schedule_Windows_Start_Date;
    }

    public void setDSP_Schedule_Windows_Start_Date(String DSP_Schedule_Windows_Start_Date) {
        this.DSP_Schedule_Windows_Start_Date = DSP_Schedule_Windows_Start_Date;
    }

    public String getStrategic_Customer_Flag() {
        return Strategic_Customer_Flag;
    }

    public void setStrategic_Customer_Flag(String strategic_Customer_Flag) {
        Strategic_Customer_Flag = strategic_Customer_Flag;
    }

    public String getParent_Account() {
        return Parent_Account;
    }

    public void setParent_Account(String parent_Account) {
        Parent_Account = parent_Account;
    }

    public String getParent_Account_Name() {
        return Parent_Account_Name;
    }

    public void setParent_Account_Name(String parent_Account_Name) {
        Parent_Account_Name = parent_Account_Name;
    }

    public String getTAM_Name() {
        return TAM_Name;
    }

    public void setTAM_Name(String TAM_Name) {
        this.TAM_Name = TAM_Name;
    }

    public String getOCB_Aging() {
        return OCB_Aging;
    }

    public void setOCB_Aging(String OCB_Aging) {
        this.OCB_Aging = OCB_Aging;
    }
}
