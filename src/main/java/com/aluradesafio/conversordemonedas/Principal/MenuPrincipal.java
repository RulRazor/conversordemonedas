package com.aluradesafio.conversordemonedas.Principal;

import java.util.Scanner;

public class MenuPrincipal {
    ObtenerConversion obtenerConversion = new ObtenerConversion();
    private Scanner teclado = new Scanner(System.in);


    public void menu(){
        var  bloop = -1;
        while(bloop != 0){
            var elmenu = """
                    ********************************************************
                    | BIENVENIDO AL CONVERSOR DE MONEDAS                   |
                    ********************************************************
                    | Seleccione la moneda que desea convertir             |
                    ********************************************************
                    | 1) Dólar a Peso Mexicano                             |
                    | 2) Peso Mexicano a Dólar                             |
                    | 3) Euro a Peso Mexicano                              |
                    | 4) Peso Mexicano a Euro                              |
                    | 5) Yen Japonés a Peso Mexicano                       |
                    | 6) Peso Mexicano a Yen Japonés                       |
                    | 0) Salir                                             |
                    | Elija una opcion valida                              | 
                    ********************************************************
                    """;
            System.out.println(elmenu);
            bloop = teclado.nextInt();

            switch (bloop) {
                case 1:
                    obtenerConversion.obtenerConversion("USD","MXN");
                    break;
                case 2:
                    obtenerConversion.obtenerConversion("MXN","USD");
                    break;
                case 3:
                    obtenerConversion.obtenerConversion("EUR","MXN");
                    break;
                case 4:
                    obtenerConversion.obtenerConversion("MXN","EUR");
                    break;
                case 5:
                    obtenerConversion.obtenerConversion("JPY","MXN");
                    break;
                case 6:
                    obtenerConversion.obtenerConversion("MXN","JPY");
                    break;
                case 0:
                    System.out.println("Cerrando la aplicación...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        }

    }
}
