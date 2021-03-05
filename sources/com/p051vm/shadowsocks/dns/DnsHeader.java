package com.p051vm.shadowsocks.dns;

import com.p051vm.shadowsocks.tcpip.CommonMethods;
import java.nio.ByteBuffer;

/* renamed from: com.vm.shadowsocks.dns.DnsHeader */
public class DnsHeader {
    static final short offset_AResourceCount = 8;
    static final short offset_EResourceCount = 10;
    static final short offset_Flags = 2;
    static final short offset_ID = 0;
    static final short offset_QuestionCount = 4;
    static final short offset_ResourceCount = 6;
    public short AResourceCount;
    public byte[] Data;
    public short EResourceCount;
    public DnsFlags Flags;

    /* renamed from: ID */
    public short f9028ID;
    public int Offset;
    public short QuestionCount;
    public short ResourceCount;

    public static DnsHeader FromBytes(ByteBuffer byteBuffer) {
        DnsHeader dnsHeader = new DnsHeader(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position());
        dnsHeader.f9028ID = byteBuffer.getShort();
        dnsHeader.Flags = DnsFlags.Parse(byteBuffer.getShort());
        dnsHeader.QuestionCount = byteBuffer.getShort();
        dnsHeader.ResourceCount = byteBuffer.getShort();
        dnsHeader.AResourceCount = byteBuffer.getShort();
        dnsHeader.EResourceCount = byteBuffer.getShort();
        return dnsHeader;
    }

    public void ToBytes(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.f9028ID);
        byteBuffer.putShort(this.Flags.ToShort());
        byteBuffer.putShort(this.QuestionCount);
        byteBuffer.putShort(this.ResourceCount);
        byteBuffer.putShort(this.AResourceCount);
        byteBuffer.putShort(this.EResourceCount);
    }

    public DnsHeader(byte[] bArr, int i) {
        this.Offset = i;
        this.Data = bArr;
    }

    public short getID() {
        return CommonMethods.readShort(this.Data, this.Offset + 0);
    }

    public short getFlags() {
        return CommonMethods.readShort(this.Data, this.Offset + 2);
    }

    public short getQuestionCount() {
        return CommonMethods.readShort(this.Data, this.Offset + 4);
    }

    public short getResourceCount() {
        return CommonMethods.readShort(this.Data, this.Offset + 6);
    }

    public short getAResourceCount() {
        return CommonMethods.readShort(this.Data, this.Offset + 8);
    }

    public short getEResourceCount() {
        return CommonMethods.readShort(this.Data, this.Offset + 10);
    }

    public void setID(short s) {
        CommonMethods.writeShort(this.Data, this.Offset + 0, s);
    }

    public void setFlags(short s) {
        CommonMethods.writeShort(this.Data, this.Offset + 2, s);
    }

    public void setQuestionCount(short s) {
        CommonMethods.writeShort(this.Data, this.Offset + 4, s);
    }

    public void setResourceCount(short s) {
        CommonMethods.writeShort(this.Data, this.Offset + 6, s);
    }

    public void setAResourceCount(short s) {
        CommonMethods.writeShort(this.Data, this.Offset + 8, s);
    }

    public void setEResourceCount(short s) {
        CommonMethods.writeShort(this.Data, this.Offset + 10, s);
    }
}
