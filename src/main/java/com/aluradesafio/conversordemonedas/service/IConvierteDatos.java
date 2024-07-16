package com.aluradesafio.conversordemonedas.service;

public interface IConvierteDatos {

    //Las t´s funcionan para declarar que se utilizaran tipos de datos  genericos
    <T> T obtenerDatos(String json, Class<T> clase);

}
