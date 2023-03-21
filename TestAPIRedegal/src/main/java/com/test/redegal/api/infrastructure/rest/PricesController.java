package com.test.redegal.api.infrastructure.rest;

import com.test.redegal.api.model.PricesApi;
import com.test.redegal.api.model.model.Prices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class PricesController {
    @Autowired
    PricesApi priceService;

    @GetMapping("/prices")
    public ResponseEntity<Prices> findPrices(
            @RequestParam(name = "applicationDate") String applicationDate,
            @RequestParam(name = "productId") int productId,
            @RequestParam(name = "brandId") int brandId) {

        try {

            Prices price = priceService.findPrices(applicationDate, productId, brandId);
            return new ResponseEntity<>(price, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
