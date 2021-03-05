package com.p051vm.shadowsocks.tunnel.shadowsocks;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* renamed from: com.vm.shadowsocks.tunnel.shadowsocks.CryptFactory */
public class CryptFactory {
    private static final Map<String, String> crypts = new HashMap<String, String>() {
        {
            putAll(AesCrypt.getCiphers());
            putAll(CamelliaCrypt.getCiphers());
            putAll(BlowFishCrypt.getCiphers());
            putAll(SeedCrypt.getCiphers());
            putAll(Chacha20Crypt.getCiphers());
            putAll(Rc4Md5Crypt.getCiphers());
        }
    };
    private static Logger logger = Logger.getLogger(CryptFactory.class.getName());

    public static boolean isCipherExisted(String str) {
        return crypts.get(str) != null;
    }

    public static ICrypt get(String str, String str2) {
        try {
            return (ICrypt) getObj(crypts.get(str), String.class, str, String.class, str2);
        } catch (Exception e) {
            logger.info(e.getMessage());
            return null;
        }
    }

    public static List<String> getSupportedCiphers() {
        ArrayList arrayList = new ArrayList(crypts.keySet());
        Collections.sort(arrayList);
        return arrayList;
    }

    public static Object getObj(String str, Object... objArr) {
        Object newInstance;
        try {
            Class<?> cls = Class.forName(str);
            if (objArr.length == 0) {
                newInstance = cls.newInstance();
            } else {
                int i = 1;
                if ((objArr.length & 1) != 0) {
                    return null;
                }
                Class[] clsArr = new Class[(objArr.length / 2)];
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (i3 < objArr.length) {
                    clsArr[i4] = objArr[i3];
                    i3 += 2;
                    i4++;
                }
                Constructor<?> constructor = cls.getConstructor(clsArr);
                Object[] objArr2 = new Object[(objArr.length / 2)];
                while (i < objArr.length) {
                    objArr2[i2] = objArr[i];
                    i += 2;
                    i2++;
                }
                newInstance = constructor.newInstance(objArr2);
            }
            return newInstance;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
