package com.test.redegal.api.domain.port.secondary;

import com.test.redegal.api.domain.model.PriceDTO;

import java.time.LocalDateTime;
import java.util.List;

public interface PricesInfrastructure {
    List<PriceDTO> getPricesFromEcommerce(final LocalDateTime applicationDate,
                                          final Integer productId,
                                          final Integer brandId);
}
