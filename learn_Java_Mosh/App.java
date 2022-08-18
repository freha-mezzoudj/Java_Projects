
import java.awt.Point;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import javax.crypto.spec.GCMParameterSpec;
import javax.lang.model.util.ElementScanner14;
import javax.swing.plaf.synth.SynthScrollBarUI;
import javax.swing.text.Position;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        //Message on screen
        System.out.println("Hello, World!");
        
       //Mosh crash course 00:23:00
        //Java Types-

       //Variables and Types: Camelcase convention.
       /*Primitive types: for storing simple values
        byte, short, int, long, --float, double, --char, --boolean)*/
        System.out.println("-------------Varaibles & primitif types------------");
       byte age = 40;  //byte is better than int for "age".
       System.out.println("age: " + age);
       int views= 999_999_999;
       long viewsCount = 3_123_456_789L;
       float price=10.99F;
       double totalPrices= 999_999_999_999_999_999_999.99; //1.0E21
       char letter1 = 'A';  //' ' for char
       boolean isEligible = false;
       System.out.println("double: " + totalPrices);
       System.out.println("------------------Date----------------------------"); 
       //Reference types: for storing complex objects: date, mail message, 
       /*java.util.Data*/
        Date now = new Date();
        now.getTime();
        System.out.println("Now:" + now);
        System.out.println("------------------Point--------------------------");
        //Point 
        Point point1 = new Point(1, 2);
        System.out.println("point1: " + point1);
        //point1: java.awt.Point[x=1,y=2]

        Point point2 = new Point(4, 5);
        System.out.println("point2: " + point2);
        //point2: java.awt.Point[x=4,y=5]

        Point point3 = point2;
        System.out.println("point2: " + point3);
         //point2: java.awt.Point[x=4,y=5]
        point3.x = 7;
        System.out.println("point2: " + point3); 
        //point2: java.awt.Point[x=7,y=5]
        
        System.out.println("------------------Stings-----------------------");
        // String --time: 00:45:00  /01:45:40
        String message1 = new String("Hello my friend of the Internt!");
        System.out.println("Message 1 : " + message1);
        
        String message2 = "Hello world!";
        System.out.println("Message 2 : " + message2);
        //Strings are inmutable :the functions construct new Strings.
        // string's function: endWith, indexOf, trim, length, replace, */
        System.out.println("length of msg2:" + message2.length());
        System.out.println("Hello is the begin of msg2? " + message2.startsWith("Hello"));
        System.out.println("World is the end of msg2? " + message2.endsWith("world"));
        System.out.println("Index of H:" + message2.indexOf("H"));
        System.out.println("Index of G:" + message2.indexOf("G"));
        System.out.println("replace :" + message2.replace("!",":)"));
        String newMsg2 = message2.replace("!",":)");
        System.out.println("NewMessage2 : " + newMsg2); //the new message2
        System.out.println("Message2 original : " + message2); //the original message2
        
        //special char in Strings:put \ before them.
        // \t : tab
        String msg4 = "Hello \"Farah\"";
        System.out.println(msg4);
        
        System.out.println("------------------Arrays-----------------------");
        // reference type: Array have a fix length
        
        //First initialisation way:
        int[] numbers = new int[5];
        numbers[0]=1;
        numbers[1]=2;
       // numbers[10]=11; //error: invalid index
       System.out.println("Numbers: " + numbers);
       
       // need: import java.util.Arrays;
        System.out.println("toStg: " + Arrays.toString(numbers));
        
        //Second initialisation way:
        int[] numbers1 = {2, 8, 5, 6, 9, 7, 1};
        // Print the adress of the array:
        System.out.println("numbers1 without Arrays.toString:" + numbers1);
        // Print the elements of the array:
        System.out.println("numbers1 :" + Arrays.toString(numbers1));
        System.out.println("Length of nmb1: " + numbers1.length);
         //sort an array:
        //System.out.println(Arrays.sort(numbers1)); 

        // 2d array:
        int[][]numbers2 = new int[2][3];
        numbers2[0][0] = 1;
        System.out.println("numbers2: " + numbers2);
        System.out.println("numbers2: " + Arrays.toString(numbers2));
        //print the elements of the matrix:
        System.out.println("numbers2: " + Arrays.deepToString(numbers2));
        
        //or (2d):
        int[][] numbers3 = {{1, 0, 1}, {2 , 1, 3}};
        System.out.println("numbers3: " + Arrays.deepToString(numbers3));
        
        // 3d array:
        int[][] numbers4 = {{1, 0, 1}, {2 , 1, 3}, {4, 5, 6}};
        System.out.println("numbers4: " + Arrays.deepToString(numbers4));

        System.out.println("------------------Constant-----------------------");
        final float PI = 3.14F; // Upper letter by convention 
        
        System.out.println("------------------Arithmitic Op.---------------------");
        
        // +  -  /  *  %
        //division:
        int result = 10 / 3;  // result: 3
        System.out.println("result: " + result);
      
        double result1 = (double)10 / (double)3;
        System.out.println("result1: " + result1); 
        // result1: 3.3333333333333335 
        
        //Auto incrementation (post/pre):
        int x=1;
        x++;
        System.out.println("x++ :" + x);  //x=2
    
        int i = 1;
        int j = i++;  //Put i in j, then increment i.
        System.out.println(i);  // i = 2 
        System.out.println(j);  // j = 1

        int c = 1;
        int d = ++c;      //Increment i then put it in j.
        System.out.println(i);  // i = 2 
        System.out.println(j);  // j = 2

        //Augmented assign op.
        int x1 = 1; int y1 = 1; 
        x1 += 2;  // or: x1 = x1 + 2
        y1 -= 2; // or : y1 = y1 - 2 

        //Priorities: (- unitaire), (), [*  / ]  [+   -] 
        int x2 = 10 + 3 * 2;    // 16
        int x_2 = (10 + 3) * 2;  // 26 

        //cast: can be done automaticly by the j compiler.
        //byte > short > int > long  > float > double
        // Implicit cast: with any loose of data.

        short x3 = 1;
        int y3 = x3 + 2; 
        System.out.println(y3);  // y3 = 3 and it is an int??
        //x3 > int       int + int = int

        double a =1.1;
        double b = a + 2;  // 2 > 2.0
        // double + double (2) = double
        System.out.println(b);


        // Explicit casting: the user apply it between compatible types. .
        double x4 = 1.1;
        int y4 = (int)x4 + 2;
        System.out.println("Explicit cast: " + y4);
        //Explicit cast: 3

        /*
        we can't cast string to int: inconvertible types
        String x = "1";   
        int y = (int)x + 2;  
        */

        //Using waraper classes, 
        // we can use "Integer.parseInt()" to cast String to Integer. 
        
        System.out.println("------------------Warpper-----------------------");
        

        // we can cast String-> int using Integer.parseInt
        String x5 = "1";   
        int y5 = Integer.parseInt(x5) + 2; 
        System.out.println("Using Integer.parseInt: " + y5);
        //using Integer.parseInt: 3
        
        // we can cast String-> double using Double.parseDouble
        String x6 = "1.1";   
        double y6 = Double.parseDouble(x6) + 2; 
        System.out.println("Using Double.parseDouble: " + y6);
        //Using Double.parseDouble: 3.1 

        System.out.println("------------------class Math---------------------");  
        // Math class:
        int res1 = Math.round(1.1F);
        System.out.println("round: " + res1); // 1

        int res2 = (int) Math.ceil(1.1F);  // >= nb
        System.out.println("ceil: " + res2); // 2

        int res3 = (int)Math.floor(1.1F);  
        System.out.println("floor: " + res3);    // 1  

        int res4 = Math.max(2, 5);
        System.out.println("max: " + res4);

        double res5 = Math.random(); // between 0- 10:
        //Random: 0.3404656732744431  
        System.out.println("Random: " + res5);

        int res6 =  (int) Math.round(Math.random() * 100);  // 10 - 100
        System.out.println("Random 2: " + res6);  //62

        int res7 = (int) (Math.random()* 100);
        System.out.println("Random 3: " + res7);  // 98

        System.out.println("--------------Formatting Numbers------------------");  
        // Formatting numbers
        // 1234567 = $1,234,567           0.1 = 10%
        /* NumberFormat currency = new NumberFormat();   impossible */
        //The Abstract class "NumberFormat" is from "java.text"
        
        //1- currency $
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String res8 = currency.format(1234567.891);
        System.out.println("1234567.891 formated on currency: " + res8);
        //don4t zork for me:  1?234?567,89 ?

        //2- percent %
        NumberFormat pourcentage = NumberFormat.getPercentInstance();
        String res9 = pourcentage.format(0.15);
        System.out.println("0.15 formated on %: " + res9);
        // 15%

        System.out.println("------------------Scanner-----------------------");
        
         //User Input 
        //Open the input stream
        Scanner input = new Scanner(System.in);
        //Ask and attend the info from the user


        System.out.print("Enter your age: ");
        Byte age1 = input.nextByte();
        // .next(), .next Byte(), .nextLine(), ...
        System.out.println("So You are " + age1);
        // (age) is a Byte and ("So You are") is a String:
        //--> Java do a implicit cast to the Byte, then concatenate 
        // it with the String.
        //---------------------------------------------------------------------//
        // .next()     work with a token: Farah
        //.nextLine()  work with a line : Farah Mzg
        
        System.out.println("------------------Scanner-----------------------");
        //User Input 2
        
        //Ask and attend the info from the user 2
        System.out.print("Enter your First-name: ");
        String firstname = input.next();

        System.out.print("Enter your Last-name: ");
        String lastname = input.next();

        //print the user's info in the screen
        System.out.println(" Dear " + firstname + " " + lastname + " " + "Welcome to my Github repository!");
        
        // if there are spaces with the user input: trim() is useful to drop them (spaces).
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Name, please: ");
        String name = scan.nextLine().trim();
        System.out.println("You are " + name);

        System.out.println("----------------Operator Comp.-------------------");
        // Comparison Operators- time: 01:38:44
        // We use comparison operators to compare primitif values.
        int x7 = 1;
        int y7 = 1;
        System.out.println("Is x7 equal to y7?  " + (x7 == y7));

        System.out.println("Is x7 is great than y7?  " + (x7 > y7));
 
        System.out.println("Is x7 greater than \"or\" equal to y7?  " + (x7 >= y7)); 
        
        System.out.println("----------------Logical Operator-------------------");
        // Logical Operators
        
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println("Is it warm? ... " + isWarm);
        //true

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean isEligibale = hasHighIncome ||hasGoodCredit;
        System.out.println("Is the client eligible to have loen? ..." + isEligibale);
        // Is the client eligible to have loen? ...false
        //??
        boolean hasCriminalRecord = false;
        boolean isEligibale1 = (hasHighIncome ||hasGoodCredit) && !hasCriminalRecord;
        System.out.println("Is the client really eligible to have loen? ..." + isEligibale1);

        System.out.println("----------------If Statements.-------------------");
        //Control flow: Conditional Statements 
        /*
         If temp is greater than 30
            It's a hot day
            Drink plenty of water
        Otherwise, if it's between 20 and 30
            It's nice day
        Otherwise
            It's cold    
         */

        byte temp = 32;
        if (temp > 30) 
            System.out.println("It's a hot day, drink plenty of water!");
        else if (temp > 20 && temp <= 30)
               System.out.println("It's a nice day!");
        else System.out.println("It's cold!");

        System.out.println("----------------Simple If Statements.-------------------");
        
       
        int income = 120_000;
        /*
        boolean withHighIncome;
        if (income > 100_000)
            withHighIncome = true;
        else 
            withHighIncome = false;    
        */
        //or
        boolean withHighIncome = (income > 100_000);
        System.out.println("With heigh income: " + withHighIncome);

        System.out.println("-------------------Ternary Operator.--------------------");    
        int income1 = 120_000;
        String className = "Economy" ;
        if (income > 100_000) 
           className = "First";
        /*else
           className = "Economy";    : Initialising the var. avoid us the "else". */  
         
        // or using the simplest way: ternary operator (? :)
        String className1 = income > 100_000 ? "First" : "Economy";
       
        System.out.println("-------------------swith case.----------------------");    
        String role= "admin";
        /* 
        if (role == "admin")
            System.out.println("You're an admin!");
        else if (role == "moderator")
            System.out.println("You are a moderator!");
        else System.out.println("You are a guest!");        

        */
        // or
         
        switch (role){
            case "admin" :
            System.out.println("You are an admin!");
            break;

            case "moderator" :
            System.out.println("You are a moderator!");
            break;

            default:
            System.out.println("You are a guest!");
            //we don't need "break" because we are at the end!
        }

        //Note:  insead to use "admin", "moderator", etc. ... we can use 1,2,  etc.


        System.out.println("---------------Exercice: FizzBuzz.---------------");
        /* Interview question: we enter a number, 
        if the number is divisible by 5, we print "Fizz";
        if the number is divisible by 3, we print "Buzz";
        if the number is divisible by both 5 and 3, we print "FizzBuzz";
        if the number is not divisble by both 5 and 3, we print the number (it self).
        */
        
        //Freha's solution
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number5 = scanner.nextInt();
        int mode3 = number5 % 3;
        int mode5 = number5 % 5;
        
        if (mode3 == 0 && mode5 == 0) 
            System.out.println("FizzBizz");
        //if (mode5 == 0 && mode3 !=0) 
        else if (mode5 == 0) 
            System.out.println("Fizz");
        else if (mode3 == 0)  
            System.out.println("Bizz");
        else  
            System.out.println(number5);    
       
        //MOSH's Solution - time:02:01:00 /00:29:47
        //The same as his first solution!
        
        System.out.println("----------------For Loops.-------------------");

        /* 
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        */

        /*
         for (int [1] i3 = 0;
                  [2] i3 < 5; 
                  [4] i3++
                  [3] System.out.println("Hello World"); 
                  [5] i3 < 5; 
                  [6] System.out.println("Hello World");
                  [7] i3++,  etc.
         */
        for (int i3 = 0; i3 < 5; i3++)
            System.out.println("Hello World" + i3);

        System.out.println("----------------While Loops.-------------------");
        /*
        while loop is used when we don't know how exactly time we must repeat the action,
        but we know globaly the condition of that action. 
        */

        /* We enter inputs many time, we only stop if the input is aqual to "quit" */
       
        //Farah Solution:
        // */ Scanner scanner = new Scanner(System.in);

        String word = "";   // empty string
       while (!word.equals("quit")){
              System.out.print(" word: ");
              word = scanner.next().toLowerCase();
              /*System.out.println(word);*/
       }

       /* with while loop, we check the condition first, if the condition is false from the first time,
        the action is never executed 
        
        However, Do-while (rarely used), we check the condition after...*/

       System.out.println("----------------Do While Loops.-------------------");
       String word1 = "";
       do {
        System.out.print(" word1: ");
        word1 = scanner.next().toLowerCase();
        /*System.out.println(word);*/
       } while (!word1.equals("quit"));  //; aftr do-while
           
        System.out.println("----------------Break and continue ------------------"); 
        
        /*  
        String word2 = "";
        //while (!input.equals("quit")){
        while (true){ 
            System.out.print("Word2: ");
            word2 = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(word2);         
        }
        //don't break ...
       */
        System.out.println("----------------ForEach ------------------"); 
        String[] fruits = {"Apple", "Mango", "Orange"};
        for (int i = 0; i < fruits.length; i++)
           System.out.println(fruits[]); 
        
        //or using for each:

        for (String fruit: fruits)
            System.out.println(fruit);
        // we can't acces to the indexes
        //Packaging your applications

    }
}
