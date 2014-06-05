package net.shopin.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 说明:
 * User: kongming
 * Date: 14-6-5
 * Time: 下午3:05
 */
public class BeanTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aopbeans.xml");
        Chinese c = context.getBean("chinese",Chinese.class);

        System.out.println(c.sayHello("kongm aop"));
    }

}
