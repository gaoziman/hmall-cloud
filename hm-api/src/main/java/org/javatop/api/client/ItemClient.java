package org.javatop.api.client;

import org.javatop.api.config.DefaultFeignConfig;
import org.javatop.api.dto.ItemDTO;
import org.javatop.api.dto.OrderDetailDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-08-07 23:57
 * @description : FeignClient接口，用于调用item-service服务
 */
@FeignClient(value = "item-org.service", configuration = DefaultFeignConfig.class)
public interface ItemClient {

    @GetMapping("/items")
    List<ItemDTO> queryItemByIds(@RequestParam("ids") Collection<Long> ids);

    @PutMapping("/items/stock/deduct")
     void deductStock(@RequestBody List<OrderDetailDTO> items);
}
