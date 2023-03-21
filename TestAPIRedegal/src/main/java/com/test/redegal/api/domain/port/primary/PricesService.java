package com.test.redegal.api.domain.port.primary;

import com.test.redegal.api.domain.model.PriceDTO;

import java.time.LocalDateTime;
import java.util.Optional;

public interface PricesService {
    Optional<PriceDTO> getPricesEcommerce(final LocalDateTime applicationDate,
                                          final Integer productId,
                                          final Integer brandId);
}
