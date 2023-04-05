package RestServicePart2.restpart2.Internationalization;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ques2 {
    @GetMapping("/hello/{name}")
    public String get(@PathVariable String name){

        return "hello"+" "+name;
    }
}
