package com.p051vm.shadowsocks.dns;

/* renamed from: com.vm.shadowsocks.dns.DnsFlags */
public class DnsFlags {

    /* renamed from: AA */
    public boolean f9023AA;
    public int OpCode;

    /* renamed from: QR */
    public boolean f9024QR;

    /* renamed from: RA */
    public boolean f9025RA;

    /* renamed from: RD */
    public boolean f9026RD;
    public int Rcode;

    /* renamed from: TC */
    public boolean f9027TC;
    public int Zero;

    public static DnsFlags Parse(short s) {
        short s2 = s & 65535;
        DnsFlags dnsFlags = new DnsFlags();
        boolean z = true;
        dnsFlags.f9024QR = ((s2 >> 7) & 1) == 1;
        dnsFlags.OpCode = (s2 >> 3) & 15;
        dnsFlags.f9023AA = ((s2 >> 2) & 1) == 1;
        dnsFlags.f9027TC = ((s2 >> 1) & 1) == 1;
        dnsFlags.f9026RD = (s2 & 1) == 1;
        if ((s2 >> 15) != 1) {
            z = false;
        }
        dnsFlags.f9025RA = z;
        dnsFlags.Zero = (s2 >> 12) & 7;
        dnsFlags.Rcode = (s2 >> 8) & 15;
        return dnsFlags;
    }

    public short ToShort() {
        return (((((((((this.f9024QR ? 1 : 0) << true) | false) | ((this.OpCode & 15) << 3)) | ((this.f9023AA ? 1 : 0) << true)) | ((this.f9027TC ? 1 : 0) << true)) | this.f9026RD) | ((this.f9025RA ? 1 : 0) << true)) | ((this.Zero & 7) << 12)) | ((this.Rcode & 15) << 8) ? (short) 1 : 0;
    }
}
