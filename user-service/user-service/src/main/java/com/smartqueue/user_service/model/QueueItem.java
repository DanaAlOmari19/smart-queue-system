package com.smartqueue.user_service.model;

public class QueueItem {

    private Long id;
    private Long bookingId;
    private Long userId;
    private String locationName;
    private int queueNumber;
    private String status;

    public QueueItem() {
    }

    public QueueItem(Long id, Long bookingId, Long userId, String locationName, int queueNumber, String status) {
        this.id = id;
        this.bookingId = bookingId;
        this.userId = userId;
        this.locationName = locationName;
        this.queueNumber = queueNumber;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public Long getUserId() {
        return userId;
    }

    public String getLocationName() {
        return locationName;
    }

    public int getQueueNumber() {
        return queueNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public void setQueueNumber(int queueNumber) {
        this.queueNumber = queueNumber;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}