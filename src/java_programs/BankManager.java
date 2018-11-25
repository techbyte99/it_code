package java_programs;

import java.util.Scanner;

public class BankManager {
    public static void main(String[] args) {
    	
       Scanner sc = new Scanner(System.in);
       
       int ch,ch1,ch2 = 0,flag = 1;
       
       Bank b = new Bank();
       
       do{
           System.out.println("Bank Application\n");
           
           System.out.println("1.Add new Account");
           System.out.println("2.Manage an existing account");
           System.out.println("3.Check total balance in the bank");
           System.out.println("4.Check bank stats");
           System.out.println("5.Find an account number");
           System.out.println("6.Check number of accounts with atleast a specific balance\n");
           
           System.out.print(" :: ");
           ch = sc.nextInt();
           
           switch(ch)
           {
               case 1:b.AddAccount();
                      break;
                      
               case 2:
            	   System.out.println("Enter your Bank Account Number : ");
                   int no = sc.nextInt();
                   
                    if(no < 0 || no > b.bank.size()-1)
                        System.out.println("Account not available");
                    else {
                            do{
                                flag=1;
                                
                                System.out.println("Account found\n");

                                System.out.println("What you want to do here: ");
                                System.out.println("1.Deposit money");
                                System.out.println("2.Withdraw money");
                                System.out.println("3.Check Balance");
                                System.out.println("4.Check tax Deduction"); 
                                System.out.println("5.Go Back");

                                System.out.println(" :: ");
                                ch1 = sc.nextInt();
                                
                                switch(ch1)
                                {
                                    case 1:
                                    	System.out.println("Enter the Amount you want to deposit : ");
                                    	float damt = sc.nextFloat();
                                    	
                                    	System.out.print("Amount deposited\nBalance :"+b.bank.get(no).Deposit(damt)+"\n");
                                    	break;
                                       
                                    case 2:
                                    	System.out.println("Enter the Amount you want to withdraw : ");
                                    	float wamt = sc.nextFloat();
                                    	float bal = b.bank.get(no).withdraw(wamt);
                                    	System.out.println("Balance : "+bal);
                                    	break;
                                       
                                    case 3:
                                    	System.out.println("Balance : "+b.bank.get(no).getBalance());
                                    	break;
                                           
                                    case 4:
                                    	float t = b.bank.get(no).taxDeduction();
                                    	System.out.println("Tax Deducted : "+ t);
                                    	break;
                                           
                                    case 5:
                                    	flag=0;
                                       break;
                                       
                                    default:
                                    	System.out.println("Invalid Input");                                  
                                }                                    
                            }while(flag==1);
                        }
                        break;
                        
               case 3:
            	   System.out.println("Total Balance in the bank : "+b.totalBalance());
            	   break;
                      
               case 4:
            	   b.BankStats();
            	   break;
                      
               case 5:
            	   System.out.print("Enter Bank Account : ");
            	   int acno = sc.nextInt();
            	   b.findAccount(acno);
            	   break;
                      
               case 6:
            	   System.out.println("Enter Balance : ");
            	   float bl = sc.nextFloat();
            	   b.countAcc(bl);
            	   break;
                      
               default:
            	   System.out.println("Invalid Input");                                
            }
           
           System.out.println("Exit(0)/Menu(1)");
           ch2 = sc.nextInt();
           
         } while(ch2==1);
       }       
    }