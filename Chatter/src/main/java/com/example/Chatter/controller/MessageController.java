package com.example.Chatter.controller;

import com.example.Chatter.model.Message;
import com.example.Chatter.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/message")
@CrossOrigin
public class MessageController {
    @Autowired
    private MessageService messageService;

    @PostMapping("/new")
    public String add(@RequestBody Message message) {
        messageService.saveMessage(message);
        return "Message Added!";
    }

    @GetMapping("/all")
    public List<Message> getAllUsers() {
        return messageService.getAllMessages();
    }

    @DeleteMapping("/all/{id}")
    public void deleteUser(@PathVariable Integer id) {
        messageService.deleteMessage(id);
    }
}
