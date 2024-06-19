import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
 
public class DateOfBirth {
 
    public static void main(String[] args) {
        // Declare variables
        int day, month, year;
        
        // Instantiate --> Create the Scanner object
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        
        LocalDate dateOfBirth = LocalDate.now();
        LocalDate date = LocalDate.now();
  
        // Prompt for user to enter the birth year
        System.out.print("Please enter the birth year: ");
        
        // Read an integer from the keyboard, and store it in year
        year = keyboard.nextInt();
        
        // Prompt for user to enter the birth month
        System.out.print("Please enter the birth month: ");
        
        // Read an integer from the keyboard, and store it in month
        month = keyboard.nextInt();
        
        // Prompt for user to enter the birth day
        System.out.print("Please enter the birth day: ");
        
        // Read an integer from the keyboard, and store it in day
        day = keyboard.nextInt();
        
        // Format the output of year, month and day 
        dateOfBirth = LocalDate.of(year, month, day);
        
        // Validate the period 
        Period p = Period.between(dateOfBirth, date);
         
        // Display the output
        System.out.println("\nCurrent date is " + date + "\n" +
                           "Your Date of Birth is " + dateOfBirth + "\n\n" +
                           "Your age is " + p.getYears() + " years old.");
    }
    
}
