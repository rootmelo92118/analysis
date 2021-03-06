package com.crashlytics.android.answers;

import android.os.Bundle;
import com.crashlytics.android.answers.SessionEvent;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p000a.p001a.p002a.p003a.C0139c;
import p000a.p001a.p002a.p003a.p004a.p009d.C0080b;

public class FirebaseAnalyticsEventMapper {
    private static final Set<String> EVENT_NAMES = new HashSet(Arrays.asList(new String[]{"app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "firebase_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "screen_view", "firebase_extra_parameter"}));
    private static final String FIREBASE_LEVEL_NAME = "level_name";
    private static final String FIREBASE_METHOD = "method";
    private static final String FIREBASE_RATING = "rating";
    private static final String FIREBASE_SUCCESS = "success";

    public FirebaseAnalyticsEvent mapEvent(SessionEvent sessionEvent) {
        Bundle bundle;
        String str;
        boolean z = true;
        boolean z2 = SessionEvent.Type.CUSTOM.equals(sessionEvent.type) && sessionEvent.customType != null;
        boolean z3 = SessionEvent.Type.PREDEFINED.equals(sessionEvent.type) && sessionEvent.predefinedType != null;
        if (!z2 && !z3) {
            return null;
        }
        if (z3) {
            bundle = mapPredefinedEvent(sessionEvent);
        } else {
            bundle = new Bundle();
            if (sessionEvent.customAttributes != null) {
                mapCustomEventAttributes(bundle, sessionEvent.customAttributes);
            }
        }
        if (z3) {
            String str2 = (String) sessionEvent.predefinedAttributes.get(FIREBASE_SUCCESS);
            if (str2 == null || Boolean.parseBoolean(str2)) {
                z = false;
            }
            str = mapPredefinedEventName(sessionEvent.predefinedType, z);
        } else {
            str = mapCustomEventName(sessionEvent.customType);
        }
        C0139c.m394g().mo281a(Answers.TAG, "Logging event into firebase...");
        return new FirebaseAnalyticsEvent(str, bundle);
    }

    private String mapCustomEventName(String str) {
        if (str == null || str.length() == 0) {
            return "fabric_unnamed_event";
        }
        if (EVENT_NAMES.contains(str)) {
            return "fabric_" + str;
        }
        String replaceAll = str.replaceAll("[^\\p{Alnum}_]+", C0080b.ROLL_OVER_FILE_NAME_SEPARATOR);
        if (replaceAll.startsWith("ga_") || replaceAll.startsWith("google_") || replaceAll.startsWith("firebase_") || !Character.isLetter(replaceAll.charAt(0))) {
            replaceAll = "fabric_" + replaceAll;
        }
        return replaceAll.length() > 40 ? replaceAll.substring(0, 40) : replaceAll;
    }

    private String mapAttribute(String str) {
        if (str == null || str.length() == 0) {
            return "fabric_unnamed_parameter";
        }
        String replaceAll = str.replaceAll("[^\\p{Alnum}_]+", C0080b.ROLL_OVER_FILE_NAME_SEPARATOR);
        if (replaceAll.startsWith("ga_") || replaceAll.startsWith("google_") || replaceAll.startsWith("firebase_") || !Character.isLetter(replaceAll.charAt(0))) {
            replaceAll = "fabric_" + replaceAll;
        }
        return replaceAll.length() > 40 ? replaceAll.substring(0, 40) : replaceAll;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        if (r6.equals("purchase") != false) goto L_0x00cd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String mapPredefinedEventName(java.lang.String r6, boolean r7) {
        /*
            r5 = this;
            r0 = 0
            r1 = 2
            r2 = 1
            r3 = -1
            if (r7 == 0) goto L_0x0046
            int r7 = r6.hashCode()
            r4 = -902468296(0xffffffffca356d38, float:-2972494.0)
            if (r7 == r4) goto L_0x002e
            r4 = 103149417(0x625ef69, float:3.1208942E-35)
            if (r7 == r4) goto L_0x0024
            r4 = 1743324417(0x67e90501, float:2.2008074E24)
            if (r7 == r4) goto L_0x001a
            goto L_0x0038
        L_0x001a:
            java.lang.String r7 = "purchase"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0038
            r7 = 0
            goto L_0x0039
        L_0x0024:
            java.lang.String r7 = "login"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0038
            r7 = 2
            goto L_0x0039
        L_0x002e:
            java.lang.String r7 = "signUp"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0038
            r7 = 1
            goto L_0x0039
        L_0x0038:
            r7 = -1
        L_0x0039:
            switch(r7) {
                case 0: goto L_0x0043;
                case 1: goto L_0x0040;
                case 2: goto L_0x003d;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x0046
        L_0x003d:
            java.lang.String r6 = "failed_login"
            return r6
        L_0x0040:
            java.lang.String r6 = "failed_sign_up"
            return r6
        L_0x0043:
            java.lang.String r6 = "failed_ecommerce_purchase"
            return r6
        L_0x0046:
            int r7 = r6.hashCode()
            switch(r7) {
                case -2131650889: goto L_0x00c1;
                case -1183699191: goto L_0x00b6;
                case -938102371: goto L_0x00ac;
                case -906336856: goto L_0x00a2;
                case -902468296: goto L_0x0098;
                case -389087554: goto L_0x008e;
                case 23457852: goto L_0x0084;
                case 103149417: goto L_0x0079;
                case 109400031: goto L_0x006f;
                case 196004670: goto L_0x0064;
                case 1664021448: goto L_0x0059;
                case 1743324417: goto L_0x004f;
                default: goto L_0x004d;
            }
        L_0x004d:
            goto L_0x00cc
        L_0x004f:
            java.lang.String r7 = "purchase"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x00cc
            goto L_0x00cd
        L_0x0059:
            java.lang.String r7 = "startCheckout"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x00cc
            r0 = 2
            goto L_0x00cd
        L_0x0064:
            java.lang.String r7 = "levelStart"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x00cc
            r0 = 10
            goto L_0x00cd
        L_0x006f:
            java.lang.String r7 = "share"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x00cc
            r0 = 5
            goto L_0x00cd
        L_0x0079:
            java.lang.String r7 = "login"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x00cc
            r0 = 8
            goto L_0x00cd
        L_0x0084:
            java.lang.String r7 = "addToCart"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x00cc
            r0 = 1
            goto L_0x00cd
        L_0x008e:
            java.lang.String r7 = "contentView"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x00cc
            r0 = 3
            goto L_0x00cd
        L_0x0098:
            java.lang.String r7 = "signUp"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x00cc
            r0 = 7
            goto L_0x00cd
        L_0x00a2:
            java.lang.String r7 = "search"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x00cc
            r0 = 4
            goto L_0x00cd
        L_0x00ac:
            java.lang.String r7 = "rating"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x00cc
            r0 = 6
            goto L_0x00cd
        L_0x00b6:
            java.lang.String r7 = "invite"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x00cc
            r0 = 9
            goto L_0x00cd
        L_0x00c1:
            java.lang.String r7 = "levelEnd"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x00cc
            r0 = 11
            goto L_0x00cd
        L_0x00cc:
            r0 = -1
        L_0x00cd:
            switch(r0) {
                case 0: goto L_0x00f6;
                case 1: goto L_0x00f3;
                case 2: goto L_0x00f0;
                case 3: goto L_0x00ed;
                case 4: goto L_0x00ea;
                case 5: goto L_0x00e7;
                case 6: goto L_0x00e4;
                case 7: goto L_0x00e1;
                case 8: goto L_0x00de;
                case 9: goto L_0x00db;
                case 10: goto L_0x00d8;
                case 11: goto L_0x00d5;
                default: goto L_0x00d0;
            }
        L_0x00d0:
            java.lang.String r6 = r5.mapCustomEventName(r6)
            return r6
        L_0x00d5:
            java.lang.String r6 = "level_end"
            return r6
        L_0x00d8:
            java.lang.String r6 = "level_start"
            return r6
        L_0x00db:
            java.lang.String r6 = "invite"
            return r6
        L_0x00de:
            java.lang.String r6 = "login"
            return r6
        L_0x00e1:
            java.lang.String r6 = "sign_up"
            return r6
        L_0x00e4:
            java.lang.String r6 = "rate_content"
            return r6
        L_0x00e7:
            java.lang.String r6 = "share"
            return r6
        L_0x00ea:
            java.lang.String r6 = "search"
            return r6
        L_0x00ed:
            java.lang.String r6 = "select_content"
            return r6
        L_0x00f0:
            java.lang.String r6 = "begin_checkout"
            return r6
        L_0x00f3:
            java.lang.String r6 = "add_to_cart"
            return r6
        L_0x00f6:
            java.lang.String r6 = "ecommerce_purchase"
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.answers.FirebaseAnalyticsEventMapper.mapPredefinedEventName(java.lang.String, boolean):java.lang.String");
    }

    private Bundle mapPredefinedEvent(SessionEvent sessionEvent) {
        Bundle bundle = new Bundle();
        if ("purchase".equals(sessionEvent.predefinedType)) {
            putString(bundle, "item_id", (String) sessionEvent.predefinedAttributes.get("itemId"));
            putString(bundle, "item_name", (String) sessionEvent.predefinedAttributes.get("itemName"));
            putString(bundle, "item_category", (String) sessionEvent.predefinedAttributes.get("itemType"));
            putDouble(bundle, "value", mapPriceValue(sessionEvent.predefinedAttributes.get("itemPrice")));
            putString(bundle, "currency", (String) sessionEvent.predefinedAttributes.get("currency"));
        } else if ("addToCart".equals(sessionEvent.predefinedType)) {
            putString(bundle, "item_id", (String) sessionEvent.predefinedAttributes.get("itemId"));
            putString(bundle, "item_name", (String) sessionEvent.predefinedAttributes.get("itemName"));
            putString(bundle, "item_category", (String) sessionEvent.predefinedAttributes.get("itemType"));
            putDouble(bundle, "price", mapPriceValue(sessionEvent.predefinedAttributes.get("itemPrice")));
            putDouble(bundle, "value", mapPriceValue(sessionEvent.predefinedAttributes.get("itemPrice")));
            putString(bundle, "currency", (String) sessionEvent.predefinedAttributes.get("currency"));
            bundle.putLong("quantity", 1);
        } else if ("startCheckout".equals(sessionEvent.predefinedType)) {
            putLong(bundle, "quantity", Long.valueOf((long) ((Integer) sessionEvent.predefinedAttributes.get("itemCount")).intValue()));
            putDouble(bundle, "value", mapPriceValue(sessionEvent.predefinedAttributes.get("totalPrice")));
            putString(bundle, "currency", (String) sessionEvent.predefinedAttributes.get("currency"));
        } else if ("contentView".equals(sessionEvent.predefinedType)) {
            putString(bundle, "content_type", (String) sessionEvent.predefinedAttributes.get("contentType"));
            putString(bundle, "item_id", (String) sessionEvent.predefinedAttributes.get("contentId"));
            putString(bundle, "item_name", (String) sessionEvent.predefinedAttributes.get("contentName"));
        } else if ("search".equals(sessionEvent.predefinedType)) {
            putString(bundle, "search_term", (String) sessionEvent.predefinedAttributes.get("query"));
        } else if ("share".equals(sessionEvent.predefinedType)) {
            putString(bundle, FIREBASE_METHOD, (String) sessionEvent.predefinedAttributes.get(FIREBASE_METHOD));
            putString(bundle, "content_type", (String) sessionEvent.predefinedAttributes.get("contentType"));
            putString(bundle, "item_id", (String) sessionEvent.predefinedAttributes.get("contentId"));
            putString(bundle, "item_name", (String) sessionEvent.predefinedAttributes.get("contentName"));
        } else if (FIREBASE_RATING.equals(sessionEvent.predefinedType)) {
            putString(bundle, FIREBASE_RATING, String.valueOf(sessionEvent.predefinedAttributes.get(FIREBASE_RATING)));
            putString(bundle, "content_type", (String) sessionEvent.predefinedAttributes.get("contentType"));
            putString(bundle, "item_id", (String) sessionEvent.predefinedAttributes.get("contentId"));
            putString(bundle, "item_name", (String) sessionEvent.predefinedAttributes.get("contentName"));
        } else if ("signUp".equals(sessionEvent.predefinedType)) {
            putString(bundle, FIREBASE_METHOD, (String) sessionEvent.predefinedAttributes.get(FIREBASE_METHOD));
        } else if ("login".equals(sessionEvent.predefinedType)) {
            putString(bundle, FIREBASE_METHOD, (String) sessionEvent.predefinedAttributes.get(FIREBASE_METHOD));
        } else if ("invite".equals(sessionEvent.predefinedType)) {
            putString(bundle, FIREBASE_METHOD, (String) sessionEvent.predefinedAttributes.get(FIREBASE_METHOD));
        } else if ("levelStart".equals(sessionEvent.predefinedType)) {
            putString(bundle, FIREBASE_LEVEL_NAME, (String) sessionEvent.predefinedAttributes.get("levelName"));
        } else if ("levelEnd".equals(sessionEvent.predefinedType)) {
            putDouble(bundle, "score", mapDouble(sessionEvent.predefinedAttributes.get("score")));
            putString(bundle, FIREBASE_LEVEL_NAME, (String) sessionEvent.predefinedAttributes.get("levelName"));
            putInt(bundle, FIREBASE_SUCCESS, mapBooleanValue((String) sessionEvent.predefinedAttributes.get(FIREBASE_SUCCESS)));
        }
        mapCustomEventAttributes(bundle, sessionEvent.customAttributes);
        return bundle;
    }

    private void putLong(Bundle bundle, String str, Long l) {
        if (l != null) {
            bundle.putLong(str, l.longValue());
        }
    }

    private void putInt(Bundle bundle, String str, Integer num) {
        if (num != null) {
            bundle.putInt(str, num.intValue());
        }
    }

    private void putString(Bundle bundle, String str, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    private void putDouble(Bundle bundle, String str, Double d) {
        Double mapDouble = mapDouble(d);
        if (mapDouble != null) {
            bundle.putDouble(str, mapDouble.doubleValue());
        }
    }

    private Double mapDouble(Object obj) {
        String valueOf = String.valueOf(obj);
        if (valueOf == null) {
            return null;
        }
        return Double.valueOf(valueOf);
    }

    private Integer mapBooleanValue(String str) {
        if (str == null) {
            return null;
        }
        return Integer.valueOf(str.equals("true") ? 1 : 0);
    }

    private Double mapPriceValue(Object obj) {
        Long l = (Long) obj;
        if (l == null) {
            return null;
        }
        return Double.valueOf(new BigDecimal(l.longValue()).divide(AddToCartEvent.MICRO_CONSTANT).doubleValue());
    }

    private void mapCustomEventAttributes(Bundle bundle, Map<String, Object> map) {
        for (Map.Entry next : map.entrySet()) {
            Object value = next.getValue();
            String mapAttribute = mapAttribute((String) next.getKey());
            if (value instanceof String) {
                bundle.putString(mapAttribute, next.getValue().toString());
            } else if (value instanceof Double) {
                bundle.putDouble(mapAttribute, ((Double) next.getValue()).doubleValue());
            } else if (value instanceof Long) {
                bundle.putLong(mapAttribute, ((Long) next.getValue()).longValue());
            } else if (value instanceof Integer) {
                bundle.putInt(mapAttribute, ((Integer) next.getValue()).intValue());
            }
        }
    }
}
