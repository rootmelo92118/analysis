package com.google.ads;

@Deprecated
/* renamed from: com.google.ads.a */
public final class C0693a {

    /* renamed from: com.google.ads.a$b */
    public enum C0695b {
        UNKNOWN,
        MALE,
        FEMALE
    }

    /* renamed from: com.google.ads.a$a */
    public enum C0694a {
        INVALID_REQUEST("Invalid Ad request."),
        NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
        NETWORK_ERROR("A network error occurred."),
        INTERNAL_ERROR("There was an internal error.");
        

        /* renamed from: e */
        private final String f616e;

        private C0694a(String str) {
            this.f616e = str;
        }

        public final String toString() {
            return this.f616e;
        }
    }
}
