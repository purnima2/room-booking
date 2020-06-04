/**Entry point of Application
 * */
package com.coding.HotelChain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.coding","com.coding.service"})
@EnableJpaRepositories(basePackages = { "com.coding.repository" })
@EntityScan(basePackages={"com.coding.model"})
public class HotelChainApplication {
	public static void main(String[] args) {
		SpringApplication.run(HotelChainApplication.class, args);
	}

}
