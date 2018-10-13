import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.math.*;


public class ProblemTwo {
    public ProblemTwo(){

        File name = new File("D:\\Akash's Stuff\\Computer Science\\Data Structures\\FirstProject\\src\\PrTwo.txt");

        try {
            BufferedReader input = new BufferedReader( new FileReader(name));

            String text="";
            while( (text=input.readLine())!= null) {
                int n = Integer.parseInt(text);
                BigInteger one = BigInteger.valueOf(2);
                BigInteger two = BigInteger.valueOf(1);

                for (int x = 1; x < n; x++) {
                    BigInteger sum = one.add(two);
                    one = two;
                    two = sum;
                }
                System.out.println(two);
            }
        }
        catch (IOException io){
            System.err.println("File does not exist");
        }
    }

    public static void main(String[] args){
        ProblemTwo app=new ProblemTwo();
    }
}



