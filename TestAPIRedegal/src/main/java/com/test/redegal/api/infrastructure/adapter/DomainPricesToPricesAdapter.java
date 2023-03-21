package com.test.redegal.api.infrastructure.adapter;


import com.test.redegal.api.domain.model.PriceDTO;
import com.test.redegal.api.model.model.Prices;

import java.util.Optional;

public final class DomainPricesToPricesAdapter {
    private DomainPricesToPricesAdapter(){}

    public static Prices adapt(final Optional<PriceDTO> prices){
        final PriceDTO price = prices.get();
        return new Prices(price);
    }
}
