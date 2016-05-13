package testProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Admin on 11.05.2016.
 */
public class mainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(springConfig.class);
        System.out.println(context.getBean("returnTestSOUT").toString());
    }
}
