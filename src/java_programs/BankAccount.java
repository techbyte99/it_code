package java_programs;

public class BankAccount {
    private int AccountNumber;
    private float Balance;
    
    public BankAccount(int an) {
        Balance = 500;
        AccountNumber = an;
    }
    
    public float Deposit(float x) {
        Balance += x;
        return Balance;        
    }
    
    public float withdraw(float x) {
        if(Balance-500 < x)
            System.out.println("Not enough Balance");
        else { 
        	System.out.println("Withdrawal sSuccessful");
            Balance -= x;
        }
        
        return Balance;
    }
    
    int getAccountNo() {
        return AccountNumber;
    }
    
    float getBalance() {
        return Balance;
    }
    
    float taxDeduction() {
        float tax = 0;
        
        if(Balance > 100000) {
            tax = (float) (.07*Balance);
            Balance -= tax;
        }
        else 
        	System.out.println("No tax deducted ");
        
        return tax;
    }    
}
