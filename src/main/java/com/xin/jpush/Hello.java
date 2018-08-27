package com.xin.jpush;

import com.xin.jpush.config.filter.jpushFilter;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class Hello {

//    @Autowired
//    FilterRegistrationBean jpushFilter;

    @RequestMapping(value = "/tt", method = RequestMethod.GET)
    public String test() {
        return "hello1.html";
    }

//   public Map<String,String> hello(){
//        Map<String,String> init=jpushFilter.getInitParameters();
//        return init;
//   }
}
