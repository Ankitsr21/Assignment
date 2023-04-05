package RestServicePart2.restpart2.HateOAS;

import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.*;

import org.springframework.hateoas.EntityModel;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HateOASApi {
    List<Student> list=new ArrayList<>();

    @PostMapping("/student")
    public String addStudent(@RequestBody Student s){
        list.add(s);
        return "Student added";
    }
    @GetMapping("/student")
    public List<Student>allstudent(){

        return list;
    }
    @GetMapping("/student/{id}")
    public EntityModel<Student>getSpecific(@PathVariable int id){
        Student s=list.stream().filter(e->e.getId()==id).findFirst().orElse(null);
        if(s==null){
            throw new StudentException("no element"+id);
        }
        EntityModel<Student>ent =EntityModel.of(s);
        WebMvcLinkBuilder wbc= linkTo(methodOn(this.getClass()).allstudent());
        ent.add(wbc.withRel("all-student"));

        return ent;
    }
}
