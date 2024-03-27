package com.mycompany.formulario;
public class Usuario {
    private String Nombre;private String Apellido;private String Gmail;

    public Usuario(String Nombre, String Apellido, String Gmail) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Gmail = Gmail;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getGmail() {
        return Gmail;
    }
    
}
