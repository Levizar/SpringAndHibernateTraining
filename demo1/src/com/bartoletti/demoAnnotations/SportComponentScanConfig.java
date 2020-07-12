package com.bartoletti.demoAnnotations;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.bartoletti.demoAnnotations")
public class SportComponentScanConfig {
    // This class is using annotation to configure the context
    // @Configuration define the file as a configuration one
    // @ComponentScan("com.bartoletti.demoAnnotations") tells to scan the app for beans annotations
}
