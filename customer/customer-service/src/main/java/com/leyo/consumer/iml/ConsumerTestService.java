package com.leyo.consumer.iml;

import com.leyo.consumer.service.IConsumerTestService;
import com.leyo.provider.service.ITestService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ConsumerTestService implements IConsumerTestService {

    private final ITestService testService;
    @Override
    public Integer testReturn(String msg) {
        System.out.println("consumer access success");
        return testService.testReturn(msg);
    }

    @Override
    public Void testNoReturn() {
        System.out.println("consumer access success");
        testService.testNoReturn();
        return null;
    }
}
