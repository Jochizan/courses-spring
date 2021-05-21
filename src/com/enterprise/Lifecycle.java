package com.enterprise;

import com.enterprise.models.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lifecycle {

    public static void main(String[] args) {

        // Cargar el xml de configuración
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("appContextThree.xml");

        // Obtención del bean
        Employee Joan = ctx.getBean("myEmployee", Employee.class);

        System.out.println(Joan.getReport());

        // Cerrar contexto
        ctx.close();
    }
}
