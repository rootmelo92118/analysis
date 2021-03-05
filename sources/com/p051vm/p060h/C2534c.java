package com.p051vm.p060h;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import p000a.p001a.p002a.p003a.p004a.p006b.C0008a;

/* renamed from: com.vm.h.c */
/* compiled from: HttpUtil */
public class C2534c {
    /* renamed from: a */
    public static String m11864a(String str, Object obj) {
        String json = new Gson().toJson(obj);
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Type", C0008a.ACCEPT_JSON_VALUE);
            httpURLConnection.setRequestProperty("authorization", "aaa");
            httpURLConnection.connect();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream());
            outputStreamWriter.write(json);
            outputStreamWriter.flush();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    httpURLConnection.connect();
                    bufferedReader.close();
                    return sb.toString();
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m11865a(String str, Object obj, String str2) {
        String json = new Gson().toJson(obj);
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Type", C0008a.ACCEPT_JSON_VALUE);
            httpURLConnection.setRequestProperty("authorization", str2);
            httpURLConnection.connect();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), Charset.defaultCharset());
            outputStreamWriter.write(json);
            outputStreamWriter.flush();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    httpURLConnection.connect();
                    bufferedReader.close();
                    return sb.toString();
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
