package com.leyo.provider.handler;

import org.springframework.stereotype.Component;

@Component
public class ProviderHandler implements IProviderHandler {

    @Override
    public Integer testProviderReturn(String msg) {
        System.out.println("provider access success");
        return 1024;
    }

    @Override
    public Void testProviderNoReturn() {
        System.out.println("provider access success");
        return null;
    }
}
