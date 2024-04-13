package com.amigoscode.notification;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.amigoscode.clients.fraud.notification.NotificationRequest;
import com.amigoscode.notification.NotificationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("api/v1/notification")
public class NotificationController {
    private final NotificationService notificationService;
    @PostMapping
    public void saveNotification(@RequestBody NotificationRequest notificationRequest) {
        notificationService.sendNotification(notificationRequest);
        log.info("notification saved: {}", notificationRequest);
    }
}
