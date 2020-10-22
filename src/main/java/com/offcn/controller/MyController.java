package com.offcn.controller;

import com.offcn.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class MyController {
    @RequestMapping("/index")
    public String index(Model model){
        String message = "thymeleaf thymeleaf";
        model.addAttribute("message",message);
        System.out.println(1);
        System.out.println(222);
        return "index";
    }

    @RequestMapping("/getUser")
    public String getUser(Model model){
        User user = new User(1,"张三",23);
        model.addAttribute("user",user);
        Map<String,Object> map = new HashMap<>();
        map.put("src1","1.jpg");
        map.put("src2","2.jpg");
        model.addAttribute("src",map);
        return "index2";
    }

    @RequestMapping("/getUserList")
    public String getUserList(Model model){
        List<User> list = new ArrayList<>();
        list.add(new User(1,"zs",23));
        list.add(new User(2,"ls",24));
        list.add(new User(3,"ww",25));
        list.add(new User(4,"zl",26));
        list.add(new User(5,"wq",27));
        model.addAttribute("list",list);
        return "index3";
    }

    @RequestMapping("/index4")
    public String index4(Model model){
        model.addAttribute("username","张三");
        model.addAttribute("href","https://www.baidu.com");
        return "index4";
    }

    @RequestMapping("/index5")
    public String index5(Model model){
        model.addAttribute("result","y");
        model.addAttribute("menu","admin");
        model.addAttribute("manager","manager");
        return "index5";
    }

    @RequestMapping("/index6")
    public String index6(){
        return "index6";
    }

    @RequestMapping("/index7")
    public String index7(Model model){
        Date date = new Date();
        model.addAttribute("date",date);
        model.addAttribute("num",12.34);
        model.addAttribute("str","2020-10-22 11:45:42.931  INFO 11696 --- [nio-8080-exec-2] o.s.web.servlet.DispatcherServlet        : Completed initialization in 10 ms");
        String str = "abc-def-gh";
        model.addAttribute("str2",str);
        return "index7";
    }


}
