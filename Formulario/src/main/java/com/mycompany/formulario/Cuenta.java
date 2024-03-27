package com.mycompany.formulario;
public class Cuenta {
    private String Password;private String Gmail;

    public Cuenta(String Password, String Gmail) {
        this.Password = Password;
        this.Gmail = Gmail;
    }

    public String getPassword() {
        return Password;
    }

    public String getGmail() {
        return Gmail;
    }
    
}
