package com.spring;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.spring.JSonUtil;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.apache.logging.log4j.message.MapMessage.MapFormat.JSON;


@Controller
class    Test2Controller {

    @RequestMapping("/index")
    public String test(){
        return "test";
    }

    @RequestMapping("/index2")
    @ResponseBody
    public Object test2(){
        Map<String,Object> obj=new HashMap<String,Object>();
        List list=new ArrayList();
        list.add("wwww");
        list.add("asdasd");
        list.add("dadasd");
        obj.put("AD",list);

        return list;
    }


    @RequestMapping("/index3")
    @ResponseBody
    public String test3(String name){
        return "sucess";
    }
}
