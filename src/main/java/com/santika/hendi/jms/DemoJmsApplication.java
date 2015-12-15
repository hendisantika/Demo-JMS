package com.santika.hendi.jms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class DemoJmsApplication {

    public static void main(String[] args) {
//        SpringApplication.run(DemoJmsApplication.class, args);
        ApplicationContext ctx = new ClassPathXmlApplicationContext("jms-ctx.xml");
        Sender sender = (Sender) ctx.getBean("sender");

        sender.setMessage("Percobaan menggunakan JMS dengan Spring. ");     
        sender.send();
        System.out.println("Pesan 1 telah dikirim!");

        sender.setMessage("Pesan ini seharusnya diterima oleh Message Driven POJO");
        sender.send();
        
        System.out.println("Pesan 2 telah dikirim!");
    }
}
