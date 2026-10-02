import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        /*
        Ejercicio 1. Cajero automático
        Desarrolla un programa que simule un retiro de efectivo.
        El programa deberá solicitar por teclado el saldo disponible y la cantidad que el usuario
        desea retirar.
        Utiliza una constante llamada LIMITE_RETIRO con un valor de 5000.
        El programa deberá validar que la cantidad a retirar sea mayor que cero, que no supere el
        límite establecido y que no sea mayor al saldo disponible.
        Si la operación es válida, muestra la cantidad retirada y el nuevo saldo.
        Si el saldo restante después del retiro es menor a 500 pesos, muestra también una
        advertencia al usuario.
        Ejemplo de resultado esperado: Retiro autorizado, efectivo entregado y saldo restante.


         */
        Scanner sc=new Scanner(System.in);
        final int LIMITE_RETIRO=5000;

        System.out.println("Ingrese su saldo disponible:");
        int saldo_dispo= sc.nextInt();
        System.out.println("Cuanto desea Retirar:");
        int retiro= sc.nextInt();
        int saldo_res=saldo_dispo-retiro;
        if (retiro>=1 && retiro<=LIMITE_RETIRO){
            System.out.println("          Retiro Autorizado");
            System.out.println("=======================================");
            System.out.println("       cantidad retirada:"+retiro+"$");
            System.out.println("       saldo restante:"+saldo_res+"$");
            if (saldo_res<=500){
                System.out.println("  ADVERTENCIA DE SALDO :"+saldo_res);
            }
        }else {
            System.out.println("CANTIDAD NO AUTORIZADA");
        }


    }
}