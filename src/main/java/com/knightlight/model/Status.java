package com.knightlight.model;

public class Status {
    private static final String STATUS_ON = "ON";
    private static final String STATUS_OFF = "OFF";

    private static final String SERVER_TYPE = "java spring boot";
    public String status;
    public String server = SERVER_TYPE;

    public Status(){
        this.status = STATUS_OFF;
    }

    public void setStatusOn(){
        this.status = STATUS_ON;
    }

    public void setStatusOff(){
        this.status = STATUS_OFF;
    }
}
