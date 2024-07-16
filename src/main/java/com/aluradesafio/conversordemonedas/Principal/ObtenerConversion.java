package com.aluradesafio.conversordemonedas.Principal;

import com.aluradesafio.conversordemonedas.model.DatosMoneda;
import com.aluradesafio.conversordemonedas.service.ConsumoAPIMonedas;
import com.aluradesafio.conversordemonedas.service.ConvierteDatos;

import java.util.Scanner;

public class ObtenerConversion {
    ConsumoAPIMonedas consumoAPIMonedas = new ConsumoAPIMonedas();
    private ConvierteDatos conversor = new ConvierteDatos();
    private final String URL_INICIO = "https://v6.exchangerate-api.com/v6/";
    private final String API_KEY = System.getenv("EXCHANGE_RATE_KEY");
    private final String URL_FINAL = "/pair/";
    private Scanner teclado = new Scanner(System.in);



    private DatosMoneda getDatosMoneda(String CLAVE_MONEDA_BASE, String CLAVE_MONEDA_DESTINO) {
        var json = consumoAPIMonedas.obtenerDatos(URL_INICIO + API_KEY + URL_FINAL + CLAVE_MONEDA_BASE + "/" + CLAVE_MONEDA_DESTINO);
        System.out.println(json);
        var datos = conversor.obtenerDatos(json, DatosMoneda.class);
        return datos;
    }

    public void obtenerConversion(String CLAVE_MONEDA_BASE, String CLAVE_MONEDA_DESTINO){
       DatosMoneda datos =  getDatosMoneda(CLAVE_MONEDA_BASE, CLAVE_MONEDA_DESTINO);
        System.out.println("Ingrese el valor que desea convertir");
        var multiplicador = teclado.nextInt();
        var multiplo = multiplicador * datos.conversion();

        System.out.printf("El valor de %d [%s] corresponde al valor final de ===> %f [%s]", multiplicador, datos.monedaBase(), multiplo, datos.monedaDestino());

    }

}
