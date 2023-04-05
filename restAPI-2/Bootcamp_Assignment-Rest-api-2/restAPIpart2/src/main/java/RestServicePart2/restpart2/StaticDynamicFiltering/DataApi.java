package RestServicePart2.restpart2.StaticDynamicFiltering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DataApi {
    List<Data> dataList= new ArrayList<>();

    @GetMapping("/data")
    public List<Data>getDatalist(){
        return dataList;
    }
    @PostMapping("/data")
    public String AddToDta(@RequestBody Data d1){
        dataList.add(d1);
        return "data added";
    }
}
