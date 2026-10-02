import java.util.Scanner;

public class ejercicio4 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        final int LIMITE_RETIRO=5000;
        final int COMISION=10;

        System.out.println("Ingrese su saldo disponible:");
        int saldo_dispo= sc.nextInt();
        System.out.println("Cuanto desea Retirar:");
        int retiro= sc.nextInt();
        if (retiro>0 && retiro<=LIMITE_RETIRO && saldo_dispo>=(retiro+COMISION)){
            int saldo_res=saldo_dispo-retiro-COMISION;

            System.out.println("          Retiro Autorizado");
            System.out.println("=======================================");
            System.out.println("       cantidad retirada:"+retiro+"$");
            System.out.println("       saldo restante:"+saldo_res+"$");
            System.out.println("       comsion=10$");

        }else {
            System.out.println("CANTIDAD NO AUTORIZADA");
        }
    }
}
