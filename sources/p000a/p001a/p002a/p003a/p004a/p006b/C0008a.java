package p000a.p001a.p002a.p003a.p004a.p006b;

import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;
import p000a.p001a.p002a.p003a.C0150i;
import p000a.p001a.p002a.p003a.p004a.p010e.C0093c;
import p000a.p001a.p002a.p003a.p004a.p010e.C0094d;
import p000a.p001a.p002a.p003a.p004a.p010e.C0102e;

/* renamed from: a.a.a.a.a.b.a */
/* compiled from: AbstractSpiCall */
public abstract class C0008a {
    public static final String ACCEPT_JSON_VALUE = "application/json";
    public static final String ANDROID_CLIENT_TYPE = "android";
    public static final String CLS_ANDROID_SDK_DEVELOPER_TOKEN = "470fa2b4ae81cd56ecbcda9735803434cec591fa";
    public static final String CRASHLYTICS_USER_AGENT = "Crashlytics Android SDK/";
    public static final int DEFAULT_TIMEOUT = 10000;
    public static final String HEADER_ACCEPT = "Accept";
    public static final String HEADER_API_KEY = "X-CRASHLYTICS-API-KEY";
    public static final String HEADER_CLIENT_TYPE = "X-CRASHLYTICS-API-CLIENT-TYPE";
    public static final String HEADER_CLIENT_VERSION = "X-CRASHLYTICS-API-CLIENT-VERSION";
    public static final String HEADER_DEVELOPER_TOKEN = "X-CRASHLYTICS-DEVELOPER-TOKEN";
    public static final String HEADER_REQUEST_ID = "X-REQUEST-ID";
    public static final String HEADER_USER_AGENT = "User-Agent";
    private static final Pattern PROTOCOL_AND_HOST_PATTERN = Pattern.compile("http(s?)://[^\\/]+", 2);
    protected final C0150i kit;
    private final C0093c method;
    private final String protocolAndHostOverride;
    private final C0102e requestFactory;
    private final String url;

    public C0008a(C0150i iVar, String str, String str2, C0102e eVar, C0093c cVar) {
        if (str2 == null) {
            throw new IllegalArgumentException("url must not be null.");
        } else if (eVar != null) {
            this.kit = iVar;
            this.protocolAndHostOverride = str;
            this.url = overrideProtocolAndHost(str2);
            this.requestFactory = eVar;
            this.method = cVar;
        } else {
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
    }

    /* access modifiers changed from: protected */
    public String getUrl() {
        return this.url;
    }

    /* access modifiers changed from: protected */
    public C0094d getHttpRequest() {
        return getHttpRequest(Collections.emptyMap());
    }

    /* access modifiers changed from: protected */
    public C0094d getHttpRequest(Map<String, String> map) {
        C0094d a = this.requestFactory.mo195a(this.method, getUrl(), map).mo208a(false).mo198a((int) DEFAULT_TIMEOUT);
        return a.mo201a(HEADER_USER_AGENT, CRASHLYTICS_USER_AGENT + this.kit.getVersion()).mo201a(HEADER_DEVELOPER_TOKEN, CLS_ANDROID_SDK_DEVELOPER_TOKEN);
    }

    private String overrideProtocolAndHost(String str) {
        return !C0020i.m73d(this.protocolAndHostOverride) ? PROTOCOL_AND_HOST_PATTERN.matcher(str).replaceFirst(this.protocolAndHostOverride) : str;
    }
}
