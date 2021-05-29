package com.enterprise;

import com.enterprise.annotations.CFO;
import com.enterprise.annotations.EmployeeSettings;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UseAnnotationsTwo {

    public static void main(String[] args) {

        // Leer el xml de configuración
        // Ahora leemos la configuración desde un class
        // ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("appContextAnnotations.xml");

        // Leer el class de configuración :nice:
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EmployeeSettings.class);


        // Pedir un bean al contenedor
/*
        Employee Joan = ctx.getBean("experiencedCommercial", Employee.class);
        Employee Luis = ctx.getBean("experiencedCommercial", Employee.class);

        // ¿ Apuntan al mismo objeto en memoria ?
        System.out.println(Joan == Luis
                ? "Apuntan al mismo lugar de memoria"
                : "NO apuntan al mismo lugar de memoria"
        );

        System.out.println(Joan + "\n" + Luis);
*/
/*
        Employee employee = ctx.getBean("CFO", Employee.class);

        System.out.println(employee.getTasks());
        System.out.println(employee.getReport());
*/
        CFO cfo = ctx.getBean("CFO", CFO.class);

        System.out.println("Email del director " + cfo.getEmail());
        System.out.println("Nombre de la empresa " + cfo.getNameCompany());
//        System.out.println(cfo.getNewFinancialReport());

        // Cerramos el contexto
        ctx.close();
    }
}
