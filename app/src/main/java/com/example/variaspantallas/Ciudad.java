package com.example.variaspantallas;

import java.io.Serializable;

public class Ciudad implements Serializable {
    private String nombre;
    private int habitantes;

    public Ciudad(String nombre, int habitantes) {
    this.nombre = nombre;
    this.habitantes = habitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }
}
