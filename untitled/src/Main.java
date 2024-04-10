import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Author author=new Author("","",123456789);

      Book book= new Book("jane Shifte",author,Genre.DRAMA);
      Scanner userInput= new Scanner(System.in);
      System.out.println("please give me the name of the book you want to add");
      String newBookName = userInput.nextLine();
      String bookName = book.setBookName(newBookName);
      System.out.println("Please give the ISBN number of the " + newBookName + " book");
      String newbookISBN = userInput.nextLine();
      System.out.println("Please give me the Writer's name ");
      String newBookWritersName = userInput.next();
      String authorName = String.valueOf(book.setAuthor(newBookWritersName));
      System.out.println("Book has been saved: ISBN " + book.getISBN() + ", Autor " + book.getAuthor() + ", Genre " + book.getGenre());








   }
}