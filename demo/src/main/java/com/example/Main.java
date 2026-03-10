package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Libro1 constructor con parametros
        Libro libro1 = new Libro("Programación2", "Gabriel Perez", 6, 2);

        //Libro2 contructor vacio
        Libro libro2 = new Libro();

        System.out.println("Ingre el titulo del libro: ");
        libro2.setTitulo(sc.nextLine());

        System.out.println("Ingrese autor: ");
        libro2.setAutor(sc.nextLine());

        System.out.println("Numero de ejemplares: ");
        libro2.setNumeroEjemplares(sc.nextInt());

        libro2.setNumeroEjemplaresPrestados(1);

        //libroTextoUNIAC
        LibroTextoUNIAC libroUniac = new LibroTextoUNIAC("Programación2", "Gabriel Perez", 6, 2, "Programacion Orientada a Objetos", "Tecnologia en sistemas");

        //novela
        Novela novela = new Novela("Canción de hielo y fuego", "George Martin", 50, 25, "ciencia ficción");

        //metodos
        libro1.prestamo();
        libro1.devolucion();

        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libroUniac);
        System.out.println(novela);
    }
}