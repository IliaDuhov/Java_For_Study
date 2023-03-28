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
}
