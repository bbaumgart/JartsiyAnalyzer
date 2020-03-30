package DailyDellCARPulsReport;

import FILES.FileWI;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NeedDellSupport {

    private String ARC;
    private String BIN;
    private String Call_Create_Date;
    private String Country_Code;
    private String DAYS_ON_HOLD;
    private String DPS_NO;
    private String FUSION_CREATED_DATE;
    private String LAST_UPDATE;
    private String STORAGE_HOLD_CODE;
    private String TAT;
    private String WI_DYSP;
    private String WI_FUSION;
    private String FUSION_AGING;
    private String Owner;
    private String Warranty;
    private String Warranty2;
    private String Entitlement_Type;

    public NeedDellSupport(ListToDailyDellCARPuls fileNeedDellSupport, FileWI fileWI) {
        ARC = fileWI.getARC();
        BIN = fileWI.getBIN();
        Call_Create_Date = fileNeedDellSupport.getDPS_Created_Date_By_DCR();
        Country_Code = fileNeedDellSupport.getCountry();
        DAYS_ON_HOLD = fileWI.getDAYS_ON_HOLD();
        DPS_NO = fileNeedDellSupport.getDPS_Number();
        FUSION_CREATED_DATE = fileWI.getFUSION_CREATED_DATE();
        LAST_UPDATE = fileWI.getLAST_UPDATE();
        STORAGE_HOLD_CODE = fileNeedDellSupport.getStorage_Hold_Code();
        TAT = fileWI.getTAT();
        WI_DYSP = fileWI.getWI_DYSP();
        WI_FUSION = fileWI.getWI_FUSION();
        FUSION_AGING = "";
        Owner = fileNeedDellSupport.getOwner();
        Warranty = fileNeedDellSupport.getWarranty();
        Warranty2 = fileNeedDellSupport.getWarranty2();
        Entitlement_Type = fileNeedDellSupport.getEntitlement_Type();
    }
}
