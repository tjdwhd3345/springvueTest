package com.example.hometest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "hi intelliJ spring boot!";
    }

    @RequestMapping("test1")
    @ResponseBody
    public Map<String, Object> test1() {
        Map<String, Object> ret = new HashMap<String, Object>();
        ret.put("key1", "value1");
        ret.put("key2", "value2");

        return ret;
    }

    @RequestMapping("test2")
    @ResponseBody
    public Map<String, Object> test2() {
        Map<String, Object> result = new HashMap<>();
        List<Object> list = new ArrayList<>();

        Map<String, Object> ret1 = new HashMap<String, Object>();
        ret1.put("key1", "value1");
        ret1.put("key2", "value2");
        list.add(ret1);

        Map<String, Object> ret2 = new HashMap<String, Object>();
        ret2.put("key3", "value3");
        ret2.put("key4", "value4");
        list.add(ret2);

        result.put("data",list);

        return result;
    }

}
