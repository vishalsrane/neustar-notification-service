package com.neustar.notificationservice.controller;

import com.neustar.notificationservice.data.dto.Email;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email-notification")
public class EmailNotificationController {

    @PostMapping
    public ResponseEntity<Boolean> processEmail(@RequestBody Email email){
        System.out.println("Email is will be sent to ");
        return new ResponseEntity<>(true, HttpStatus.OK);

    }
}


