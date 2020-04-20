package com.example.trainingSesion2.services;

import com.example.trainingSesion2.repositories.DayTimesRepository;
import com.example.trainingSesion2.time.DayTime;
import com.example.trainingSesion2.time.DayTimeCreated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TimeServices {
    private final DayTimesRepository dayTimesRepository;

    @Autowired
    public TimeServices(@Qualifier("in-memory") DayTimesRepository dayTimesRepository) {
        this.dayTimesRepository = dayTimesRepository;
    }

    public DayTimeCreated createTime(DayTime dayTime){
        return dayTimesRepository.createTime(dayTime);
    }

    public ArrayList findAll(){
        return dayTimesRepository.findALL();
    }
}
