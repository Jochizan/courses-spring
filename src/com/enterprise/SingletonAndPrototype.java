package com.enterprise;

import com.enterprise.models.Secretary;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonAndPrototype {

    public static void main(String[] args) {

        // Carga de xml de configuración
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("appContextTwo.xml");

        // Petición de beans al contenedor de Spring

        Secretary Ana = ctx.getBean("mySecretary", Secretary.class);
        Secretary Rosa = ctx.getBean("mySecretary", Secretary.class);
        Secretary Ariel = ctx.getBean("mySecretary", Secretary.class);
        Secretary Shiro = ctx.getBean("mySecretary", Secretary.class);
        Secretary Rom = ctx.getBean("mySecretary", Secretary.class);

        System.out.println(Ana);
        System.out.println(Rosa);
        System.out.println(Ariel);
        System.out.println(Shiro);
        System.out.println(Rom);

//        if (Ana == Rosa) {
//            System.out.println("Apuntan al mismo objeto");
//        } else {
//            System.out.println("No se trata del mismo del objeto");
//        }
        ctx.close();
    }
}
