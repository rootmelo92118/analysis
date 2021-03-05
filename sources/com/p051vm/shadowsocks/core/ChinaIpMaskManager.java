package com.p051vm.shadowsocks.core;

import android.util.SparseIntArray;
import com.p051vm.shadowsocks.tcpip.CommonMethods;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.vm.shadowsocks.core.ChinaIpMaskManager */
public class ChinaIpMaskManager {
    static SparseIntArray ChinaIpMaskDict = new SparseIntArray(3000);
    static SparseIntArray MaskDict = new SparseIntArray();

    public static boolean isIPInChina(int i) {
        for (int i2 = 0; i2 < MaskDict.size(); i2++) {
            int keyAt = MaskDict.keyAt(i2);
            if (ChinaIpMaskDict.get(i & keyAt) == keyAt) {
                return true;
            }
        }
        return false;
    }

    public static void loadFromFile(InputStream inputStream) {
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read > 0) {
                    for (int i = 0; i < read; i += 8) {
                        int readInt = CommonMethods.readInt(bArr, i);
                        int readInt2 = CommonMethods.readInt(bArr, i + 4);
                        ChinaIpMaskDict.put(readInt, readInt2);
                        MaskDict.put(readInt2, readInt2);
                    }
                } else {
                    inputStream.close();
                    System.out.printf("ChinaIpMask records count: %d\n", new Object[]{Integer.valueOf(ChinaIpMaskDict.size())});
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
