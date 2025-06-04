package com.aluracursos.Libreria;

import com.aluracursos.Libreria.model.DatosLibro;
import com.aluracursos.Libreria.principal.Principal;
import com.aluracursos.Libreria.service.ConsumoAPI;
import com.aluracursos.Libreria.service.ConvierteDatos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibreriaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LibreriaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.muestraElMenu();
	}
}
