package com.test.redegal.api.domain;

import com.test.redegal.api.domain.model.PriceDTO;
import com.test.redegal.api.domain.port.primary.PricesService;
import com.test.redegal.api.domain.port.secondary.PricesInfrastructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class PricesServiceImpl implements PricesService {
    @Autowired
    PricesInfrastructure pricesInfrastructure;

    @Override
    public Optional<PriceDTO> getPricesEcommerce(final LocalDateTime applicationDate,
                                                 final Integer productId,
                                                 final Integer brandId){
        final List<PriceDTO> pricesList = pricesInfrastructure.getPricesFromEcommerce(applicationDate, productId, brandId);

        final List<PriceDTO> matchingPricesList = pricesList.stream().filter(entity -> isBetweenDates(applicationDate, entity)).toList();

        return filterByPriority(matchingPricesList);

    }

    private boolean isBetweenDates(final LocalDateTime applicationDate,
                                   final PriceDTO entity){
        return applicationDate.isAfter(entity.getStartDate()) && applicationDate.isBefore(entity.getEndDate());
    }

    private Optional<PriceDTO> filterByPriority(List<PriceDTO> pricesList){
        final int minimunPriority = 0;
        PriceDTO bestPrice = null;

        for (PriceDTO element : pricesList) {
            if (element.getPriority() >= minimunPriority) {
                bestPrice = element;
            }
        }

        return Optional.ofNullable(bestPrice);
    }
}
