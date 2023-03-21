package com.test.redegal.api.model.model;

import com.test.redegal.api.domain.model.PriceDTO;

import java.time.LocalDateTime;

public class Prices {
    private final Integer productId;
    private final Integer brandId;
    private final Integer tariffId;
    private final LocalDateTime startDate;
    private final LocalDateTime endDate;
    private final Double price;

    public Prices(final Integer productId,
                    final Integer brandId,
                    final Integer tariffId,
                  LocalDateTime startDate,
                  LocalDateTime endDate,
                    Double price){
        this.productId = productId;
        this.brandId = brandId;
        this.tariffId = tariffId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
    }

    public Prices(PriceDTO entity){
        this.productId = entity.getProductId();
        this.brandId = entity.getBrandId();
        this.tariffId = entity.getTariffId();
        this.startDate = entity.getStartDate();
        this.endDate = entity.getEndDate();
        this.price = entity.getPrice();
    }

    public Double getPrice() {
        return price;
    }

    public String toString(){
        return "{" + '\n' + '\t' +
                "productId: " + productId.toString() + '\n' + '\t' +
                "brandId: " + brandId.toString() + '\n' + '\t' +
                "tariffId: " + tariffId.toString() + '\n' + '\t' +
                "startDate: " + startDate.toString() + '\n' + '\t' +
                "endDate: " + endDate.toString() + '\n' + '\t' +
                "price: " + price.toString() + '\n' +
            "}";
    }
}
