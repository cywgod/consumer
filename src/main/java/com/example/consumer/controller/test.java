package com.example.consumer.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class test {

    @RequestMapping("/testPost")
    @ResponseBody
    public Map testPost(@RequestBody String map){
        System.out.println(map);
        Gson gson = new GsonBuilder().create();
        Map zhi = gson.fromJson(map, Map.class);
        System.out.println(zhi.get("user"));
        Map map1 = new HashMap();
        map1.put("code", 200);
        return map1;
    }
}
