package teste;

import java.util.Scanner;

public class Exc_10 {

    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);
        System.out.println("INFORME O TURNO QUE VOCÊ ESTUDA, 'M' PARA MATUTINO, V PRA VESPERTINO E N PRA NOTURNO");

        String turno = le.next();

        if (turno.equalsIgnoreCase("m")) {
            System.out.println("TENHA UM BOM DIA! ");
        } else if (turno.equalsIgnoreCase("v")) {
            System.out.println("TENHA UMA BOA TARDE!");
        } else if (turno.equalsIgnoreCase("N")) {
            System.out.println("TENHA UMA BOA NOITE!");
        } else {
            System.out.println("INFORMAÇÃO INVALIDA");
        }

    }
}
