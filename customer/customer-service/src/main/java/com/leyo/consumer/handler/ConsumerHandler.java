package com.leyo.consumer.handler;

import com.leyo.provider.handler.IProviderHandler;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ConsumerHandler implements IConsumerHandler {

    private final IProviderHandler testService;
    @Override
    public Integer testConsumerReturn(String msg) {
        System.out.println("consumer access success");
        return testService.testProviderReturn(msg);
    }

    @Override
    public Void testConsumerNoReturn() {
        System.out.println("consumer access success");
        testService.testProviderNoReturn();
        return null;
    }
}
