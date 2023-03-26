package com.springFrameworkPart1.SpringFrameworkPart1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

interface myInterface2{
    void showMarks();
}
@Component
class Student3 implements myInterface2{

    @Override
    public void showMarks() {
        System.out.println("Student1 passed");
    }
}
@Component
@Primary
class Student4 implements myInterface2{
    @Override
    public void showMarks() {
        System.out.println("Student2 Failed");
    }
}

@Component
class Result1{
    private myInterface2 obj;
    @Autowired
    public Result1(myInterface2 obj) {
        this.obj = obj;
    }

    public void display(){
        obj.showMarks();
    }
}
@SpringBootApplication
public class Ques5 {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Ques5.class);
        Result1 res = context.getBean(Result1.class);
        res.display();
        System.out.println(res);
    }

}
