package com.example.Chatter.service;

import com.example.Chatter.model.Message;
import com.example.Chatter.repository.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImplement implements MessageService {
    @Autowired
    private MessageRepo messageRepo;

    @Override
    public Message saveMessage(Message message) {
        return messageRepo.save(message);
    }

    @Override
    public List<Message> getAllMessages() {
        return messageRepo.findAll();
    }

    @Override
    public void deleteMessage(Integer id) {
        messageRepo.deleteById(id);
    }
}
