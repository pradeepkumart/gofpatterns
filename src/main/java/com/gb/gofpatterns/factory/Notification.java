package com.gb.gofpatterns.factory;

public class Notification {

    private String message;
    private String header;
    private String footer;
    private String receipient;
    private String sender;

    public Notification(String message, String header,
                        String footer, String receipient,
                        String sender) {
        this.message = message;
        this.header = header;
        this.footer = footer;
        this.receipient = receipient;
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }

    public String getReceipient() {
        return receipient;
    }

    public String getSender() {
        return sender;
    }
}
