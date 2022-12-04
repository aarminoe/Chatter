package com.example.Chatter.service;

import com.example.Chatter.model.Message;

import java.util.List;

public interface MessageService {

    public Message saveMessage(Message message);
    public List<Message> getAllMessages();
    public void deleteMessage(Integer id);
}
