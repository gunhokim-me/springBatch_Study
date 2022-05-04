package com.gunho.example1;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * 두 개의 메세지만 출력 하고 끝나는 단순한 tasklet
 */
public class HelloWorldTasklet implements Tasklet {

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        System.out.println("작업 시작.....");

        //원하는 작업은 여기서 진행 하면 됨

        System.out.println("작업 완료!!!");

        // null을 반환 하면 RepeatStatus.FINISHED를 반환하는 것과 같은 의미 -> 반복없이 한번만 한다는 뜻
        return null;
    }
}

