/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package f4ex1;

/**
 *
 * @author Dell
 */

public class Cliente extends ContaBancaria {
    private double saldo=1000;
    private int conta;
    private String historico;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }
    
    
    
    @Override
    public double sacar(double valor) {
      return saldo-=valor;
         }

    @Override
    public double depositar(double valor) {
     return this.saldo+=valor;
    }


    
}
