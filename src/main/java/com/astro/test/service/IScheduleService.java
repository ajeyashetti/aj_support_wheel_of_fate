package com.astro.test.service;

import com.astro.test.db.dto.DaySchedule;
import com.astro.test.db.dto.Engineer;

import java.util.Date;
import java.util.List;

/**
 * Created by Ajeya on 4/26/18.
 */
public interface IScheduleService {

    DaySchedule getDayScheduleFor(Date day);

    List<Engineer> getEngineerScheduledFor(Date day);

    List<DaySchedule> listAllSchedules();

}
