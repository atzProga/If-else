import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        /*
        Desarrolla un programa que calcule el costo de un estacionamiento.
Solicita por teclado el tipo de vehículo y el número de horas que permaneció estacionado.
Los tipos de vehículo serán: 1 para motocicleta, 2 para automóvil y 3 para camioneta.
La tarifa por hora será de 10 pesos para motocicleta, 20 pesos para automóvil y 30 pesos
para camioneta.
Si el vehículo permanece más de 5 horas, se aplicará un descuento del 10%. Si permanece
más de 10 horas, se aplicará un descuento del 20%.
Si el número de horas es menor o igual a cero, el programa deberá indicar que la cantidad
de horas no es válida.
Utiliza constantes para las tarifas y los porcentajes de descuento.
Muestra el tipo de vehículo, las horas, la tarifa, el subtotal, el descuento y el total a pagar.
         */
        Scanner sc=new Scanner(System.in);
        final int MOTO_T=10;
        final int MOTO_A=20;
        final int MOTO_C=30;
        final double DES_5H=0.10;
        final double DES_10H=0.20;
        double horas_des;
        double subtotal,totalP;
        System.out.println("Seleccione su tipo de vehiculo:");
        System.out.println("1. Moto");
        System.out.println("2. Auto");
        System.out.println("3. Camioneta");
        int tipo= sc.nextInt();
        if (tipo>=1 && tipo<=3){
            System.out.println("Ingresa las horas:");
            int horas=sc.nextInt();
            if (horas>0) {
                if (tipo == 1) {
                    subtotal = MOTO_T * horas;
                    if (horas > 5 && horas <=10) {
                        horas_des = subtotal * DES_5H;
                        totalP = subtotal - horas_des;
                        System.out.println("=======================================");
                        System.out.println("vehiculo : MOTO");
                        System.out.println("horas:" + horas);
                        System.out.println("Tarifa:" + MOTO_T);
                        System.out.println("Subtotal:" + subtotal);
                        System.out.println("Descuento(10%):" + horas_des);
                        System.out.println("Total a pagar:" + totalP);
                    } else if (horas > 10) {
                        horas_des = subtotal * DES_10H;
                        totalP = subtotal - horas_des;
                        System.out.println("=======================================");
                        System.out.println("vehiculo : MOTO");
                        System.out.println("horas:" + horas);
                        System.out.println("Tarifa:" + MOTO_T);
                        System.out.println("Subtotal:" + subtotal);
                        System.out.println("Descuento(20%):" + horas_des);
                        System.out.println("Total a pagar:" + totalP);
                    } else {
                        totalP = subtotal;
                        System.out.println("=======================================");
                        System.out.println("vehiculo : MOTO");
                        System.out.println("horas:" + horas);
                        System.out.println("Tarifa:" + MOTO_T);
                        System.out.println("Subtotal:" + subtotal);
                        System.out.println("Descuento(0%):0");
                        System.out.println("Total a pagar:" + totalP);
                    }

                }
                if (tipo == 2) {
                    subtotal = MOTO_A * horas;
                    if (horas > 5 && horas <= 10) {
                        horas_des = subtotal * DES_5H;
                        totalP = subtotal - horas_des;
                        System.out.println("=======================================");
                        System.out.println("vehiculo : Automovil");
                        System.out.println("horas:" + horas);
                        System.out.println("Tarifa:" + MOTO_A);
                        System.out.println("Subtotal:" + subtotal);
                        System.out.println("Descuento(10%):" + horas_des);
                        System.out.println("Total a pagar:" + totalP);
                    } else if (horas > 10) {
                        horas_des = subtotal * DES_10H;
                        totalP = subtotal - horas_des;
                        System.out.println("=======================================");
                        System.out.println("vehiculo : Automovil");
                        System.out.println("horas:" + horas);
                        System.out.println("Tarifa:" + MOTO_A);
                        System.out.println("Subtotal:" + subtotal);
                        System.out.println("Descuento(20%):" + horas_des);
                        System.out.println("Total a pagar:" + totalP);
                    } else {
                        totalP = subtotal;
                        System.out.println("=======================================");
                        System.out.println("vehiculo : Automovil");
                        System.out.println("horas:" + horas);
                        System.out.println("Tarifa:" + MOTO_A);
                        System.out.println("Subtotal:" + subtotal);
                        System.out.println("Descuento(0%):0");
                        System.out.println("Total a pagar:" + totalP);
                    }

                }
                if (tipo == 3) {
                    subtotal = MOTO_C * horas;
                    if (horas > 5 && horas <=10) {
                        horas_des = subtotal * DES_5H;
                        totalP = subtotal - horas_des;
                        System.out.println("=======================================");
                        System.out.println("vehiculo : CAMIONETA");
                        System.out.println("horas:" + horas);
                        System.out.println("Tarifa:" + MOTO_C);
                        System.out.println("Subtotal:" + subtotal);
                        System.out.println("Descuento(10%):" + horas_des);
                        System.out.println("Total a pagar:" + totalP);
                    } else if (horas > 10) {
                        horas_des = subtotal * DES_10H;
                        totalP = subtotal - horas_des;
                        System.out.println("=======================================");
                        System.out.println("vehiculo : CAMIONETA");
                        System.out.println("horas:" + horas);
                        System.out.println("Tarifa:" + MOTO_C);
                        System.out.println("Subtotal:" + subtotal);
                        System.out.println("Descuento(20%):" + horas_des);
                        System.out.println("Total a pagar:" + totalP);
                    } else {
                        totalP = subtotal;
                        System.out.println("=======================================");
                        System.out.println("vehiculo : CAMIONETA");
                        System.out.println("horas:" + horas);
                        System.out.println("Tarifa:" + MOTO_C);
                        System.out.println("Subtotal:" + subtotal);
                        System.out.println("Descuento(0%):0");
                        System.out.println("Total a pagar:" + totalP);
                    }

                }
            }else if (horas<=0){
                System.out.println("ingresa horas validas");
            }

        }else{
            System.out.println("Ingresa un numero valido");
        }


    }
}
