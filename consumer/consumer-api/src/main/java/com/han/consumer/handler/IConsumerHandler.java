package com.han.consumer.handler;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * FeignClient
 * value:服务名，
 * path:路径 注：需包含服务名
 * contextId 注：当一个服务有多个FeignClient注解时，必须使用contextId做bean区分，不然容器会当成一个bean注册导致冲突或者其它错误
 */
@FeignClient(value = "consumer", path = "/consumer/consumerHandler", contextId = "consumer/consumerHandler")
public interface IConsumerHandler {

    /**
     *
     * @return 返回类型不能是基础类型
     */
    @PostMapping("/testConsumerReturn")
    Integer testConsumerReturn(String msg);

    /**
     *
     * @return 无返回时应该使用Void包装类型而不是void
     */
    @PostMapping("/testConsumerNoReturn")
    Void testConsumerNoReturn();
}
