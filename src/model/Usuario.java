package model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private List<String> numero = new ArrayList<String>();

    public Usuario() {

    }

    public List<String> getNumero(String s) {
        return numero;
    }

    public void setNumero(List<String> numero) {
        this.numero = numero;
    }

}
