package com.example.Chatter.repository;

import com.example.Chatter.model.Message;
import com.example.Chatter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepo extends JpaRepository<Message, Integer> {

}
