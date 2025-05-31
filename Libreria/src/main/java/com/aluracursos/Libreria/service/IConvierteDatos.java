package com.aluracursos.Libreria.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
