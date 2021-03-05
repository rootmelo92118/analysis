package com.p051vm.shadowsocks.dns;

import java.nio.ByteBuffer;

/* renamed from: com.vm.shadowsocks.dns.Resource */
public class Resource {
    public short Class;
    public byte[] Data;
    public short DataLength;
    public String Domain;
    public int TTL;
    public short Type;
    private int length;
    private int offset;

    public int Offset() {
        return this.offset;
    }

    public int Length() {
        return this.length;
    }

    public static Resource FromBytes(ByteBuffer byteBuffer) {
        Resource resource = new Resource();
        resource.offset = byteBuffer.arrayOffset() + byteBuffer.position();
        resource.Domain = DnsPacket.ReadDomain(byteBuffer, byteBuffer.arrayOffset());
        resource.Type = byteBuffer.getShort();
        resource.Class = byteBuffer.getShort();
        resource.TTL = byteBuffer.getInt();
        resource.DataLength = byteBuffer.getShort();
        resource.Data = new byte[(resource.DataLength & 65535)];
        byteBuffer.get(resource.Data);
        resource.length = (byteBuffer.arrayOffset() + byteBuffer.position()) - resource.offset;
        return resource;
    }

    public void ToBytes(ByteBuffer byteBuffer) {
        if (this.Data == null) {
            this.Data = new byte[0];
        }
        this.DataLength = (short) this.Data.length;
        this.offset = byteBuffer.position();
        DnsPacket.WriteDomain(this.Domain, byteBuffer);
        byteBuffer.putShort(this.Type);
        byteBuffer.putShort(this.Class);
        byteBuffer.putInt(this.TTL);
        byteBuffer.putShort(this.DataLength);
        byteBuffer.put(this.Data);
        this.length = byteBuffer.position() - this.offset;
    }
}
