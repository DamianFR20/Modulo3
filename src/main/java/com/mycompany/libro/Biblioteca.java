/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libro;

import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private final List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro '" + libro.getTitulo() + "' agregado a la biblioteca.");
    }

    public List<Libro> buscarLibros(String termino) {
        List<Libro> resultados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getTitulo().toLowerCase().contains(termino.toLowerCase()) ||
                libro.getAutor().toLowerCase().contains(termino.toLowerCase())) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    public void prestarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (libro.isDisponible()) {
                    libro.setDisponible(false);
                    System.out.println("Libro '" + libro.getTitulo() + "' prestado exitosamente.");
                    return;
                } else {
                    System.out.println("El libro '" + libro.getTitulo() + "' no está disponible.");
                    return;
                }
            }
        }
        System.out.println("No se encontró el libro '" + titulo + "'.");
    }

    public void devolverLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (!libro.isDisponible()) {
                    libro.setDisponible(true);
                    System.out.println("Libro '" + libro.getTitulo() + "' devuelto exitosamente.");
                    return;
                } else {
                    System.out.println("El libro '" + libro.getTitulo() + "' ya está en la biblioteca.");
                    return;
                }
            }
        }
        System.out.println("No se encontró el libro '" + titulo + "'.");
    }

    public void mostrarLibrosDisponibles() {
        List<Libro> librosDisponibles = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.isDisponible()) {
                librosDisponibles.add(libro);
            }
        }
        if (!librosDisponibles.isEmpty()) {
            System.out.println("Libros disponibles en la biblioteca:");
            for (Libro libro : librosDisponibles) {
                System.out.println("Título: " + libro.getTitulo());
                System.out.println("Autor: " + libro.getAutor());
                System.out.println("Año de publicación: " + libro.getAnioPublicacion());
                System.out.println("Género: " + libro.getGenero());
                System.out.println("--------------------");
            }
        } else {
            System.out.println("No hay libros disponibles en la biblioteca.");
        }
    }

}