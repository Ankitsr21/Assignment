package RestServicePart2.restpart2.Versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    List<User1> l1=new ArrayList<>();
    List<User2>l2=new ArrayList<>();
    @GetMapping("/v1/user")
    public List<User1>getUser1(){
        return l1;
    }
    @PostMapping("/v1/user")
    public String addUser1(@RequestBody User1 u){
        l1.add(u);
        return "user added";
    }


    @GetMapping("/v2/user")
    public List<User2>getUser2(){
        return l2;
    }
    @PostMapping("/v2/user")
    public String addUser2(@RequestBody User2 u){
        l2.add(u);
        return "new user added";
    }
    @GetMapping(path="/v1/user",params = "version1")
    public List<User1>getversion1Param(){
        return l1;
    }

    @GetMapping(path="/v2/user",params = "version2")
    public List<User2>getadvanceversion1Param(){
        return l2;
    }

    @GetMapping(path="/user/header",headers = "API=1")
    public List<User1>getversion1header(){
        return l1;
    }

    @GetMapping(path="/user/header",headers = "API=2")
    public List<User2>getadvanceversion1header(){
        return l2;
    }
}
