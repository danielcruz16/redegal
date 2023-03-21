package com.test.redegal.api;

import com.test.redegal.api.infrastructure.TestApiRedegalApplication;
import com.test.redegal.api.model.PricesApi;
import com.test.redegal.api.model.model.Prices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = TestApiRedegalApplication.class)
class TestApiRedegalApplicationTests {

	@Autowired
	PricesApi priceService;
	@Test
	void test1() {
		Prices price = priceService.findPrices("2020-06-14-10.00.00", 35455, 1);

		assert(price.getPrice().equals(35.50));
	}
	@Test
	void test2() {
		Prices price = priceService.findPrices("2020-06-14-16.00.00", 35455, 1);

		assert(price.getPrice().equals(25.45));
	}
	@Test
	void test3() {
		Prices price = priceService.findPrices("2020-06-14-21.00.00", 35455, 1);

		assert(price.getPrice().equals(35.50));
	}
	@Test
	void test4() {
		Prices price = priceService.findPrices("2020-06-15-10.00.00", 35455, 1);

		assert(price.getPrice().equals(30.50));
	}
	@Test
	void test5() {
		Prices price = priceService.findPrices("2020-06-16-21.00.00", 35455, 1);

		assert(price.getPrice().equals(38.95));
	}

}
