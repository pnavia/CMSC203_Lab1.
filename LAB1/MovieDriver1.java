package LAB1;

import java.util.Scanner;

public class MovieDriver {

    public static void main(String[] args) {
       
        Scanner Driver = new Scanner(System.in);

        Movie movie = new Movie();
        
        System.out.print("Enter the movie title: ");
        String title = Driver.nextLine();
        movie.setTitle(title);
        
        System.out.print("Enter the movie's rating: ");
        String rating = Driver.nextLine();
        movie.setRating(rating);
        
        System.out.print("Enter the number of tickets sold: ");
        int tickets = Driver.nextInt();
        movie.setSoldTickets(tickets);
        
        System.out.println(movie.toString());


        Driver.close();
        System.out.println("Goodbye");
    }
}
