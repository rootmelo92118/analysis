package com.p051vm.shadowsocks.dns;

import java.nio.ByteBuffer;

/* renamed from: com.vm.shadowsocks.dns.DnsPacket */
public class DnsPacket {
    public Resource[] AResources;
    public Resource[] EResources;
    public DnsHeader Header;
    public Question[] Questions;
    public Resource[] Resources;
    public int Size;

    public static DnsPacket FromBytes(ByteBuffer byteBuffer) {
        if (byteBuffer.limit() < 12 || byteBuffer.limit() > 512) {
            return null;
        }
        DnsPacket dnsPacket = new DnsPacket();
        dnsPacket.Size = byteBuffer.limit();
        dnsPacket.Header = DnsHeader.FromBytes(byteBuffer);
        if (dnsPacket.Header.QuestionCount > 2 || dnsPacket.Header.ResourceCount > 50 || dnsPacket.Header.AResourceCount > 50 || dnsPacket.Header.EResourceCount > 50) {
            return null;
        }
        dnsPacket.Questions = new Question[dnsPacket.Header.QuestionCount];
        dnsPacket.Resources = new Resource[dnsPacket.Header.ResourceCount];
        dnsPacket.AResources = new Resource[dnsPacket.Header.AResourceCount];
        dnsPacket.EResources = new Resource[dnsPacket.Header.EResourceCount];
        for (int i = 0; i < dnsPacket.Questions.length; i++) {
            dnsPacket.Questions[i] = Question.FromBytes(byteBuffer);
        }
        for (int i2 = 0; i2 < dnsPacket.Resources.length; i2++) {
            dnsPacket.Resources[i2] = Resource.FromBytes(byteBuffer);
        }
        for (int i3 = 0; i3 < dnsPacket.AResources.length; i3++) {
            dnsPacket.AResources[i3] = Resource.FromBytes(byteBuffer);
        }
        for (int i4 = 0; i4 < dnsPacket.EResources.length; i4++) {
            dnsPacket.EResources[i4] = Resource.FromBytes(byteBuffer);
        }
        return dnsPacket;
    }

    public void ToBytes(ByteBuffer byteBuffer) {
        this.Header.QuestionCount = 0;
        this.Header.ResourceCount = 0;
        this.Header.AResourceCount = 0;
        this.Header.EResourceCount = 0;
        if (this.Questions != null) {
            this.Header.QuestionCount = (short) this.Questions.length;
        }
        if (this.Resources != null) {
            this.Header.ResourceCount = (short) this.Resources.length;
        }
        if (this.AResources != null) {
            this.Header.AResourceCount = (short) this.AResources.length;
        }
        if (this.EResources != null) {
            this.Header.EResourceCount = (short) this.EResources.length;
        }
        this.Header.ToBytes(byteBuffer);
        for (int i = 0; i < this.Header.QuestionCount; i++) {
            this.Questions[i].ToBytes(byteBuffer);
        }
        for (int i2 = 0; i2 < this.Header.ResourceCount; i2++) {
            this.Resources[i2].ToBytes(byteBuffer);
        }
        for (int i3 = 0; i3 < this.Header.AResourceCount; i3++) {
            this.AResources[i3].ToBytes(byteBuffer);
        }
        for (int i4 = 0; i4 < this.Header.EResourceCount; i4++) {
            this.EResources[i4].ToBytes(byteBuffer);
        }
    }

    public static String ReadDomain(ByteBuffer byteBuffer, int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (byteBuffer.hasRemaining() && (i2 = byteBuffer.get() & 255) > 0) {
            if ((i2 & 192) == 192) {
                sb.append(ReadDomain(ByteBuffer.wrap(byteBuffer.array(), (((i2 & 63) << 8) | (byteBuffer.get() & 255)) + i, byteBuffer.limit() + i), i));
                return sb.toString();
            }
            while (i2 > 0 && byteBuffer.hasRemaining()) {
                sb.append((char) (byteBuffer.get() & 255));
                i2--;
            }
            sb.append('.');
        }
        if (i2 == 0 && sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static void WriteDomain(String str, ByteBuffer byteBuffer) {
        if (str == null || str == "") {
            byteBuffer.put((byte) 0);
            return;
        }
        String[] split = str.split("\\.");
        for (String str2 : split) {
            if (split.length > 1) {
                byteBuffer.put((byte) str2.length());
            }
            for (int i = 0; i < str2.length(); i++) {
                byteBuffer.put((byte) str2.codePointAt(i));
            }
        }
    }
}
