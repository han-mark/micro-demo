package com.han.web;


import com.han.consumer.handler.IConsumerHandler;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Api(value = "测试", tags = "测试")
@Slf4j
@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    private final IConsumerHandler consumerHandler;

    @ApiOperation("有返回值")
    @GetMapping("/testReturn/{version}")
    @ApiImplicitParam(name = "version", value = "版本号", required = true, paramType = "path", defaultValue = "v100")
    public Integer testReturn(@PathVariable("version") String version) {
        return consumerHandler.testConsumerReturn(version);
    }

    @ApiOperation("无返回值")
    @GetMapping("/testNoReturn")
    @ApiImplicitParam(name = "version", value = "版本号", required = true, paramType = "path", defaultValue = "v100")
    public Void testNoReturn() {
        consumerHandler.testConsumerNoReturn();
        return null;
    }
}
