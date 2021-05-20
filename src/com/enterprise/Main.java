package com.enterprise;

//import com.enterprise.models.Employee;
//import com.company.models.Directory; -> ya no necesitamos importarlo

import com.enterprise.models.Directory;
//import com.enterprise.models.Secretary;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Create Objects of the Employee
        // Employee boss = new Directory();

        // Using Created Objects
        // System.out.println(boss.getTasks());
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        /* Employee Joan = ctx.getBean("myEmployee", Employee.class); -> Primeras pruebas con Employee

        System.out.println(Joan.getTasks());

        System.out.println(Joan.getReport()); */

        /*Secretary Ana = ctx.getBean("mySecretary", Secretary.class); -> Segundas pruebas cambiando dependiendo de la clase
        Secretary Rosa = ctx.getBean("mySecretary", Secretary.class);

        System.out.println(Ana.getTasks());

        System.out.println(Ana.getReport());

        System.out.println("Email: " + Ana.getEmail());

        System.out.println("Empresa: " + Ana.getCompanyName());

        System.out.println("Email: " + Rosa.getEmail());*/

        Directory Ana = ctx.getBean("myEmployee", Directory.class);

        System.out.println(Ana.getTasks());

        System.out.println(Ana.getReport());

        System.out.println(Ana.getEmail());

        System.out.println(Ana.getCompanyName());

        ctx.close();
    }
}
