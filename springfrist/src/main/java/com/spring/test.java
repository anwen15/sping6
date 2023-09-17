package com.spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void testuser() {
        //加载配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        //获取创建的对象
        user user = (user)context.getBean("user");
        //调用对象
        user.add();
    }
}
