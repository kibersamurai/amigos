package com.amigoscode.notification;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.amigoscode.clients.fraud.notification.NotificationRequest;
import com.amigoscode.notification.Notification;
import com.amigoscode.notification.NotificationRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
@Slf4j
public class NotificationService {
    private final NotificationRepository notificationRepository;

    public void sendNotification(NotificationRequest notificationRequest) {
        Notification notification = Notification.builder()
                .message(notificationRequest.getMessage())
                .toCustomerId(notificationRequest.getId())
                .service(notificationRequest.getService())
                .toCustomerEmail(notificationRequest.getEmail())
                .sentAt(LocalDateTime.now())
                .build();
        notificationRepository.saveAndFlush(notification);
    }
}
