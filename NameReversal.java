//29/03/2018
//Name Reversal Assignment
import java.io.*;
import java.util.*;
public class NameReversal
{
    public static void main(String args[])
    {
        Scanner kbReader = new Scanner(System.in);
        System.out.print("Please enter your name. ");
        String name = kb.Reader.next(); //user inputs name
        name = name.toLowerCase();
        for (int j = name.length(); j >= 0; j--)
        {
            System.out.print(name.substring(j, j+1));
        }
    }
}