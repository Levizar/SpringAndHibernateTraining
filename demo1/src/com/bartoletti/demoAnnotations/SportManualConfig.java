package com.bartoletti.demoAnnotations;

import com.bartoletti.demoAnnotations.coach.ICoach;
import com.bartoletti.demoAnnotations.coach.SwimCoach;
import com.bartoletti.demoAnnotations.service.IFortuneService;
import com.bartoletti.demoAnnotations.service.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportManualConfig {

    // Configuration in plain java without annotations
    // define bean for our fortune - TRhe methodName will be the bean ID
    @Bean
    public IFortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    // define bean for swim coach and inject dependencies
    @Bean
    public ICoach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }

}
