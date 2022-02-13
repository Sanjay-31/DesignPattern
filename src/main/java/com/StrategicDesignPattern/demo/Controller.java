package com.StrategicDesignPattern.demo;

import com.StrategicDesignPattern.demo.Strategy.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {

    @GetMapping("/day/{currentDay}")
    public String getDay(@PathVariable Integer currentDay)
    {
        Map<Integer, DayInterface>map=new HashMap<>();
        map.put(1,new Monday());
        map.put(2,new Tuesday());
        map.put(3,new Wednesday());
        map.put(4,new Thursday());
        map.put(5,new Friday());
        Day day=new Day(map.get(currentDay));
        return day.get();
    }
}
