package com.han.consumer.handler;

import com.han.provider.handler.IProviderHandler;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ConsumerHandler implements IConsumerHandler {

    private final IProviderHandler providerHandler;
    @Override
    public Integer testConsumerReturn(String msg) {
        System.out.println("consumer access success");
        return providerHandler.testProviderReturn(msg);
    }

    @Override
    public Void testConsumerNoReturn() {
        System.out.println("consumer access success");
        providerHandler.testProviderNoReturn();
        return null;
    }
}
