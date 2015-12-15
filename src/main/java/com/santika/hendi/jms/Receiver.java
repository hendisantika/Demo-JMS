/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santika.hendi.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 *
 * @author hendi.santika
 */
public class Receiver implements MessageListener{
    public void onMessage(Message msg){
        if (msg instanceof TextMessage) {
            TextMessage txtMsg = (TextMessage) msg;
            try {
                System.out.println(txtMsg.getText());
            } catch (JMSException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Unsupported message type : "+msg.getClass());
        }
    }  
    
}
