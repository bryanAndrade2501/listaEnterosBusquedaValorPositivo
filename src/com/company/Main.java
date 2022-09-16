package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //TODO: ingresar por teclado los elementos de un array de 21 numeros enteros
        //TODO: leer el array y escribir el producto de los elementos positivos
        //TODO: escribir el metodo: suma los valores de los n elementos del array y devuelve la suma
        //TODO: calcular el valor máximo y el mínimo del array
        int[] array = new int[21];

        //TODO: ingresar los elementos por teclado
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingresar el valor de la posicion " + (i + 1));
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        //todo: obtener el producto de los elementos positivos
        int producto = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                producto = producto * array[i];
            }
        }
        System.out.println("El producto de los elementos positivos del array es: " + producto);

        //TODO: SUMA DE LOS VALORES DEL ARRAY
        sumaValores(array);
        //TODO: VALOR MAXIMO Y VALOR MINIMO
        maximoYMinimo(array);
    }

    public static void sumaValores(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }
        System.out.println("La suma de los elementos del array es: " + suma);
    }

    public static void maximoYMinimo(int vector[]) {
        int max, min;
        max = min = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > max) {
                max = vector[i];
            }
            if (vector[i] < min) {
                min = vector[i];
            }
        }
        System.out.println("El valor Maximo del array es: " + max);
        System.out.println("El valor Minimo del array es: " + min);
    }
}
