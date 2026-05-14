package com.smartqueue.user_service.model;

public class Notification {

    private Long id;
    private Long userId;
    private Long bookingId;
    private String message;
    private String status;

    public Notification() {
    }

    public Notification(Long id, Long userId, Long bookingId, String message, String status) {
        this.id = id;
        this.userId = userId;
        this.bookingId = bookingId;
        this.message = message;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}