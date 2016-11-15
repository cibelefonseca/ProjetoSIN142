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
public class ClienteSaque implements Runnable{
    private Tipo tipo;
    private double valor;
    Banco banco = new Banco();
    
    public ClienteSaque(Tipo tipo, double valor){
        this.tipo = tipo;
        this.valor = valor;
    }
    
    @Override
    public void run(){
        switch(tipo){
            case SAQUE100:
                banco.sacar(100);
                break;
            case SAQUE200:
                banco.sacar(200);
                break;
            case SAQUE300:
                banco.sacar(300);
                break;
        }
    }
    
    
}
