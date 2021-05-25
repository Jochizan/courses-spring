package com.enterprise;

import com.enterprise.annotations.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseAnnotations {

    public static void main(String[] args) {

        // Leer el XML de configuración
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("appContextAnnotations.xml");

        // Pedir un bean al contenedor
        Employee Joan = ctx.getBean("experiencedCommercial", Employee.class);

        // Usa el bean
        System.out.println(Joan.getReport());
        System.out.println(Joan.getTasks());

        // Cerrar el contexto
        ctx.close();
    }
}
