/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santika.hendi.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

/**
 *
 * @author hendi.santika
 */
public class Sender {
    private String message = "default message";
    private JmsTemplate jmsTemplate;

    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void send() {
        jmsTemplate.send(new MessageCreator(){
            public Message createMessage(Session sess) throws JMSException {
                return sess.createTextMessage(message);
            }           
        });
    }
    
}
