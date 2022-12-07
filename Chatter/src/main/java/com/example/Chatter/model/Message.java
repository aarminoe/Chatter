package com.example.Chatter.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String messageText;
    private String whoMessaged;

    public Message(String whoMessaged) {
        this.whoMessaged = whoMessaged;
    }

    public Message(int id, String messageText, String whoMessaged) {
        this.id = id;
        this.messageText = messageText;
        this.whoMessaged = whoMessaged;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
}
