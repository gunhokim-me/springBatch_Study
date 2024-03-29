package com.gunho.example1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//배치 job 위치 설정
@ContextConfiguration(locations = {"/com/gunho/example1/hello_world_job.xml"})
public class TestHelloWorldJob {

    @Autowired
    private JobLauncherTestUtils jobLauncherTestUtils;

    @Test
    public void testJob() throws Exception {
        final JobExecution jobExecution = jobLauncherTestUtils.launchJob();

        //job 이 정상적으로 끝났는지 확인한다.
        System.out.println(ExitStatus.COMPLETED.getExitCode());
        Assert.assertEquals(ExitStatus.COMPLETED.getExitCode(), jobExecution.getExitStatus().getExitCode());
    }
}
