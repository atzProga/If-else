import java.util.Scanner;

public class EJERCICIO3 {
    static void main(String[] args) {
        /*
        Ejercicio 3. Tienda con descuentos
Desarrolla un programa para calcular el total de una compra.
Solicita el nombre del cliente, el monto de la compra y el tipo de cliente mediante teclado.
Los tipos de cliente serán: 1 para cliente normal, 2 para cliente frecuente y 3 para cliente
VIP.
El cliente normal tiene 0% de descuento, el cliente frecuente 10% y el cliente VIP 20%.
Si el monto de la compra es superior a 2000 pesos, se deberá aplicar además un descuento
adicional del 5%.
Utiliza constantes para representar los porcentajes de descuento.
El programa deberá mostrar el monto original, los descuentos aplicados y el total a pagar.
         */
        Scanner sc= new Scanner(System.in);
        final double CLIENTE_FRECU=0.10;
        final double CLIENTE_VIP=0.20;
        double descuento;
        final int MONTO_ADICIOM=2000;
        final double DESCUENTO_ADICIONAL=0.05;

        double Total_pagar;
        System.out.println("            TIENDA");
        System.out.println("===================================");
        System.out.println("Ingresa tu nombre:");
        String nombre= sc.nextLine();
        System.out.println("Monto de Compra:");
        double monto=sc.nextInt();
        System.out.println("Seleccione su tipo de Cliente:");
        System.out.println("1.Normal");
        System.out.println("2.Frecuente");
        System.out.println("3.Vip");
        int tipo_cliente=sc.nextInt();
        if (tipo_cliente==1 && monto>0){
            if (monto>MONTO_ADICIOM){
                descuento=monto*DESCUENTO_ADICIONAL;
                Total_pagar=monto-descuento;
                System.out.println("==================================================");
                System.out.println("Nombre:"+nombre);
                System.out.println("Monto:"+monto);
                System.out.println("Descuento: "+descuento +"$(5%)");
                System.out.println("Total a pagar:"+Total_pagar+"$");
            }
            else {
                System.out.println("==================================================");
                System.out.println("Nombre:"+nombre);
                System.out.println("Monto:"+monto);
                System.out.println("Descuento:0%");
                System.out.println("Total a pagar:"+monto+"$");
            }
        }
        if (tipo_cliente==2 && monto>0){
            if (monto>MONTO_ADICIOM){
                descuento=(monto*DESCUENTO_ADICIONAL)+(monto*CLIENTE_FRECU);
                Total_pagar=monto-descuento;
                System.out.println("==================================================");
                System.out.println("Nombre:"+nombre);
                System.out.println("Monto:"+monto);
                System.out.println("Descuento:"+(monto*DESCUENTO_ADICIONAL)+"$(5%)");
                System.out.println("Descuento:"+(monto*CLIENTE_FRECU)+"$(10%)");
                System.out.println("Total a pagar:"+Total_pagar+"$");
            }
            else {
                descuento=monto*CLIENTE_FRECU;
                Total_pagar=monto-descuento;
                System.out.println("==================================================");
                System.out.println("Nombre:"+nombre);
                System.out.println("Monto:"+monto);
                System.out.println("Descuento:"+(monto*CLIENTE_FRECU)+"$(10%)");
                System.out.println("Total a pagar:"+Total_pagar+"$");
            }
        }
        if (tipo_cliente==3 && monto>0){
            if (monto>MONTO_ADICIOM){
                descuento=(monto*DESCUENTO_ADICIONAL)+(monto*CLIENTE_VIP);
                Total_pagar=monto-descuento;
                System.out.println("==================================================");
                System.out.println("Nombre:"+nombre);
                System.out.println("Monto:"+monto);
                System.out.println("Descuento:"+(monto*DESCUENTO_ADICIONAL)+"$(5%)");
                System.out.println("Descuento:"+(monto*CLIENTE_VIP)+"$(20%)");
                System.out.println("Total a pagar:"+Total_pagar+"$");
            }
            else {
                descuento=monto*CLIENTE_VIP;
                Total_pagar=monto-descuento;
                System.out.println("==================================================");
                System.out.println("Nombre:"+nombre);
                System.out.println("Monto:"+monto);
                System.out.println("Descuento:"+(monto*CLIENTE_VIP)+"$(20%)");
                System.out.println("Total a pagar:"+Total_pagar+"$");
            }
        }




    }
}
