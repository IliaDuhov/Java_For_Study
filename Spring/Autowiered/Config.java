package AutowieredTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public A a1(){
        return new A("Hello, A");
    }
//    @Bean
//    public int num(){
//        return 42;
//    }
    @Bean
    public String str(){
        return "Hello, world";
    }
//    @Bean
//    public String str123(){
//        return "Bullshit";
//    }
      //если в сеттере внедрять str123, то в поле внедрится Bullshit, так как методы последние инициализируют поля
     //порядок внедрения 1. Конструткоры
                    //   2. Поля
                    //   3. Сеттеры
}
