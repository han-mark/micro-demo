package com.leyo.provider.iml;

import com.leyo.provider.service.ITestService;
import org.springframework.stereotype.Component;

@Component
public class TestService implements ITestService {

    @Override
    public Integer testReturn(String msg) {
        System.out.println("provider access success");
        return 1024;
    }

    @Override
    public Void testNoReturn() {
        System.out.println("provider access success");
        return null;
    }
}
