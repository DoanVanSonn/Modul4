package com.codegym.model;

public class Translate {
    private int pageSize;
    private boolean spamsFillter;
    private String signature;

    public Translate() {
    }

    public Translate(int pageSize, boolean spamsFillter, String signature) {
        this.pageSize = pageSize;
        this.spamsFillter = spamsFillter;
        this.signature = signature;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isSpamsFillter() {
        return spamsFillter;
    }

    public void setSpamsFillter(boolean spamsFillter) {
        this.spamsFillter = spamsFillter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
