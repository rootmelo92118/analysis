package com.crashlytics.android.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.p001a.p002a.p003a.C0139c;
import p000a.p001a.p002a.p003a.C0153l;

class BinaryImagesConverter {
    private static final String DATA_DIR = "/data";
    private final Context context;
    private final FileIdStrategy fileIdStrategy;

    interface FileIdStrategy {
        String createId(File file);
    }

    BinaryImagesConverter(Context context2, FileIdStrategy fileIdStrategy2) {
        this.context = context2;
        this.fileIdStrategy = fileIdStrategy2;
    }

    /* access modifiers changed from: package-private */
    public byte[] convert(String str) {
        return generateBinaryImagesJsonString(parseProcMapsJsonFromString(str));
    }

    /* access modifiers changed from: package-private */
    public byte[] convert(BufferedReader bufferedReader) {
        return generateBinaryImagesJsonString(parseProcMapsJsonFromStream(bufferedReader));
    }

    private JSONArray parseProcMapsJsonFromStream(BufferedReader bufferedReader) {
        JSONArray jSONArray = new JSONArray();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return jSONArray;
            }
            JSONObject jsonFromMapEntryString = jsonFromMapEntryString(readLine);
            if (jsonFromMapEntryString != null) {
                jSONArray.put(jsonFromMapEntryString);
            }
        }
    }

    private JSONArray parseProcMapsJsonFromString(String str) {
        JSONArray jSONArray = new JSONArray();
        try {
            String[] split = joinMapsEntries(new JSONObject(str).getJSONArray("maps")).split("\\|");
            for (String jsonFromMapEntryString : split) {
                JSONObject jsonFromMapEntryString2 = jsonFromMapEntryString(jsonFromMapEntryString);
                if (jsonFromMapEntryString2 != null) {
                    jSONArray.put(jsonFromMapEntryString2);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            C0139c.m394g().mo289d(CrashlyticsCore.TAG, "Unable to parse proc maps string", e);
            return jSONArray;
        }
    }

    private JSONObject jsonFromMapEntryString(String str) {
        ProcMapEntry parse = ProcMapEntryParser.parse(str);
        if (parse == null || !isRelevant(parse)) {
            return null;
        }
        try {
            try {
                return createBinaryImageJson(this.fileIdStrategy.createId(getLibraryFile(parse.path)), parse);
            } catch (JSONException e) {
                C0139c.m394g().mo282a(CrashlyticsCore.TAG, "Could not create a binary image json string", (Throwable) e);
                return null;
            }
        } catch (IOException e2) {
            C0153l g = C0139c.m394g();
            g.mo282a(CrashlyticsCore.TAG, "Could not generate ID for file " + parse.path, (Throwable) e2);
            return null;
        }
    }

    private File getLibraryFile(String str) {
        File file = new File(str);
        return !file.exists() ? correctDataPath(file) : file;
    }

    private File correctDataPath(File file) {
        if (Build.VERSION.SDK_INT < 9 || !file.getAbsolutePath().startsWith(DATA_DIR)) {
            return file;
        }
        try {
            return new File(this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 0).nativeLibraryDir, file.getName());
        } catch (PackageManager.NameNotFoundException e) {
            C0139c.m394g().mo291e(CrashlyticsCore.TAG, "Error getting ApplicationInfo", e);
            return file;
        }
    }

    private static byte[] generateBinaryImagesJsonString(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("binary_images", jSONArray);
            return jSONObject.toString().getBytes();
        } catch (JSONException e) {
            C0139c.m394g().mo289d(CrashlyticsCore.TAG, "Binary images string is null", e);
            return new byte[0];
        }
    }

    private static JSONObject createBinaryImageJson(String str, ProcMapEntry procMapEntry) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("base_address", procMapEntry.address);
        jSONObject.put("size", procMapEntry.size);
        jSONObject.put("name", procMapEntry.path);
        jSONObject.put("uuid", str);
        return jSONObject;
    }

    private static String joinMapsEntries(JSONArray jSONArray) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.length(); i++) {
            sb.append(jSONArray.getString(i));
        }
        return sb.toString();
    }

    private static boolean isRelevant(ProcMapEntry procMapEntry) {
        return (procMapEntry.perms.indexOf(120) == -1 || procMapEntry.path.indexOf(47) == -1) ? false : true;
    }
}
