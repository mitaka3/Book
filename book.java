/**
 *
 * @author user
 */
import java.util.Scanner;
public class Book {
    
private String Title;
private int booknumber;
Scanner book = new Scanner (System.in);

public String getTitle()
    {
        return Title;
    }
public void setTitle(String BookName)
    {
    Title = BookName;
    }
public int getBookNumber()
    {
            return booknumber;
    }
public void setBookNumber(int BookNumber)
    {
    booknumber = BookNumber;
    }
}