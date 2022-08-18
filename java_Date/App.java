import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World --- All about Date in Java!");
        //Hello, World!...

        System.out.println("-------------------LocalDate ---------------------------");
        /*
          we can import the "java.time" package to work with the date and time API.
          The package includes many date and time classes.
          - LocalDate:	Represents a date (year, month, day (yyyy-MM-dd))
          - LocalTime:	Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
          - LocalDateTime:	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
          - DateTimeFormatter:	Formatter for displaying and parsing date-time objects
        
        ----------------------------------------------------------------------------
         La classe LocalDate se trouve dans le package java.time. La classe LocalDate ne fournit 
         aucun constructeur, mais elle fournit des méthodes de fabrique statiques 
         (static factory method) pour créer un nouvel objet.  
        
        Créer un objet LocalDate représentant la date actuelle à partir de l'horloge système 
        et du fuseau horaire par défaut (sur votre ordinateur).
         */

        //Example1
        System.out.println("-------------------Example 1---------------------------"); 

        LocalDate date1 = LocalDate.of(2019, 9, 11);
        System.out.println(date1);
        LocalDate date2 = LocalDate.parse("2020-12-03");
        System.out.println(date2);
        LocalDate date3 = LocalDate.now();
        System.out.println(date3);

        // Example2
        System.out.println("-------------------Example 2---------------------------"); 

        LocalDate date4 = LocalDate.now();
        System.out.println("localDate.now(): " + date4); 
        //localDate.now(): 2022-08-18
        System.out.println("Month: " + date4.getMonth());
        //Month: AUGUST
        System.out.println("Year: " + date4.getYear());
        //2022

        System.out.println("------------------java.util.Date -----------------------");
        
        /* java.util.Date is available in java.util package. 
         The class Date represents a specific instant in time, with millisecond precision. The Date class 
         of java.util package implements Serializable, Cloneable and Comparable interface. It provides 
         constructors (Date()) and methods to deal with date and time with java. 
         */

        //Example 3
        /* Creating date/ You can create a Date object using the Date() constructor of
        java.util.Date constructor as shown in the following example. 
        The object created using this constructor represents the current time. */

        System.out.println("-------------------Example 3---------------------------"); 
        Date date5 = new Date( ); // Current date
        System.out.println("date with Date(): " + date5);
        
        System.out.println("-----------------Example 4 (Format)--------------------");

        /*
         Using the SimpleDateFormat class and the parse() method of this you can 
         parse a date string in the required format and create a Date object 
         representing the specified date.
         */

        SimpleDateFormat ft =  new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Current formatted Date : " + ft.format(date5)); 

        //Example 4:
        System.out.println("-----------------Example 5 (Format)-------------------");
        
        String date_string = "26-09-2020";
        
        //Instantiating the SimpleDateFormat class
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");      
        
        //Parsing the given String to Date object
        Date date6 = formatter.parse(date_string);      
        System.out.println("Date value- formatter : " + date6);

       
        System.out.println("-------------java.util.calender -------------------------");
        System.out.println("-----------Example 6: Leap Year? ------------------------");
        /*
         *The java.util.calendar class is an abstract class that provides methods for converting between 
         a specific instant in time and a set of calendar fields.
         */
        
        //Demo: 
        String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", 
         "Oct", "Nov", "Dec"};
      
         int year;
        /* Create a Gregorian calendar initialized with the current date and time in the
         default locale and timezone.*/
      
         GregorianCalendar gcalendar = new GregorianCalendar();
      
         // Display current time and date information.
        System.out.print("Date: ");
        System.out.print(months[gcalendar.get(Calendar.MONTH)]);
        System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
        System.out.println(year = gcalendar.get(Calendar.YEAR));
        System.out.print("Time: ");
        System.out.print(gcalendar.get(Calendar.HOUR) + ":");
        System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
        System.out.println(gcalendar.get(Calendar.SECOND));

        // Test if the current year is a leap year
        if(gcalendar.isLeapYear(year)) {
            System.out.println("The current year is a leap year");
        }else {
         System.out.println("The current year is not a leap year");
        }

        System.out.println("---------Example 7: Scanner with Date ---------------------");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName + "!");
        
        System.out.println("What is your age? ");
        int age1 = scanner.nextInt();
        int year1 = LocalDate.now().minusYears(age1).getYear();
        System.out.println("You are born in " + year1);

        /*
         What is your name?
         Hind
         Hello Hind!
         What is your age?
         23
         You are born in 1999
         */
        System.out.println("-----------------Example8: Class with Date -------------------");
        // Classes
        Passport dzPassport = new Passport("1234", "Algeria", LocalDate.of(2025, 04, 24));
        Passport ukPassport = new Passport("123459", "England", LocalDate.of(2026, 05, 26) );
        System.out.println("Date d'expiration 1: " + dzPassport.expirDate);  
        System.out.println("Date d'expiration 2: " + ukPassport.expirDate);   
    }
        static class Passport{
            //proprities - attributs
            String number;
            String country;
            LocalDate expirDate;

            //Constructor
            Passport(String number, String country, LocalDate expirDate){
                this.number = number;
                this.country = country;
                this.expirDate = expirDate;
            }
            //add more methods :)
            
        }
          
   }

   //Thanks to amigos for help.


