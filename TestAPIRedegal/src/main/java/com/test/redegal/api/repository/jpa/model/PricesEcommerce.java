package com.test.redegal.api.repository.jpa.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "PRICES")
public class PricesEcommerce {

        @Id
        @Column(name = "ID")
        private int id;
        @Column(name = "BRAND_ID")
        private int brandId;

        @Column(name = "START_DATE")
        private LocalDateTime startDate;

        @Column(name = "END_DATE")
        private LocalDateTime endDate;

        @Column(name = "PRICE_LIST")
        private int priceList;

        @Column(name = "PRODUCT_ID")
        private int productId;

        @Column(name = "PRIORITY")
        private int priority;

        @Column(name = "PRICE")
        private Double price;

        @Column(name = "CURR")
        private String curr;

        public int getBrandId() {
                return brandId;
        }

        public LocalDateTime getStartDate() {
                return startDate;
        }

        public LocalDateTime getEndDate() {
                return endDate;
        }

        public int getPriceList() {
                return priceList;
        }

        public int getProductId() {
                return productId;
        }

        public int getPriority() {
                return priority;
        }

        public Double getPrice() {
                return price;
        }

        public String getCurr() {
                return curr;
        }
}
