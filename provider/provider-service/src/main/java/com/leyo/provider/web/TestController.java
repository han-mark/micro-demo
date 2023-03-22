package com.leyo.provider.web;

import com.leyo.provider.handler.ProviderHandler;
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

    private final ProviderHandler testService;

    @ApiOperation("有返回值")
    @PostMapping("/testReturn")
    @ApiImplicitParam(name = "version", value = "版本号", required = true, paramType = "path", defaultValue = "v100")
    public Integer testReturn(@RequestBody String msg) {
        return testService.testProviderReturn(msg);
    }

    @ApiOperation("无返回值")
    @PostMapping("/testNoReturn")
    @ApiImplicitParam(name = "version", value = "版本号", required = true, paramType = "path", defaultValue = "v100")
    public Void testNoReturn() {
        testService.testProviderNoReturn();
        return null;
    }
}
