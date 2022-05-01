package com.sedatbsp.springbootmicroserviceapigateway3.request;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(
        value = "purchase-service", //name of purchase service application
        path = "/api/purchase", //pre-path for purchase-service
        //url = "${purchase.service.url}",
        configuration = FeignConfiguration.class)
public interface PurchaseServiceRequest {

    @PostMapping // api/purchase
    Object savePurchase(@RequestBody Object purchase);

    @GetMapping("{userId}") // api/purchase/{userId}
    List<Object> getAllPurchasesOfUser(@PathVariable("userId") Long userId);

}
