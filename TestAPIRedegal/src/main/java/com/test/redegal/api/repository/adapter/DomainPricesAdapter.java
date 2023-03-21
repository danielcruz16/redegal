package com.test.redegal.api.repository.adapter;

import com.test.redegal.api.domain.model.PriceDTO;
import com.test.redegal.api.repository.jpa.model.PricesEcommerce;

import java.util.List;
import java.util.stream.Collectors;

public class DomainPricesAdapter {
    private DomainPricesAdapter(){}

    public static List<PriceDTO> adapt(final List<PricesEcommerce> prices){
        return prices.stream().map(PriceDTO::new).collect(Collectors.toList());
    }
}
