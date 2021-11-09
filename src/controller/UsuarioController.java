package controller;

import java.util.ArrayList;
import java.util.List;

public class UsuarioController {

    static List<String> lista = new ArrayList<>();

    public void adicionar(String tmp1){
        lista.add(tmp1);
    }

    public List<String> listar(){
        return lista;
    }

    public int maiorValor(){
        int maior = 0;

        for (int i = 0; i < lista.size(); i++){
             if (Integer.parseInt(lista.get(i)) >= maior){
                 maior = Integer.parseInt(lista.get(i));
             }
        }
        return maior;
    }

    public int menorValor(){
        int menor = 999999;

        for (int i = 0; i < lista.size(); i++){
            if (Integer.parseInt(lista.get(i)) <= menor){
                menor = Integer.parseInt(lista.get(i));
            }
        }
        return menor;
    }

    public int mediaValores(){
        int media = 0;
        int j =0;
        for (int i = 0; i < lista.size(); i++){
            media += Integer.parseInt(lista.get(i));
            j += i;
        }
        return media/j;
    }
}
