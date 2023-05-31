package com.khadri.spring.core.main;


import com.khadri.spring.core.beans.Bean1;
import com.khadri.spring.core.beans.Bean2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Bean1 bean1 = (Bean1) context.getBean("lunchFood");

      String[] arrayNames =   context.getAliases("bean1");

        for (String name: arrayNames) {
            System.out.println("Alias Name "+name);
        }


        Bean2 bean2 = (Bean2) context.getBean("com.khadri.spring.core.beans.Bean2#0");
        System.out.println("Bean2 "+bean2);

        Bean2 bean3 = (Bean2) context.getBean("com.khadri.spring.core.beans.Bean2#1");
        System.out.println("Bean2 "+bean3);

        }
}