package org.shad;

import org.shad.entity.Car;
import org.shad.entity.Engine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(name = "car")
	public Car getCar() {

		Car car = new Car("Audi", getEngine());

		return car;

	}

	@Bean(name = "engine")
	public Engine getEngine() {

		Engine engine = new Engine(2017);

		return engine;

	}

}