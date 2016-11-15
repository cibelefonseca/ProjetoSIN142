/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetosin142;

/**
 *
 * @author cibele
 */
public class ClienteDeposito implements Runnable{
    
    Banco banco;
    private double valor;
    
    

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    @Override
    public void run(){
        
    }
}
