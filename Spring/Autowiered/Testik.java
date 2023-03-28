package AutowieredTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testik {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("AutowieredTest");
        System.out.println(applicationContext.getBean(InjectTest.class));
    }
}
