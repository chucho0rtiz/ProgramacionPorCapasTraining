package com.example.trainingSesion2.repositories;

import com.example.trainingSesion2.time.DayTime;
import com.example.trainingSesion2.time.DayTimeCreated;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface DayTimesRepository {
    //TimeCreated createTime(Hora hora, IntegerGeneric minuto, IntegerGeneric segundo);
    DayTimeCreated createTime(DayTime dayTime);
    //TimeCreated findOne(Long id);
    ArrayList findALL();
}
