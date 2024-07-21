/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.libro;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

    
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, "Realismo mágico");
        Libro libro2 = new Libro("1984", "George Orwell", 1949, "Ciencia ficción");
        Libro libro3 = new Libro("El principito", "Antoine de Saint-Exupéry", 1943, "Fábula");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

      
        System.out.println("\nBúsqueda de libros:");
        List<Libro> resultados = biblioteca.buscarLibros("García");
        for (Libro libro : resultados) {
            System.out.println("Encontrado: " + libro.getTitulo() + " de " + libro.getAutor());
        }

        
        System.out.println("\nPréstamo y devolución de libros:");
        biblioteca.prestarLibro("1984");
        biblioteca.prestarLibro("1984");  
        biblioteca.devolverLibro("1984");
        biblioteca.devolverLibro("1984");  
       
        System.out.println("\nLibros disponibles:");
        biblioteca.mostrarLibrosDisponibles();
    }
}
