/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetosin142;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cibele
 */
public class Banco {

    List fila = new ArrayList();
    private double saldo;
    //ClienteSaque lockObj = new ClienteSaque();

    public void addClienteSaque(ClienteSaque cliente) {
        fila.add(cliente);
    }

    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

    public void sacar(double valor) {
        this.setSaldo(this.getSaldo() - valor);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
