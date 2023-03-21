package com.test.redegal.api.model;

import com.test.redegal.api.model.model.Prices;

public interface PricesApi {
    Prices findPrices(final String applicationDate,
                      final Integer productId,
                      final Integer brandId);
}
