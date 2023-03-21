package com.test.redegal.api.repository.jpa;

import com.test.redegal.api.repository.jpa.model.PricesEcommerce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface EcommerceRepository extends JpaRepository<PricesEcommerce, Long> {
}
