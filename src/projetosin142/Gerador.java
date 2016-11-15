/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetosin142;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cibele
 */
public class Gerador {
    List listaTipo = new ArrayList();
    List listaValor = new ArrayList();
    String tipo;
    int index = 119;
    int valor = 100;
    Random random = new Random();
    
    public Gerador(){
        for(int i=0; i<120; i++){
            if(i%2 == 0){
                listaTipo.add("Saque");
            }
            else{
                listaTipo.add("Deposito");
            }
        }
        for(int i=0; i<120; i++){
            listaValor.add(valor);
            valor = valor + 100;
            if(valor == 400){
                valor = 100;
            }
        }
    }
    
    /*public void imprimir(){
            for(int i=0; i<120; i++){
                System.out.println(listaValor.get(i));
            }
    }*/
    
    public String geraTipo(){
        if(index != 0){
        int i = random.nextInt(index);
        //System.out.println("*****" + index + "*****");
        //System.out.println("------ " + i + " ------");
        tipo = (String)listaTipo.remove(i);
        index--;
        return tipo;
        }
        else{
            //System.out.println("*****" + index + "*****");
            return (String)listaTipo.remove(0);
        }
    }
    
    public int geraValor(){
        if(index != 0){
        int i = random.nextInt(index);
        valor = (int)listaValor.remove(i);
        index--;
        return valor;
        }
        else{
            //System.out.println("*****" + index + "*****");
            return (int)listaValor.remove(0);
        }
    }
}
