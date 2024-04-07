package com.amigoscode.clients.fraud.notification;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NotificationRequest {
    private Integer id;
    private String email;
    private String message;
    private String service;
}
