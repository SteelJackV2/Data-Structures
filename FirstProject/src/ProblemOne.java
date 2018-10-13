import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.math.*;
import java.util.ArrayList;


public class ProblemOne
{
    public ProblemOne()
    {
        File name = new File("D:\\Akash's Stuff\\Computer Science\\Data Structures\\FirstProject\\src\\PrOne.txt");

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        String [] lineOne;
        String [] lineTwo;
        String [] lineThree;
        int set=1;


        try
        {
            BufferedReader input = new BufferedReader(
                    new FileReader(name));

            String text1,text2,text3="";
            while( (text1=input.readLine())!= null)
            {
                text2 = input.readLine();
                text3 = input.readLine();

                lineOne = text1.split(" ");
                lineTwo = text2.split(" ");
                lineThree = text3.split(" ");

                text1 = " "+text1+" ";
                text2 = " "+text2+" ";
                text3 = " "+text3+" ";

                for(String t : lineOne){
                    if(text2.contains(" "+t+" ") && text3.contains(" "+t+" ")){
                        numbers.add(Integer.parseInt(t));
                    }

                }

                System.out.println("Set "+set+" intersection = "+numbers);
                numbers = new ArrayList<Integer>();
                set++;
            }

        }
        catch (IOException io)
        {
            System.err.println("File does not exist");
        }
    }

    public static void main(String[] args)
    {
        ProblemOne app=new ProblemOne();
    }

}
