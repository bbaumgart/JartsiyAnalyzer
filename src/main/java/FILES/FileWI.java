package FILES;

import java.util.Objects;

public class FileWI {

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

    public FileWI(String ARC, String BIN, String call_Create_Date, String country_Code, String DAYS_ON_HOLD, String DPS_NO, String FUSION_CREATED_DATE, String LAST_UPDATE, String STORAGE_HOLD_CODE, String TAT, String WI_DYSP, String WI_FUSION) {
        this.ARC = ARC;
        this.BIN = BIN;
        Call_Create_Date = call_Create_Date;
        Country_Code = country_Code;
        this.DAYS_ON_HOLD = DAYS_ON_HOLD;
        this.DPS_NO = DPS_NO;
        this.FUSION_CREATED_DATE = FUSION_CREATED_DATE;
        this.LAST_UPDATE = LAST_UPDATE;
        this.STORAGE_HOLD_CODE = STORAGE_HOLD_CODE;
        this.TAT = TAT;
        this.WI_DYSP = WI_DYSP;
        this.WI_FUSION = WI_FUSION;
        this.FUSION_AGING = FUSION_AGING;
    }

    public FileWI() {
    }

    @Override
    public String toString() {
        return "FileWI{" +
                "ARC='" + ARC + '\'' +
                ", BIN='" + BIN + '\'' +
                ", Call_Create_Date='" + Call_Create_Date + '\'' +
                ", Country_Code='" + Country_Code + '\'' +
                ", DAYS_ON_HOLD='" + DAYS_ON_HOLD + '\'' +
                ", DPS_NO='" + DPS_NO + '\'' +
                ", FUSION_CREATED_DATE='" + FUSION_CREATED_DATE + '\'' +
                ", LAST_UPDATE='" + LAST_UPDATE + '\'' +
                ", STORAGE_HOLD_CODE='" + STORAGE_HOLD_CODE + '\'' +
                ", TAT='" + TAT + '\'' +
                ", WI_DYSP='" + WI_DYSP + '\'' +
                ", WI_FUSION='" + WI_FUSION + '\'' +
                ", FUSION_AGING='" + FUSION_AGING + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileWI fileWI = (FileWI) o;
        return Objects.equals(ARC, fileWI.ARC) &&
                Objects.equals(BIN, fileWI.BIN) &&
                Objects.equals(Call_Create_Date, fileWI.Call_Create_Date) &&
                Objects.equals(Country_Code, fileWI.Country_Code) &&
                Objects.equals(DAYS_ON_HOLD, fileWI.DAYS_ON_HOLD) &&
                Objects.equals(DPS_NO, fileWI.DPS_NO) &&
                Objects.equals(FUSION_CREATED_DATE, fileWI.FUSION_CREATED_DATE) &&
                Objects.equals(LAST_UPDATE, fileWI.LAST_UPDATE) &&
                Objects.equals(STORAGE_HOLD_CODE, fileWI.STORAGE_HOLD_CODE) &&
                Objects.equals(TAT, fileWI.TAT) &&
                Objects.equals(WI_DYSP, fileWI.WI_DYSP) &&
                Objects.equals(WI_FUSION, fileWI.WI_FUSION)&&
                Objects.equals(FUSION_AGING, fileWI.FUSION_AGING);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ARC, BIN, Call_Create_Date, Country_Code, DAYS_ON_HOLD, DPS_NO, FUSION_CREATED_DATE, LAST_UPDATE, STORAGE_HOLD_CODE, TAT, WI_DYSP, WI_FUSION, FUSION_AGING);
    }

    public String getARC() {
        return ARC;
    }
    public void setARC(String ARC) {
        this.ARC = ARC;
    }
    public String getBIN() {
        return BIN;
    }
    public void setBIN(String BIN) {
        this.BIN = BIN;
    }
    public String getCall_Create_Date() {
        return Call_Create_Date;
    }
    public void setCall_Create_Date(String call_Create_Date) {
        Call_Create_Date = call_Create_Date;
    }
    public String getCountry_Code() {
        return Country_Code;
    }
    public void setCountry_Code(String country_Code) {
        Country_Code = country_Code;
    }
    public String getDAYS_ON_HOLD() {
        return DAYS_ON_HOLD;
    }
    public void setDAYS_ON_HOLD(String DAYS_ON_HOLD) {
        this.DAYS_ON_HOLD = DAYS_ON_HOLD;
    }
    public String getDPS_NO() {
        return DPS_NO;
    }
    public void setDPS_NO(String DPS_NO) {
        this.DPS_NO = DPS_NO;
    }
    public String getFUSION_CREATED_DATE() {
        return FUSION_CREATED_DATE;
    }
    public void setFUSION_CREATED_DATE(String FUSION_CREATED_DATE) {
        this.FUSION_CREATED_DATE = FUSION_CREATED_DATE;
    }
    public String getLAST_UPDATE() {
        return LAST_UPDATE;
    }
    public void setLAST_UPDATE(String LAST_UPDATE) {
        this.LAST_UPDATE = LAST_UPDATE;
    }
    public String getSTORAGE_HOLD_CODE() {
        return STORAGE_HOLD_CODE;
    }
    public void setSTORAGE_HOLD_CODE(String STORAGE_HOLD_CODE) {
        this.STORAGE_HOLD_CODE = STORAGE_HOLD_CODE;
    }
    public String getTAT() {
        return TAT;
    }
    public void setTAT(String TAT) {
        this.TAT = TAT;
    }
    public String getWI_DYSP() {
        return WI_DYSP;
    }
    public void setWI_DYSP(String WI_DYSP) {
        this.WI_DYSP = WI_DYSP;
    }
    public String getWI_FUSION() {
        return WI_FUSION;
    }
    public void setWI_FUSION(String WI_FUSION) {
        this.WI_FUSION = WI_FUSION;
    }
    public String getFUSION_AGING() {
        return FUSION_AGING;
    }
    public void setFUSION_AGING(String FUSION_AGING) {
        this.FUSION_AGING = FUSION_AGING;
    }
}
