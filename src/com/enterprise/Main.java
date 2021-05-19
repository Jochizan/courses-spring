package com.enterprise;

import com.enterprise.models.Employee;
//import com.company.models.Directory; -> ya no necesitamos importarlo
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Create Objects of the Employee
        // Employee boss = new Directory();

        // Using Created Objects
        // System.out.println(boss.getTasks());
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee Joan = ctx.getBean("myEmployee", Employee.class);

        System.out.println(Joan.getTasks());

        System.out.println(Joan.getReport());

        ctx.close();
    }
}
