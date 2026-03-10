package com.example;

public class Libro {
    
    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int numeroEjemplaresPrestados;
    

    //Constructor vacio
    public Libro() {
    }

    // Constructor con atributos
        public Libro(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    //Getters y Setters

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public int getNumeroEjemplares() {
            return numeroEjemplares;
        }

        public void setNumeroEjemplares(int numeroEjemplares) {
            this.numeroEjemplares = numeroEjemplares;
        }

        public int getNumeroEjemplaresPrestados() {
            return numeroEjemplaresPrestados;
        }

        public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados) {
            this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
        }

    // Método préstamo
    public boolean prestamo(){
        if (numeroEjemplaresPrestados < numeroEjemplares) {
            numeroEjemplaresPrestados++;
            return true;
        } else {
            return false;
        }

    }

    // Método devolucion
    public boolean devolucion(){
        if (numeroEjemplaresPrestados > 0) {
            numeroEjemplaresPrestados--;
            return true;
        } else {
            return false;
        }

    }

    // Metodo imprimir
    public String toString(){
        return "Titulo: " + titulo + " / Autor: " + autor + " / Ejemplares: " + numeroEjemplares + " / Prestados: " + numeroEjemplaresPrestados;
    }
}
