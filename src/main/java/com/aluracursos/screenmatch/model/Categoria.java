package com.aluracursos.screenmatch.model;

public enum Categoria {
    ACCION ("Action", "Acción"),
    ROMANCE ("Romance", "Romance"),
    COMEDIA ("Comedy", "Comedia"),
    CRIMEN ("Crime", "Crimen"),
    DRAMA ("Drama", "Drama"),
    ADVENTURE ("Adventure", "Aventura");

    private String categoriaOmdb;
    private String categoriaEspañol;

    Categoria (String categoriaOmdb, String categoriaEspañol) {
        this.categoriaOmdb = categoriaOmdb;
        this.categoriaEspañol = categoriaEspañol;
    }
    public static Categoria fromString (String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Ninguna categoría encontrada: " + text);
    }

    public static Categoria fromEspañol (String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaEspañol.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Ninguna categoría encontrada: " + text);
    }
}
