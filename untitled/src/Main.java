import java.util.Scanner;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Author author = new Author();
      Book book = new Book();
      Genre genre = null;

      Scanner userInput = new Scanner(System.in);

      System.out.println("Please give me the name of the book you want to add:");
      String newBookName = userInput.nextLine();
      book.setBookName(newBookName);

      System.out.println("Please give me the ISBN number of the " + newBookName + " book:");
      String newBookISBN = userInput.nextLine();
      book.setISBN(newBookISBN);

      System.out.println("Please give me the Genre of the " + newBookName + " book:");
      String inputGenre = userInput.nextLine().toUpperCase();
      genre = Genre.valueOf(inputGenre);

      System.out.println("Please give me the Writer's name:");
      String newBookWritersName = userInput.nextLine();

      System.out.println("Please give me the writer's last name:");
      String newBookWritersLastname = userInput.nextLine();
      author.setName(newBookWritersName, newBookWritersLastname);


      book.setAuthor(author);
      book.setGenre(genre);

      System.out.println(book.getBookName() + book.getAuthor());
   }
}


