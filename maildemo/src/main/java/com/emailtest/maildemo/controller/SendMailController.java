package com.emailtest.maildemo.controller;

import com.emailtest.maildemo.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMailController {
   SendMailService sendMailService;
    public SendMailController(SendMailService sendMailService){
     this.sendMailService = sendMailService;
    }

    @GetMapping("sendMail")
    public String sendEmail(@RequestParam String to, @RequestParam String body, @RequestParam String subject){
        sendMailService.sendEmail(to,body,subject);
        return "send successfully";
    }
}
