package com.p051vm.shadowsocks.tcpip;

/* renamed from: com.vm.shadowsocks.tcpip.IPHeader */
public class IPHeader {
    public static final byte ICMP = 1;

    /* renamed from: IP */
    public static final short f9037IP = 2048;
    public static final byte TCP = 6;
    public static final byte UDP = 17;
    static final short offset_crc = 10;
    public static final int offset_dest_ip = 16;
    static final short offset_flags_fo = 6;
    static final short offset_identification = 4;
    static final int offset_op_pad = 20;
    public static final byte offset_proto = 9;
    public static final int offset_src_ip = 12;
    static final short offset_tlen = 2;
    static final byte offset_tos = 1;
    static final byte offset_ttl = 8;
    static final byte offset_ver_ihl = 0;
    public byte[] m_Data;
    public int m_Offset;

    public IPHeader(byte[] bArr, int i) {
        this.m_Data = bArr;
        this.m_Offset = i;
    }

    public void Default() {
        setHeaderLength(20);
        setTos((byte) 0);
        setTotalLength(0);
        setIdentification(0);
        setFlagsAndOffset(0);
        setTTL((byte) 64);
    }

    public int getDataLength() {
        return getTotalLength() - getHeaderLength();
    }

    public int getHeaderLength() {
        return (this.m_Data[this.m_Offset + 0] & 15) * 4;
    }

    public void setHeaderLength(int i) {
        this.m_Data[this.m_Offset + 0] = (byte) ((i / 4) | 64);
    }

    public byte getTos() {
        return this.m_Data[this.m_Offset + 1];
    }

    public void setTos(byte b) {
        this.m_Data[this.m_Offset + 1] = b;
    }

    public int getTotalLength() {
        return CommonMethods.readShort(this.m_Data, this.m_Offset + 2) & 65535;
    }

    public void setTotalLength(int i) {
        CommonMethods.writeShort(this.m_Data, this.m_Offset + 2, (short) i);
    }

    public int getIdentification() {
        return CommonMethods.readShort(this.m_Data, this.m_Offset + 4) & 65535;
    }

    public void setIdentification(int i) {
        CommonMethods.writeShort(this.m_Data, this.m_Offset + 4, (short) i);
    }

    public short getFlagsAndOffset() {
        return CommonMethods.readShort(this.m_Data, this.m_Offset + 6);
    }

    public void setFlagsAndOffset(short s) {
        CommonMethods.writeShort(this.m_Data, this.m_Offset + 6, s);
    }

    public byte getTTL() {
        return this.m_Data[this.m_Offset + 8];
    }

    public void setTTL(byte b) {
        this.m_Data[this.m_Offset + 8] = b;
    }

    public byte getProtocol() {
        return this.m_Data[this.m_Offset + 9];
    }

    public void setProtocol(byte b) {
        this.m_Data[this.m_Offset + 9] = b;
    }

    public short getCrc() {
        return CommonMethods.readShort(this.m_Data, this.m_Offset + 10);
    }

    public void setCrc(short s) {
        CommonMethods.writeShort(this.m_Data, this.m_Offset + 10, s);
    }

    public int getSourceIP() {
        return CommonMethods.readInt(this.m_Data, this.m_Offset + 12);
    }

    public void setSourceIP(int i) {
        CommonMethods.writeInt(this.m_Data, this.m_Offset + 12, i);
    }

    public int getDestinationIP() {
        return CommonMethods.readInt(this.m_Data, this.m_Offset + 16);
    }

    public void setDestinationIP(int i) {
        CommonMethods.writeInt(this.m_Data, this.m_Offset + 16, i);
    }

    public String toString() {
        return String.format("%s->%s Pro=%s,HLen=%d", new Object[]{CommonMethods.ipIntToString(getSourceIP()), CommonMethods.ipIntToString(getDestinationIP()), Byte.valueOf(getProtocol()), Integer.valueOf(getHeaderLength())});
    }
}
