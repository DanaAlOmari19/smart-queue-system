package com.smartqueue.user_service.model;

public class Booking {

    private Long id;
    private Long userId;
    private String locationName;
    private String status;
    private int queueNumber;

    public Booking() {
    }

    public Booking(Long id, Long userId, String locationName, String status, int queueNumber) {
        this.id = id;
        this.userId = userId;
        this.locationName = locationName;
        this.status = status;
        this.queueNumber = queueNumber;
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public String getLocationName() {
        return locationName;
    }

    public String getStatus() {
        return status;
    }

    public int getQueueNumber() {
        return queueNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setQueueNumber(int queueNumber) {
        this.queueNumber = queueNumber;
    }
}
