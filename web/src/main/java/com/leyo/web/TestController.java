package com.leyo.web;


import com.leyo.consumer.handler.IConsumerHandler;
import com.leyo.core.result.JsonResult;
import com.leyo.security.annotion.Permission;
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
    @Permission(loginRequired = false)
    public JsonResult<Integer> testReturn(@PathVariable("version") String version) {
        return JsonResult.success(consumerHandler.testConsumerReturn(version));
    }

    @ApiOperation("无返回值")
    @GetMapping("/testNoReturn")
    @ApiImplicitParam(name = "version", value = "版本号", required = true, paramType = "path", defaultValue = "v100")
    @Permission(loginRequired = false)
    public JsonResult testNoReturn() {
        consumerHandler.testConsumerNoReturn();
        return JsonResult.success();
    }
}
