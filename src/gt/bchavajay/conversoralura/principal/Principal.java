package gt.bchavajay.conversoralura.principal;

import gt.bchavajay.conversoralura.modelos.ConsultaMoneda;
import gt.bchavajay.conversoralura.modelos.Moneda;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        int opcion = 0;
        boolean calcular = false;
        String monedaBase = "";
        String monedaCambio = "";
        Double monto = 0.0;
        while(opcion != 9) {
            System.out.println("BIENVENIDO AL CONVERSOR DE MONEDAS DE ALURA");
            System.out.println("--------------------------------------------------------------");
            System.out.println("(1) Dolar Americano USD  => Peso Chileno CLP");
            System.out.println("(2) Peso Chileno CLP     => Dolar Americano USD");
            System.out.println("(3) Dolar Americano USD  => Peso Colombiano COP");
            System.out.println("(4) Peso Colombiano COP  => Dolar Americano USD");
            System.out.println("(5) Dolar Americano USD  => Peso Argentino ARS");
            System.out.println("(6) Peso Argentino ARS   => Dolar Americano USD");
            System.out.println("(7) Dolar Americano USD  => Real Brasileño BRL");
            System.out.println("(8) Real Brasileño BRL   => Dolar Americano USD");
            System.out.println("(9) Salir del sistema");
            System.out.println("--------------------------------------------------------------");
            System.out.print("Ingresa una opción: ");
            opcion = lectura.nextInt();

            if (opcion >=1 && opcion<=8){
                System.out.print("\nIngresa la cantidad a convertir: ");
                monto = lectura.nextDouble();
                calcular = true;
            }
            switch (opcion){
                case 1:
                    monedaBase = "USD";
                    monedaCambio = "CLP";

                    break;
                case 2:
                    monedaBase = "CLP";
                    monedaCambio = "USD";
                    break;
                case 3:
                    monedaBase = "USD";
                    monedaCambio = "COP";
                    break;
                case 4:
                    monedaBase = "COP";
                    monedaCambio = "USD";
                    break;
                case 5:
                    monedaBase = "USD";
                    monedaCambio = "ARS";
                    break;
                case 6:
                    monedaBase = "ARS";
                    monedaCambio = "USD";
                    break;
                case 7:
                    monedaBase = "USD";
                    monedaCambio = "BRL";
                    break;
                case 8:
                    monedaBase = "BRL";
                    monedaCambio = "USD";
                    break;
                case 9:
                    System.out.println("\n \nSaliendo...\n \n");
                    calcular = false;
                    break;
                default:
                    System.out.println("\n \nLa opcion debe estar entre 1 y 9...\n \n");
                    calcular = false;
            }
            if (calcular == true){
                Moneda moneda = consulta.consultaMoneda(monedaBase, monedaCambio, monto);
                System.out.println("--------------------------------------------------------------------------------------------------------");
                System.out.println(moneda);
                System.out.println("--------------------------------------------------------------------------------------------------------");
                System.out.println("\n Presione <ENTER> para volver al menu \n");
                new Scanner(System.in).nextLine();
            }
        }
    }


}
