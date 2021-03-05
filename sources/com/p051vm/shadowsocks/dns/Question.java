package com.p051vm.shadowsocks.dns;

import java.nio.ByteBuffer;

/* renamed from: com.vm.shadowsocks.dns.Question */
public class Question {
    public short Class;
    public String Domain;
    public short Type;
    private int length;
    private int offset;

    public int Offset() {
        return this.offset;
    }

    public int Length() {
        return this.length;
    }

    public static Question FromBytes(ByteBuffer byteBuffer) {
        Question question = new Question();
        question.offset = byteBuffer.arrayOffset() + byteBuffer.position();
        question.Domain = DnsPacket.ReadDomain(byteBuffer, byteBuffer.arrayOffset());
        question.Type = byteBuffer.getShort();
        question.Class = byteBuffer.getShort();
        question.length = (byteBuffer.arrayOffset() + byteBuffer.position()) - question.offset;
        return question;
    }

    public void ToBytes(ByteBuffer byteBuffer) {
        this.offset = byteBuffer.position();
        DnsPacket.WriteDomain(this.Domain, byteBuffer);
        byteBuffer.putShort(this.Type);
        byteBuffer.putShort(this.Class);
        this.length = byteBuffer.position() - this.offset;
    }
}
