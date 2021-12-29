package com.example.TokenTestProj.Service;

import com.example.TokenTestProj.DTO.Request.MessageRequest;
import com.example.TokenTestProj.DTO.Response.MessageResponse;
import com.example.TokenTestProj.Mapper.MessageMapper;
import com.example.TokenTestProj.Model.MessageBox;
import com.example.TokenTestProj.Repository.MessageBoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MessageService {

    @Autowired
    MessageBoxRepository messageBoxRepository;

    @Autowired
    MessageMapper messageMapper;

    public void addNew(MessageRequest messageRequest){
        MessageBox messageBox = new MessageBox();
        messageBox.setMessage(messageRequest.getMessage());
        messageBox.setName(messageRequest.getName());
        messageBoxRepository.save(messageBox);
    }

    public List<MessageResponse> getAllMess(){
        List<MessageBox> all = messageBoxRepository.findAll();
        List<MessageResponse> collect = all.stream().map(x -> messageMapper.mapToDTO(x)).collect(Collectors.toList());
        return collect;
    }
}
