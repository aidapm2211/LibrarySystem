import java.util.Objects;

public class Book

{
   private String bookName;
   private String ISBN;
   private Author author;
   private Enum genre;

   public Book(String bookName , Author autor,Genre genre)
   {
      this.bookName = bookName;
      this.author=autor;
      this.genre=genre;

   }

   public Book()
   {

   }



   @Override
   public String toString()
   {
      return "Book{" +
             "bookName='" + bookName + '\'' +
             ", ISBN=" + ISBN +
             ", author='" + author + '\'' +
             ", genre=" + genre +
             '}';
   }

   @Override
   public boolean equals(Object o)
   {
      if (this == o) {
         return true;
      }
      if (!(o instanceof Book book)) {
         return false;
      }
      return getISBN() == book.getISBN() &&
             Objects.equals(getBookName(), book.getBookName()) &&
             Objects.equals(getAuthor(), book.getAuthor()) &&
             Objects.equals(getGenre(), book.getGenre());
   }

   @Override
   public int hashCode()
   {
      return Objects.hash(getBookName(), getISBN(), getAuthor(), getGenre());
   }

   public String getBookName()
   {
      return bookName;
   }

   public String setBookName(String bookName)
   {

      return bookName;
   }

   public String getISBN()
   {
      return ISBN;
   }

   public void setISBN(String ISBN)
   {
      this.ISBN = ISBN;
   }

   public Author getAuthor()
   {
      return author;
   }

   public Author setAuthor(Author author)
   {
      this.author = author;
      return author;
   }

   public Enum getGenre()
   {
      return genre;
   }

   public void setGenre(Enum genre)
   {
      this.genre = genre;
   }
}
