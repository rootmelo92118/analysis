package com.p051vm.shadowsocks.tcpip;

/* renamed from: com.vm.shadowsocks.tcpip.TCPHeader */
public class TCPHeader {
    public static final int ACK = 16;
    public static final int FIN = 1;
    public static final int PSH = 8;
    public static final int RST = 4;
    public static final int SYN = 2;
    public static final int URG = 32;
    static final int offset_ack = 8;
    static final short offset_crc = 16;
    static final short offset_dest_port = 2;
    static final byte offset_flag = 13;
    static final byte offset_lenres = 12;
    static final int offset_seq = 4;
    static final short offset_src_port = 0;
    static final short offset_urp = 18;
    static final short offset_win = 14;
    public byte[] m_Data;
    public int m_Offset;

    public TCPHeader(byte[] bArr, int i) {
        this.m_Data = bArr;
        this.m_Offset = i;
    }

    public int getHeaderLength() {
        return ((this.m_Data[this.m_Offset + 12] & 255) >> 4) * 4;
    }

    public short getSourcePort() {
        return CommonMethods.readShort(this.m_Data, this.m_Offset + 0);
    }

    public void setSourcePort(short s) {
        CommonMethods.writeShort(this.m_Data, this.m_Offset + 0, s);
    }

    public short getDestinationPort() {
        return CommonMethods.readShort(this.m_Data, this.m_Offset + 2);
    }

    public void setDestinationPort(short s) {
        CommonMethods.writeShort(this.m_Data, this.m_Offset + 2, s);
    }

    public byte getFlags() {
        return this.m_Data[this.m_Offset + 13];
    }

    public short getCrc() {
        return CommonMethods.readShort(this.m_Data, this.m_Offset + 16);
    }

    public void setCrc(short s) {
        CommonMethods.writeShort(this.m_Data, this.m_Offset + 16, s);
    }

    public int getSeqID() {
        return CommonMethods.readInt(this.m_Data, this.m_Offset + 4);
    }

    public int getAckID() {
        return CommonMethods.readInt(this.m_Data, this.m_Offset + 8);
    }

    public String toString() {
        Object[] objArr = new Object[10];
        objArr[0] = (getFlags() & 2) == 2 ? "SYN " : "";
        objArr[1] = (getFlags() & 16) == 16 ? "ACK " : "";
        objArr[2] = (getFlags() & 8) == 8 ? "PSH " : "";
        objArr[3] = (getFlags() & 4) == 4 ? "RST " : "";
        objArr[4] = (getFlags() & 1) == 1 ? "FIN " : "";
        objArr[5] = (getFlags() & 32) == 32 ? "URG " : "";
        objArr[6] = Integer.valueOf(getSourcePort() & 65535);
        objArr[7] = Integer.valueOf(getDestinationPort() & 65535);
        objArr[8] = Integer.valueOf(getSeqID());
        objArr[9] = Integer.valueOf(getAckID());
        return String.format("%s%s%s%s%s%s%d->%d %s:%s", objArr);
    }
}
