package com.enterprise;

import com.enterprise.annotations.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsSingProto {

    public static void main(String[] args) {

        // Leer el xml de configuración
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("appContextAnnotations.xml");


        // Pedir un bean al contenedor
        Employee Joan = ctx.getBean("experiencedCommercial", Employee.class);
        Employee Luis = ctx.getBean("experiencedCommercial", Employee.class);

        // ¿ Apuntan al mismo objeto en memoria ?
        System.out.println(Joan == Luis
                ? "Apuntan al mismo lugar de memoria"
                : "NO apuntan al mismo lugar de memoria"
        );

        System.out.println(Joan +  "\n" + Luis);

        // Cerramos el contexto
        ctx.close();
    }
}
