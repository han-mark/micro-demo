package com.han.provider.web;

import com.han.provider.handler.ProviderHandler;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(value = "测试", tags = "测试")
@Slf4j
@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    private final ProviderHandler providerHandler;

    @ApiOperation("有返回值")
    @PostMapping("/testProviderReturn")
    @ApiImplicitParam(name = "version", value = "版本号", required = true, paramType = "path", defaultValue = "v100")
    public Integer testReturn(@RequestBody String msg) {
        return providerHandler.testProviderReturn(msg);
    }

    @ApiOperation("无返回值")
    @PostMapping("/testProviderNoReturn")
    @ApiImplicitParam(name = "version", value = "版本号", required = true, paramType = "path", defaultValue = "v100")
    public Void testNoReturn() {
        providerHandler.testProviderNoReturn();
        return null;
    }
}
