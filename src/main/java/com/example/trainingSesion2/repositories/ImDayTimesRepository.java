package com.example.trainingSesion2.repositories;

import com.example.trainingSesion2.time.DayTime;
import com.example.trainingSesion2.time.DayTimeCreated;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Qualifier("in-memory")
public class ImDayTimesRepository implements DayTimesRepository {
    private final List<DayTimeCreated> state = new ArrayList<>();

    @Override
    public DayTimeCreated createTime(DayTime dayTime) {
        Long id = state.size()+1L;
        DayTimeCreated day= DayTimeCreated.of(dayTime.getHora(), dayTime.getMinuto(),dayTime.getSegundo(), id);
        state.add(day);
        return day;
    }

    //@Override
    //public TimeCreated findOne(Long id) {
    //    return state.get(id);
    //}

    @Override
    public ArrayList findALL() {
        return (ArrayList) state;
    }

}
