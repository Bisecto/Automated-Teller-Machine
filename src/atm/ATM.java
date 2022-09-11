/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
import static java.lang.Math.E;

/**
 *
 * @author User
 */
public class ATM {

              int balance,amount ;
    
   public void setMethod(int Actbalance, int withdraw ){
        this.balance=Actbalance;
        this.amount=withdraw;
        
        
    }
    int withdrawing(){
        balance =  (this.balance-this.amount) ;
        return balance ;
    }
    int depositing(){
         balance = ( this.balance+this.amount);
        return balance ;
    }
    int Actbalance(){
        
        return balance;
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int balance=19500, deposite, withdraw = 0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("WELCOME TO FIRSTBANK OF NIGERIA");
        System.out.println("SLOT IN YOUR CARD using your name");
       
       String a = scanner.nextLine();
       if (a.equals("james")){
           System.out.println("ENTER YOUR PIN");
           String e = scanner.nextLine();
       if (e.equals("1234")){
           //System.out.println("ENTER YOUR ACC BALANCE");
           //int balance= scanner.nextInt();
           while (true){
           System.out.println("Enter\n(1)For withdrawal\n(2)For deposite\n(3)for balance\n(4) Nothing Else ");
           int O= scanner.nextInt();
           switch (O){
                
                case 1:
                        System.out.println("enter money to be withdrawn");
                        withdraw =scanner.nextInt();
                        if (balance<withdraw){
                            System.out.println("INSULFFICIENT FUND");
                        }else{
                            
                            ATM obj = new ATM();
                            obj.setMethod(balance,withdraw);
                            System.out.println("Txn: debit\nAc:2xx..22x\nAmt:NGN "+""+withdraw+""+"\nDate:7-April-2020 11:10\nBal:NGN "+""+obj.withdrawing()+""+"\nCONVID19 is real #StaySafe");
                            
                            continue;    
                        }
                 case 2:
                        System.out.println("Enter amount to be deposited");
                        deposite =scanner.nextInt();
                        ATM obj = new ATM();
                        obj.setMethod(balance,deposite);
                        int B=obj.withdrawing();
                        int G = obj.depositing();
                       
                        String C= B+ " " + G;
                        System.out.println("Txn: Credit\nAc:2xx..22x\nAmt:NGN "+""+deposite+""+"\nDepositor Name:TNF- precious/TRF\nDate:7-April-2020 11:10\nBal:NGN "+""+C+""+"\nCONVID19 is real #StaySafe");
                       
                        continue;       
                 case 3:
                        ATM A = new ATM();
                        A.setMethod(balance,withdraw);
                        System.out.println("Bal:NGN "+""+A.Actbalance()+""+"\nCONVID19 is real #StaySafe");
                        
                                continue;
                 case 4:
                        System.out.println("THANKS FOR BANKING WITH US");
                        System.exit(0);
           }
           
                
           }
       }
        else{
           System.out.println("INVALID PIN");
                  
                }
       
          
       
         
            
       }
      
    }

}
