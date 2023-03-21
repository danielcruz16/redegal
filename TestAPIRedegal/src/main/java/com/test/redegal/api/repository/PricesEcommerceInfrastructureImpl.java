package com.test.redegal.api.repository;

import com.test.redegal.api.domain.model.PriceDTO;
import com.test.redegal.api.repository.jpa.EcommerceRepository;
import com.test.redegal.api.repository.jpa.model.PricesEcommerce;
import com.test.redegal.api.domain.port.secondary.PricesInfrastructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.test.redegal.api.repository.adapter.DomainPricesAdapter;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class PricesEcommerceInfrastructureImpl implements PricesInfrastructure {

    @Autowired
    EcommerceRepository ecommerceDb;

    @Override
    public List<PriceDTO> getPricesFromEcommerce(final LocalDateTime applicationDate,
                                                 final Integer productId,
                                                 final Integer brandId){
        List<PricesEcommerce> pricesList = ecommerceDb.findAll();

        return DomainPricesAdapter.adapt(pricesList);
    }
}
