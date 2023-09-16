package com.dio.eiericksilva.iphone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dio.eiericksilva.iphone.entities.Iphone;

@SpringBootApplication
public class IphoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(IphoneApplication.class, args);

		Iphone myPhone = new Iphone(000000000000000, "Iphone 15 Pro Max", "F45G568HH41H", 100);

		myPhone.tocar();
	}

}
