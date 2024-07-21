/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.libro;

import java.util.ArrayList;
import java.util.List;

class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String genero;
    private boolean disponible;

    public Libro(String titulo, String autor, int anioPublicacion, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.genero = genero;
        this.disponible = true;
    }

   
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }
    public String getGenero() { return genero; }
    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }
}
