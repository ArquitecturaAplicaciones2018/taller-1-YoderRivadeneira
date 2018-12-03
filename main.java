package com.company;
import java.util.List;
public class Main {

    public static void main(String[] args) {
	// write your code here


        var rationals = List.of(
                new Rational(1, 4),
                new Rational(1, 8),
                new Rational(3, 4),
                new Rational(7, 8));

        //Obtener todos los números racionales que sean menores a 1/2
        System.out.println("Los siguientes son menores que 1/2 :");
        var menores= new Rational(1,2);

            //es menor que? isLessthan
            rationals.stream().filter(r -> r.isLessThan(menores)).forEach(System.out::println);
        System.out.println("---------------------------------------------------------------");

        var contenedor = new Rational(0,1);
        Rational suma = contenedor;
        suma = rationals.stream().reduce(contenedor,(x,y) -> x.plus(y));
        System.out.println(" La suma de todos los raccionales es:"+suma);
            // suma de todos los racionales
        System.out.println("---------------------------------------------------------------");


        //Racional mayor
        var r_mayor= rationals.stream().reduce(menores, Rational::getGreater);

        System.out.println("El racional mayor es : "+r_mayor);
        System.out.println("---------------------------------------------------------------");
        //numero de elementos

        System.out.println("Numero de elementos :"+rationals.stream().count());
        System.out.println("---------------------------------------------------------------");

        //suma de los numeradores
        System.out.println("Suma de todos los numeradosres : "+rationals.stream().mapToInt(r-> r.getNumerator()).sum());
        System.out.println("---------------------------------------------------------------");
        //numerador menor
        System.out.println("Numerador menor:"+rationals.stream().mapToInt(Rational::getNumerator).min().getAsInt());
        System.out.println("---------------------------------------------------------------");

        //numerador mayor
        System.out.println("Numerador mayor:"+rationals.stream().mapToInt(Rational::getNumerator).max().getAsInt());

        System.out.println("---------------------------------------------------------------");

        //promedio
        double promedio = rationals.stream().mapToInt(r-> r.getNumerator()).sum()/rationals.stream().count();
        System.out.println("El promedio es : "+promedio);



    }




}
