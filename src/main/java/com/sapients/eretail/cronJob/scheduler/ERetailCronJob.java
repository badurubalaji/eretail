package com.sapients.eretail.cronJob.scheduler;

import com.sapients.eretail.cronJob.service.ERetailJobService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;

public class ERetailCronJob implements Job {

    @Autowired
    private ERetailJobService service;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) {
        service.processData();
    }
}