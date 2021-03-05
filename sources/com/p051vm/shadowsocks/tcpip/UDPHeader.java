package com.p051vm.shadowsocks.tcpip;

/* renamed from: com.vm.shadowsocks.tcpip.UDPHeader */
public class UDPHeader {
    static final short offset_crc = 6;
    static final short offset_dest_port = 2;
    static final short offset_src_port = 0;
    static final short offset_tlen = 4;
    public byte[] m_Data;
    public int m_Offset;

    public UDPHeader(byte[] bArr, int i) {
        this.m_Data = bArr;
        this.m_Offset = i;
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

    public int getTotalLength() {
        return CommonMethods.readShort(this.m_Data, this.m_Offset + 4) & 65535;
    }

    public void setTotalLength(int i) {
        CommonMethods.writeShort(this.m_Data, this.m_Offset + 4, (short) i);
    }

    public short getCrc() {
        return CommonMethods.readShort(this.m_Data, this.m_Offset + 6);
    }

    public void setCrc(short s) {
        CommonMethods.writeShort(this.m_Data, this.m_Offset + 6, s);
    }

    public String toString() {
        return String.format("%d->%d", new Object[]{Integer.valueOf(getSourcePort() & 65535), Integer.valueOf(getDestinationPort() & 65535)});
    }
}
