package RestServicePart2.restpart2.StaticDynamicFiltering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class DynamicApi {
    List<DynamicData> List= new ArrayList<>();


    @GetMapping("/dynamic")
    public MappingJacksonValue getDyanamicDatalist(){
        MappingJacksonValue mp =new MappingJacksonValue(List);
        SimpleBeanPropertyFilter myfilter= SimpleBeanPropertyFilter.filterOutAllExcept("field1","field2");
        FilterProvider flr = new SimpleFilterProvider().addFilter("dynamicFilter",myfilter);
        mp.setFilters(flr);
        return mp;
    }

    @GetMapping("/dynamic2")
    public MappingJacksonValue getDyanamicDatalist2(){
        MappingJacksonValue mp =new MappingJacksonValue(List);
        SimpleBeanPropertyFilter myfilter=SimpleBeanPropertyFilter.filterOutAllExcept("field2");
        FilterProvider flr = new SimpleFilterProvider().addFilter("dynamicFilter",myfilter);
        mp.setFilters(flr);
        return mp;
    }

    @PostMapping("/dynamic")
    public String AddToDyanamicDta(@RequestBody DynamicData d1){
        List.add(d1);
        return "data added";
    }
}
