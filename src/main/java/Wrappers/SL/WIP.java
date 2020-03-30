package Wrappers.SL;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import static java.time.temporal.ChronoUnit.MILLIS;

public class WIP {

    public static String getOldPPID(String BCN) throws Exception {
        LocalDate start = LocalDate.now();
        String answer = sendGetOldPPID(sendGetItemID(BCN));
        LocalDate end = LocalDate.now();
        long daysBetween = MILLIS.between(start, end);
        System.out.println("zapytanie dla " + BCN + " trwało " + daysBetween);
        return answer;
    }

    private static String sendGetItemID(String BCN) throws Exception {
        String itemID;
        OkHttpClient httpClient = new OkHttpClient.Builder()
                .connectTimeout(1, TimeUnit.MINUTES) // connect timeout
                .writeTimeout(1, TimeUnit.MINUTES) // write timeout
                .readTimeout(1, TimeUnit.MINUTES) // read timeout
                .build();

        Request request = new Request.Builder()
                .url("http://pssengwebsvc.corp.iqorams.net/"
                        + "InventoryWrapper.asmx/"
                        + "GetInventoryHistory?"
                        + "Location=Bydgoszcz"
                        + "&Warehouse=" //+ Warehouse//BYD-Stores_B2
                        + "&BCN=" + BCN //BCN394058530
                        + "&SerialNo=&UserName=oleksiy.mysko")
                .build();

        try (Response response = httpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
            String body = (Objects.requireNonNull(response.body()).string());
            try {
                itemID = body.substring(body.indexOf("<ITEM_ID>") + 9, body.indexOf("</ITEM_ID>"));
            } catch (StringIndexOutOfBoundsException e) {
                itemID = "";
            }
        }
        return itemID;
    }

    private static String sendGetOldPPID(String itemID) throws Exception {
        String oldPPID;
        OkHttpClient httpClient = new OkHttpClient.Builder()
                .connectTimeout(1, TimeUnit.MINUTES) // connect timeout
                .writeTimeout(1, TimeUnit.MINUTES) // write timeout
                .readTimeout(1, TimeUnit.MINUTES) // read timeout
                .build();
        Request request = new Request.Builder()
                .url("http://pssengwebsvc.corp.iqorams.net/"
                        + "QueryAdapterWrapper.asmx/"
                        + "GetAllItemHistory?"
                        + "itemId=" + itemID
                        + "&UserName=oleksiy.mysko")
                .build();

        try (Response response = httpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
            String body = (Objects.requireNonNull(response.body()).string());
            try {
                oldPPID = body.substring(body.indexOf("<ITEM_SERIAL_NO_OLD>") + 20, body.indexOf("</ITEM_SERIAL_NO_OLD>"));
            } catch (StringIndexOutOfBoundsException e) {
                oldPPID = "";
            }
        }
        return oldPPID;
    }
}
