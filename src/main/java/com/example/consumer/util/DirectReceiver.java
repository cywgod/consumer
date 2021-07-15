package com.example.consumer.util;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class DirectReceiver {

    @RabbitHandler
    @RabbitListener(queues = "TestDirectQueue")
    public  void process(Map getMessge, Message message){
        Map map = JSON.parseObject(message.getBody(), Map.class);
        System.out.println(map);
        System.out.println("DirectReceiver---收到"+getMessge.toString());
    }
}
