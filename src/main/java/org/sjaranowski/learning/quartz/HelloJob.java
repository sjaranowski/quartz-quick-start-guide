package org.sjaranowski.learning.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;

public class HelloJob implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) {
        System.out.println("Hello, world!");
    }

}
