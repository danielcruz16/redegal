package com.test.redegal.api.domain.model;

import com.test.redegal.api.repository.jpa.model.PricesEcommerce;

import java.time.LocalDateTime;

public class PriceDTO {

    private final Integer productId;
    private final Integer brandId;
    private final Integer tariffId;
    private final Integer priority;
    private final LocalDateTime startDate;
    private final LocalDateTime endDate;
    private final Double price;

    public PriceDTO(final Integer productId,
                    final Integer brandId,
                    final Integer tariffId,
                    final Integer priority,
                    LocalDateTime startDate,
                    LocalDateTime endDate,
                    Double price){
        this.productId = productId;
        this.brandId = brandId;
        this.tariffId = tariffId;
        this.priority = priority;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
    }

    public PriceDTO(PricesEcommerce entity){
        this.productId = entity.getProductId();
        this.brandId = entity.getBrandId();
        this.tariffId = entity.getPriceList();
        this.priority = entity.getPriority();
        this.startDate = entity.getStartDate();
        this.endDate = entity.getEndDate();
        this.price = entity.getPrice();
    }

    public Integer getProductId() {
        return productId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public Integer getTariffId() {
        return tariffId;
    }

    public Integer getPriority() {
        return priority;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public Double getPrice() {
        return price;
    }
}
