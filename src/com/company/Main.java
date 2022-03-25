package com.company;

public class Main {

    public static void main(String[] args) {

        //¿Es positivo o negativo? condicional if
        int numeroIf = -1;
        if(numeroIf < 0){
            System.out.println("Es un número negativo");
        }else{
            System.out.println("Es positivo");
        }
        //FIN DEL PRIMER EJERCICIO
        int numeroWhile =  -5;
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile ++;
        }
        // SEGUNDO EJERCICIO (BUCLE) DO WHILE
            do{
                System.out.println("ESTE ES EL WHILE" + numeroWhile);
            }while(numeroWhile < 3);

        // FIN DEL SEGUNDO EJERCICIO

        // TERCER  EJERCICIO FOR

        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor+1){
            System.out.println("Bucle for " + numeroFor);
        }
        // FIN DEL TERCER EJERCICIO

        // CUARTO  EJERCICIO SWITCH
        var estacion = "invierno";
        switch (estacion){
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            default:
                System.out.println("No sabemos en que estacion del año te encuentras");
        }

        // FIN DEL TERCER  EJERCICIO
    }
}




