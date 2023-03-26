package com.springFrameworkPart1.SpringFrameworkPart1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class Ques4 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
        College obj = context.getBean("collegeBean", College.class);
        obj.test();
    }
}

class College{
    public void test(){
        System.out.println("Application Context");
    }
}
@Configuration
class CollegeConfig{
    @Bean
    public College collegeBean() {
        return new College();
    }
}