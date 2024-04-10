import java.util.List;
import java.util.Objects;

public class Library
{
   private String name;
   private List<String> books;
   @Override
   public String toString()
   {
      return "Library{" +
             "name='" + name + '\'' +
             ", books=" + books +
             '}';
   }

   @Override
   public boolean equals(Object o)
   {
      if (this == o) {
         return true;
      }
      if (!(o instanceof Library library)) {
         return false;
      }
      return Objects.equals(getName(), library.getName()) &&
             Objects.equals(getBooks(), library.getBooks());
   }

   @Override
   public int hashCode()
   {
      return Objects.hash(getName(), getBooks());
   }



   public List<String> getBooks()
   {
      return books;
   }

   public void setBooks(List<String> books)
   {
      this.books = books;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }


}
