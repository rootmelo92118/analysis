package com.p051vm.shadowsocks.dns;

import com.p051vm.shadowsocks.tcpip.CommonMethods;

/* renamed from: com.vm.shadowsocks.dns.ResourcePointer */
public class ResourcePointer {
    static final short offset_Class = 4;
    static final short offset_DataLength = 10;
    static final short offset_Domain = 0;
    static final int offset_IP = 12;
    static final int offset_TTL = 6;
    static final short offset_Type = 2;
    byte[] Data;
    int Offset;

    public ResourcePointer(byte[] bArr, int i) {
        this.Data = bArr;
        this.Offset = i;
    }

    public void setDomain(short s) {
        CommonMethods.writeShort(this.Data, this.Offset + 0, s);
    }

    public short getType() {
        return CommonMethods.readShort(this.Data, this.Offset + 2);
    }

    public void setType(short s) {
        CommonMethods.writeShort(this.Data, this.Offset + 2, s);
    }

    public short getClass(short s) {
        return CommonMethods.readShort(this.Data, this.Offset + 4);
    }

    public void setClass(short s) {
        CommonMethods.writeShort(this.Data, this.Offset + 4, s);
    }

    public int getTTL() {
        return CommonMethods.readInt(this.Data, this.Offset + 6);
    }

    public void setTTL(int i) {
        CommonMethods.writeInt(this.Data, this.Offset + 6, i);
    }

    public short getDataLength() {
        return CommonMethods.readShort(this.Data, this.Offset + 10);
    }

    public void setDataLength(short s) {
        CommonMethods.writeShort(this.Data, this.Offset + 10, s);
    }

    public int getIP() {
        return CommonMethods.readInt(this.Data, this.Offset + 12);
    }

    public void setIP(int i) {
        CommonMethods.writeInt(this.Data, this.Offset + 12, i);
    }
}
