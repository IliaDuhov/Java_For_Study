package CityTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestableCitySpring {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("CityTest");
        City city = (City)applicationContext.getBean("newCity");
        City city1 = applicationContext.getBean(City.class);
        System.out.println(city);
        System.out.println(city1);

    }
}
