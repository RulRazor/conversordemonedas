package com.aluradesafio.conversordemonedas;

import com.aluradesafio.conversordemonedas.Principal.MenuPrincipal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConversordemonedasApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConversordemonedasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		MenuPrincipal menuPrincipal = new MenuPrincipal();
		menuPrincipal.menu();
	}
}
