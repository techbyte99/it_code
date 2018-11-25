package java_programs;

import java.util.ArrayList;

public class Bank {
    ArrayList<BankAccount> bank= new ArrayList<BankAccount>();
    
    void AddAccount() {
    	bank.add(new BankAccount(bank.size()));
    	
        System.out.println("New Account Created");
        
        System.out.println("Account No. " + bank.get(bank.size()-1).getAccountNo());
        System.out.println("Balance :" + bank.get(bank.size()-1).getBalance());
    }
    
    double totalBalance() {
        double sum=0;
        
        for(int i = 0; i < bank.size(); i++) {
            sum += bank.get(i).getBalance();
        }
        return sum;
    }
    
    void BankStats() {
        int max = bank.get(0).getAccountNo();
        
       for(int i = 1; i < bank.size(); i++) {
           if(bank.get(max).getBalance() < bank.get(i).getBalance())
               max = bank.get(i).getAccountNo();
       }
       
       System.out.println("Account with Max Balance : "+max);
       
       int min=bank.get(0).getAccountNo();
       
       for(int i=1;i<bank.size();i++) {
           if(bank.get(min).getBalance() > bank.get(i).getBalance())
               min = bank.get(i).getAccountNo();
       }
       
       System.out.println("Account with Min Balance : "+min);
    }
    
    void findAccount(int acc) {
        if(acc > bank.size()-1)
            System.out.println("Account not found ");
        else {
            System.out.println("Account Found");
            
            System.out.println("Account No. " + bank.get(acc).getAccountNo());
            System.out.println("Balance :" + bank.get(acc).getBalance());
        }
    }
    
    void countAcc(float bal) {
        System.out.println("Accounts having atleast Balance : "+ bal);
        
        for(int i = 0; i < bank.size(); i++) {
            if(bank.get(i).getBalance() >= bal)
                System.out.println(bank.get(i).getAccountNo());
        }
    }
}
