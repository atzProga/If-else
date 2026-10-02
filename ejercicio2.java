import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ejercicio2 {
    static void main() {
        /*
        Ejercicio 2. Sistema de calificaciones
Desarrolla un programa que solicite las calificaciones de tres unidades.
Calcula el promedio de las tres calificaciones.
Utiliza una constante llamada MINIMO_APROBATORIO con valor de 70 y otra llamada
MINIMO_UNIDAD con valor de 60.
Si el promedio es mayor o igual a 70, muestra que el alumno está aprobado. En caso
contrario, muestra que está reprobado.
Además, si alguna de las tres calificaciones es menor a 60, indica que el alumno debe
presentar recuperación de la unidad correspondiente.
El programa deberá mostrar las tres calificaciones, el promedio y el resultado final.]
         */
        Scanner sc=new Scanner(System.in);
        final int MINIMO_APRO=70;
        final int MINIMO_UNIDAD=60;

        System.out.println("ingresa promedio de unidad 1:");
        int uni1=sc.nextInt();
        System.out.println("ingresa promedio de unidad 2:");
        int uni2=sc.nextInt();
        System.out.println("ingresa promedio de unidad 3:");
        int uni3=sc.nextInt();

        double promedioF=(uni1+uni2+uni3)/3;
        if (promedioF>=MINIMO_APRO){
            System.out.println("STATUS: APROBADO");
            System.out.println("CAlIFICACION DE UNIDAD 1: "+uni1);
            System.out.println("CAlIFICACION DE UNIDAD 2: "+uni2);
            System.out.println("CAlIFICACION DE UNIDAD 3: "+uni3);
            System.out.println("PROMEDIO FINAL: "+promedioF);


        }else{
            System.out.println("No aprobaste");

        }
        if (uni1<MINIMO_UNIDAD ){
            System.out.println("Debes presentar recuperacion de la unidad 1");
        }
        if (uni2<MINIMO_UNIDAD ){
            System.out.println("Debes presentar recuperacion de la unidad 2");
        }
        if (uni3<MINIMO_UNIDAD ){
            System.out.println("Debes presentar recuperacion de la unidad 3");
        }




    }
}
