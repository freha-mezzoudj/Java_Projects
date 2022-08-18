import java.text.NumberFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        /* Freha's Solution */
        System.out.println("-----------Hello, Project: Mortgage Calculator-----------");
        System.out.println("- See: WikiHow.com: Calculating MortgagE Payments (M)");
        System.out.println("r: mothly interest rate =(annual interest/12), given by %");
        System.out.println("n: number of payments = period of payment = (number of months you will be paying the loan)");
        System.out.println("P: the principal");
        System.out.println("M= P*[r*(1+r)^n]/[(1+r)^n -1]");
        System.out.println("----------------------------------------------------------");
       
        //principal (p)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal ($ 1K - $1M): ");
        float principal = scanner.nextFloat();

        //rate % --> monthly rate = r
        System.out.print("Annual Interest (%) : ");
        double rate = scanner.nextDouble();
        double monthly_rate = (rate / 100)/ 12;

        //period (years) --> number of months 
        System.out.print("Payement Period (Years): ");
        int period = scanner.nextInt();
        int number_month = period * 12;

        //Calculation of the Mortagage
        double mortagage = principal * (monthly_rate * Math.pow((1 + monthly_rate), number_month)) / (Math.pow((1 + monthly_rate), number_month) - 1);
        //double mortagage1 = NumberFormat.getCurrencyInstance(mortagage)
        //Screen output:
        // System.out.println("With a Principal of: "+ (float) NumberFormat.getCurrencyInstance(principal));
        System.out.println("The Mortgage is :" + mortagage);
        //System.out.println("The Mortgage formated is :" + mortagage);
        /*
            r: mothly interest rate =(annual interest/12), given by %
            n: number of payments = period of payment = (number of months you will be paying the loan)
            P: the principal
            M= P*[r*(1+r)^n]/[(1+r)^n -1]
            ----------------------------------------------------------//
            Principal ($): 4444444444
            Annual Interest (%) : 5
            Payement Period (Years): 15
            The Mortgage is :2.2222223359999996E10
         */
        //-------------------------------------------------------------//
       
        System.out.println("-----------------------Best version+ controls-----------------------------");
       
       
        // MOSH's Solution: begins at 01:33:13  / 00:57:34
        //                  finish at: 01:38:44 / 00:52:03  
        //+ Freha 'snd version.  
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT =100;
        
        int principal1 = 0;
       // Scanner scanner1 = new Scanner(System.in);
       while(true){
            System.out.print("Principal ($1K-$1M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break; 
            System.out.println("Enter a value [$1K - $1M]: "); 
       }       
            
        float annualInterest = 0.0F;
        while(true){
            System.out.print("Annual Interest Rate: ");
            annualInterest = scanner.nextFloat();
            if (annualInterest <= 30 && annualInterest > 0)
                break;
            System.out.println("Enter a value [0 - 30 ](%): ");   
        }     

        float monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR; 

        Byte years = 0; 

        while(true){
            System.out.print("Period (Years): ");
            years =scanner.nextByte();
            if (years > 0) break;
        }
        int numberOfPayments = years * MONTH_IN_YEAR;
  
        double mortagage1 = principal1 * (monthlyInterest) * Math.pow(1 + monthlyInterest, numberOfPayments)/ (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        //Formatting:
        String mortagageFormatted1 = NumberFormat.getCurrencyInstance().format(mortagage1);
        System.out.println("Mortagage : " + mortagageFormatted1);

        /*
           - See: WikiHow.com: Calculating MortgagE Payments (M)
            r: mothly interest rate =(annual interest/12), given by %
            n: number of payments = period of payment = (number of months you will be paying the loan)
            P: the principal
            M= P*[r*(1+r)^n]/[(1+r)^n -1]
            ----------------------------------------------------------
            Principal ($): 100000
            Annual Interest (%) : 5
            Payement Period (Years): 4
            The Mortgage is :2302.9293570646587
            Principal: 100000
            Annual Interest Rate: 5
            Period (Years): 4
            Mortagage : 2?302,90 ?
         */

         //time: 02:23:23 return for version 2!!
         //BIG THANKS to MOSH of "Coding made simple".
    }
}
