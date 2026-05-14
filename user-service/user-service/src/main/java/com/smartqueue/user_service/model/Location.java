package com.smartqueue.user_service.model;

public class Location {

    private Long id;
    private String name;
    private String type;
    private String address;
    private int waitingCount;
    private String status;

    public Location() {
    }

    public Location(Long id, String name, String type, String address, int waitingCount, String status) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.address = address;
        this.waitingCount = waitingCount;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getAddress() {
        return address;
    }

    public int getWaitingCount() {
        return waitingCount;
    }

    public String getStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setWaitingCount(int waitingCount) {
        this.waitingCount = waitingCount;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}