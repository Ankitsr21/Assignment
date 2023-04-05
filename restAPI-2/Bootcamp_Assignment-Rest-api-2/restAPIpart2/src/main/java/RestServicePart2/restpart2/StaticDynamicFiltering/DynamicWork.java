package RestServicePart2.restpart2.StaticDynamicFiltering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;

public class DynamicWork {
    @GetMapping("/dynamicwork")
    public MappingJacksonValue getDyanamicDatalist() {
        DynamicData dd = new DynamicData("fiel1", "field2", "file3");
        MappingJacksonValue mp = new MappingJacksonValue(dd);
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1");
        FilterProvider flr = new SimpleFilterProvider().addFilter("dynamicFilter", filter);
        mp.setFilters(flr);
        return mp;
    }
}
