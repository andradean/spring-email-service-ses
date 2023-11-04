package com.vinicius.emailservice.adapters;

public interface EmailSenderGateway {

    void sendEmail(String to, String subject, String body);
} 
