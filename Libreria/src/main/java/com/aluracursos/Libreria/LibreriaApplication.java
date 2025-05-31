package com.aluracursos.Libreria;

import com.aluracursos.Libreria.model.DatosLibro;
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
		System.out.println("Bienvenido a la aplicación de gestión de libros");
		var consumoAPI = new ConsumoAPI();
		var json = consumoAPI.obtenerDatos("https://gutendex.com/books/84/");
		System.out.println(json);
		ConvierteDatos conversor = new ConvierteDatos();
		var datos = conversor.obtenerDatos(json, DatosLibro.class);
		System.out.println(datos);
	}
}
