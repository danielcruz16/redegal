package com.test.redegal.api.infrastructure.rest;

import com.test.redegal.api.model.PricesApi;
import com.test.redegal.api.model.model.Prices;
import com.test.redegal.api.infrastructure.adapter.DomainPricesToPricesAdapter;
import com.test.redegal.api.domain.port.primary.PricesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
class PricesApiImpl implements PricesApi {
    @Autowired
    PricesService pricesService;
    @Override
    public Prices findPrices(final String applicationDate,
                             final Integer productId,
                             final Integer brandId){

        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss");
        final LocalDateTime applicationLocalDateTime = LocalDateTime.parse(applicationDate, formatter);

        return DomainPricesToPricesAdapter.adapt(pricesService.getPricesEcommerce(applicationLocalDateTime, productId, brandId));
    }
}
