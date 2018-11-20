package com.spring.cloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.*;

/**
 * @Project_Name：springclouds
 * @Package_Name：com.spring.cloud
 * @Description：
 * @Author：zhuoyuexin
 * @Create in  11:17 2018/9/11
 * @Version： v1.0
 * @Modifiled By
 * @Note：
 **/
@Controller
public class IndexControllrt {
    private final static String TITLE="弹窗";
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/demo")
    public String demo(){
        return "demo";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        //Object[] options = {"继续工作","下班啦"}; //弹窗
      //  int response= JOptionPane.showOptionDialog(new JFrame(), "休息一下吧~","",JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        System.out.println("任务提醒！");
        InfoUtil test = new InfoUtil();
        test.show(TITLE, "需写工作日志！");
        return "test";
    }

}
