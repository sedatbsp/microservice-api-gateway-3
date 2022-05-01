package com.sedatbsp.springbootmicroserviceapigateway3.controller;

import com.sedatbsp.springbootmicroserviceapigateway3.request.PurchaseServiceRequest;
import com.sedatbsp.springbootmicroserviceapigateway3.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("gateway/purchase") //pre-path
public class PurchaseController {

    @Autowired
    private PurchaseServiceRequest purchaseServiceRequest;

    @PostMapping // gateway/purchase
    public ResponseEntity<?> savePurchase(@RequestBody Object purchase) {
        return new ResponseEntity<>(purchaseServiceRequest.savePurchase(purchase), HttpStatus.CREATED);
    }

    @GetMapping // gateway/purchase
    public ResponseEntity<?> getAllPurchasesOfAuthorizedUser(@AuthenticationPrincipal UserPrincipal userPrincipal) {
        return ResponseEntity.ok(purchaseServiceRequest.getAllPurchasesOfUser(userPrincipal.getId()));
    }

}
