/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author vbkJi
 */
public class Account {

    private Double balance = 0.0d;

    public Account(Double balance) {
        this.setBalance(balance);
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return this.balance;
    }

    public boolean hasBalance() {
        return this.getBalance() != null && this.getBalance() > 0;
    }
}
