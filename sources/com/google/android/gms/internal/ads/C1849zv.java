package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.zv */
public final class C1849zv {

    /* renamed from: a */
    private static Map<String, List<Map<String, Object>>> f6952a = new HashMap();

    /* renamed from: b */
    private static List<MediaCodecInfo> f6953b;

    /* renamed from: c */
    private static final Object f6954c = new Object();

    @TargetApi(16)
    /* renamed from: a */
    public static List<Map<String, Object>> m8572a(String str) {
        synchronized (f6954c) {
            if (f6952a.containsKey(str)) {
                List<Map<String, Object>> list = f6952a.get(str);
                return list;
            }
            try {
                synchronized (f6954c) {
                    if (f6953b == null) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            f6953b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        } else if (Build.VERSION.SDK_INT >= 16) {
                            int codecCount = MediaCodecList.getCodecCount();
                            f6953b = new ArrayList(codecCount);
                            for (int i = 0; i < codecCount; i++) {
                                f6953b.add(MediaCodecList.getCodecInfoAt(i));
                            }
                        } else {
                            f6953b = Collections.emptyList();
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (MediaCodecInfo next : f6953b) {
                    if (!next.isEncoder() && Arrays.asList(next.getSupportedTypes()).contains(str)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("codecName", next.getName());
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = next.getCapabilitiesForType(str);
                        ArrayList arrayList2 = new ArrayList();
                        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                            arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                        }
                        hashMap.put("profileLevels", arrayList2);
                        if (Build.VERSION.SDK_INT >= 21) {
                            MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                            hashMap.put("bitRatesBps", m8573a(videoCapabilities.getBitrateRange()));
                            hashMap.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                            hashMap.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                            hashMap.put("frameRates", m8573a(videoCapabilities.getSupportedFrameRates()));
                            hashMap.put("widths", m8573a(videoCapabilities.getSupportedWidths()));
                            hashMap.put("heights", m8573a(videoCapabilities.getSupportedHeights()));
                        }
                        if (Build.VERSION.SDK_INT >= 23) {
                            hashMap.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                        }
                        arrayList.add(hashMap);
                    }
                }
                f6952a.put(str, arrayList);
                return arrayList;
            } catch (LinkageError | RuntimeException e) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("error", e.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(hashMap2);
                f6952a.put(str, arrayList3);
                return arrayList3;
            }
        }
    }

    @TargetApi(21)
    /* renamed from: a */
    private static Integer[] m8573a(Range<Integer> range) {
        return new Integer[]{range.getLower(), range.getUpper()};
    }
}
