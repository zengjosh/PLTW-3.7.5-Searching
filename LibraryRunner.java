
/*
 * Activity 3.7.5
 */
import java.util.ArrayList;

public class LibraryRunner
{
  public static void main(String[] arg)
  {
    Library library = new Library();
    ArrayList<Book> childrensBooks = new ArrayList<Book>();

    childrensBooks = library.getChildrensBooks();

    String authorToFind = "L. Frank Baum";
    double rating = 0;
    for (int i = 0; i < childrensBooks.size(); i++) {
      if (childrensBooks.get(i).getTitle().equals("Sky Island")) {
        rating = childrensBooks.get(i).getRating();
      }
    }

    // System.out.println(rating);
    for (int i = 0; i < childrensBooks.size(); i++) {
      if (childrensBooks.get(i).getRating() >= rating) {
        System.out.println(childrensBooks.get(i).getTitle());
      }
    }
  }

}