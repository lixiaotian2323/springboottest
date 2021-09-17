package com.example.consumer.controller;

import com.example.provider.entity.UserBean;
import com.example.provider.service.ProviderService;
import com.example.provider.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lixiaotian
 * @since 2021/06/21 15:16
 */
@Controller
@Slf4j
public class ConsumerController {

    @Autowired
    private ProviderService providerService;
    @Autowired
    private UserService userService;

    @GetMapping("/setValue")
    @ResponseBody
    public String set1(){
        String a = providerService.setValue();
        log.info(a);
        return a ;
    }
    @GetMapping("/Test")
    @ResponseBody
    public String test() {
        String res = "{\"date\":\"2021/07/28\",\"project\":\"LAY\",\"batchId\":\"202107282\",\"filename\":\"claim.csv\",\"count\":28,\"path\":\"/app/data/lxt/\",\"dealtime\":\"2021/07/27\"}";
        return res;
    }

    @RequestMapping(value = "/loginIn",method = RequestMethod.GET)
    @ResponseBody
    public String login(int id){
        String name = userService.loginIn(id);
        if(name!=null){
            SimpleDateFormat sdf = new SimpleDateFormat();
            sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");
            Date date = new Date();
            log.info("登陆时间："+ sdf.format(date),"登陆用户："+name );
            return "success";
        }else {
            return "error";
        }
    }


}
