/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author User
 */
class deposite extends ATM {
    int balance;
    int deposite;
    
     void betMethod(int balance, int deposite){
        this.balance=balance;
        this.deposite=deposite;
    }
    int deposite(){
        int dep = (this.balance +this.deposite);
        return dep ;
    }
}
