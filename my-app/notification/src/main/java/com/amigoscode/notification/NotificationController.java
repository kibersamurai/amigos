package com.amigoscode.notification;

import lombok.RequiredArgsConstructor;
import com.amigoscode.clients.fraud.notification.NotificationRequest;
import com.amigoscode.notification.NotificationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/notification")
public class NotificationController {
    private final NotificationService notificationService;
    @PostMapping
    public void saveNotification(@RequestBody NotificationRequest notificationRequest) {
        notificationService.sendNotification(notificationRequest);
    }
}
