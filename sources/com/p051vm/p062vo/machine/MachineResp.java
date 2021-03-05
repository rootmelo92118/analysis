package com.p051vm.p062vo.machine;

import java.io.Serializable;
import java.util.List;

/* renamed from: com.vm.vo.machine.MachineResp */
public class MachineResp implements Serializable {
    private static final long serialVersionUID = -5374936560498595610L;
    private List<String> backups;
    private String prefer;

    public String getPrefer() {
        return this.prefer;
    }

    public void setPrefer(String str) {
        this.prefer = str;
    }

    public List<String> getBackups() {
        return this.backups;
    }

    public void setBackups(List<String> list) {
        this.backups = list;
    }
}
