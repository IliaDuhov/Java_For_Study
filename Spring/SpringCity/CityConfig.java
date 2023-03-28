package CityTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CityConfig {
    @Bean
    public Electricity newElectricity(){
        return new Electricity();
    }
    @Bean
    public Industrial newIndustrial(){
        return new Industrial();
    }
    @Bean
    @Scope("prototype")//кеширование не производится. Сравни хеш-код элементов двух city
    public Pipeline newPipeline(){
        return new Pipeline();
    }
    @Bean
    @Scope("prototype")//кеширование не производится. Сравни хеш-код элементов двух city
    public City newCity(Electricity newElectricity, Industrial newIndustrial, Pipeline newPipeline){
        return new City(newPipeline, newElectricity, newIndustrial);
    }
}
