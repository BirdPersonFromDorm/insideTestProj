package com.example.TokenTestProj.Controller;

import com.example.TokenTestProj.DTO.Request.MessageRequest;
import com.example.TokenTestProj.DTO.Response.MessageResponse;
import com.example.TokenTestProj.Model.MessageBox;
import com.example.TokenTestProj.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController {

    @Autowired
    MessageService messageService;

    @PostMapping("/user/addNewMessage")
    public void addNewMessage(@RequestBody MessageRequest messageRequest) {
        messageService.addNew(messageRequest);
    }

    @GetMapping("/user/getAllMessage")
    public List<MessageResponse> getAllMessage() {
        return messageService.getAllMess();
    }

}
