package com.ycf;

import com.alibaba.dubbo.container.Main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sniper on 16-8-10.
 */
public class Launcher {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/applicationContext.xml");
        ContextInit contextInit = new ContextInit();
        contextInit.initContext();
        Main.main(null);
    }
}
