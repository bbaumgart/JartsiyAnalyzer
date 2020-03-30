package DailyDellCARPulsReport;

import lombok.Data;


public @Data class DpsHistoryWithAging {

    private String AWAITING_PART="0";
    private String AWAITING_ENGINEERING_QA="0";
    private String AWAITING_ENGINEERING_DOA="0";
    private String AWAITING_ENGINEERING_EGH="0";
    private String AWAITING_ENGINEERING_TAG="0";
    private String CUSTOMER_DDP="0";
    private String CUSTOMER_ADM="0";
    private String CUSTOMER_MBR="0";
    private String CUSTOMER_NFF="0";
    private String CUSTOMER_NFF2="0";
    private String WARRANTY_ISSUE_BER="0";
    private String WARRANTY_ISSUE_CTP="0";


}
