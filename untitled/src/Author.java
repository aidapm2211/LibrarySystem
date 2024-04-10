import java.util.Objects;

public class Author
{
   @Override
   public String toString()
   {
      return "Writer{" +
             "name='" + name + '\'' +
             ", lastName='" + lastName + '\'' +
             ", nationalCode=" + nationalCode +
             '}';
   }

   @Override
   public boolean equals(Object o)
   {
      if (this == o) {
         return true;
      }
      if (o == null || getClass() != o.getClass()) {
         return false;
      }
      Author writer = (Author) o;
      return nationalCode == writer.nationalCode &&
             Objects.equals(name, writer.name) &&
             Objects.equals(lastName, writer.lastName);
   }

   @Override
   public int hashCode()
   {
      return Objects.hash(name, lastName, nationalCode);
   }

   public Author(String name, String lastName, int nationalCode)
   {
      this.name = name;
      this.lastName = lastName;
      this.nationalCode = String.valueOf(nationalCode);
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getLastName()
   {
      return lastName;
   }

   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }

   public String getNationalCode()
   {
      return nationalCode;
   }

   public void setNationalCode(int nationalCode)
   {
      this.nationalCode = String.valueOf(nationalCode);
   }

   private String name;
   private String lastName;
   private String nationalCode;

}
