package com.example.TokenTestProj.Mapper;

import com.example.TokenTestProj.DTO.Request.MessageRequest;
import com.example.TokenTestProj.DTO.Response.MessageResponse;
import com.example.TokenTestProj.Model.MessageBox;
import org.springframework.stereotype.Component;

@Component
public class MessageMapper {

    public MessageResponse mapToDTO(MessageBox messageBox) {
        MessageResponse messageResponse = new MessageResponse();
        messageResponse.setMessage(messageBox.getMessage());
        messageResponse.setName(messageBox.getName());
        return messageResponse;
    }

}
