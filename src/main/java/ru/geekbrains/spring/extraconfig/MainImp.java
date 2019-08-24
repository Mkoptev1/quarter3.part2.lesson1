package ru.geekbrains.spring.extraconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainImp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(new Class[]{MainConfig.class});
        TestServiceA testServiceNewA = (TestServiceA)context.getBean(TestServiceA.class);
        TestServiceB testServiceNewB = (TestServiceB)context.getBean(TestServiceB.class);
        System.out.println("testServiceA: " + testServiceNewA);
        System.out.println("testServiceB: " + testServiceNewB);
    }
}
