package TestProject;


import TestProject.config.springConfig;
import TestProject.domain.serviceForTestEntity;
import TestProject.domain.testEntity;
import TestProject.service.serviceForTestEntityImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args ) {

        ApplicationContext context1 = new AnnotationConfigApplicationContext(springConfig.class);

        for (String a :context1.getBeanDefinitionNames()) {
            System.out.println(a);

        }

        serviceForTestEntity service = (serviceForTestEntity)context1.getBean("serviceForTestEntityImpl");
        service.createEntity("Alexandr",1);
        service.createEntity("Alexey",2);
        service.createEntity("Eugene",3);

        service.deleteEntity("Alexandr");

        testEntity e = service.getByID(3);
        System.out.println(e);

        System.out.println();
        e = service.getByName("Alexey");
        System.out.println(e);

        System.out.println();
        List<testEntity> listOfAll = service.getAll();
        Iterator<testEntity> itr = listOfAll.iterator();
        while (itr.hasNext()){
            testEntity temp = itr.next();
            System.out.println(temp);
        }
    }
}
