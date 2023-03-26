package com.springFrameworkPart1.SpringFrameworkPart1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

interface myInterface1{
    void showMarks();
}
@Component
class Student1 implements myInterface1{

    @Override
    public void showMarks() {
        System.out.println("Student1 passed");
    }
}

class Student2 implements myInterface1{
    @Override
    public void showMarks() {
        System.out.println("Student2 Failed");
    }
}

@Component
class Result{
    private myInterface1 obj;
    @Autowired
    public Result(myInterface1 obj) {
        this.obj = obj;
    }

    public void display(){
        obj.showMarks();
    }
}
@SpringBootApplication
public class Ques3 {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Ques3.class);
        Result res = context.getBean(Result.class);
        res.display();
        System.out.println(res);
    }

}
