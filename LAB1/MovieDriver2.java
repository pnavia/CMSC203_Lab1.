package LAB1;

import java.util.Scanner;

public class MovieDriver {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String continueInput;

        do {
         
            Movie movie = new Movie();

        
            System.out.print("Enter the movie title: ");
            String title = keyboard.nextLine();
            movie.setTitle(title);

            
            System.out.print("Enter the movie's rating: ");
            String rating = keyboard.nextLine();
            movie.setRating(rating);

           
            System.out.print("Enter the number of tickets sold: ");
            int ticketsSold = keyboard.nextInt();
            movie.setSoldTickets(ticketsSold);

            
            System.out.println(movie.toString());

       
            System.out.print("Do you want to enter another movie? (yes/no): ");
            keyboard.nextLine();  
            continueInput = keyboard.nextLine();

        } while (continueInput.equals("yes"));

        keyboard.close(); // Close the scanner
    }
}
