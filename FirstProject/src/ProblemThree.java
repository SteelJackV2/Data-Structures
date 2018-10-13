import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.math.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ProblemThree {
    public ProblemThree() {
        File name = new File("D:\\Akash's Stuff\\Computer Science\\Data Structures\\FirstProject\\src\\PrThree");

        try {
            BufferedReader input = new BufferedReader(new FileReader(name));

            String text="";
            while( (text=input.readLine())!= null) {
                System.out.println(text);
                String [] numbersplit = text.split(" ");
                ArrayList <Integer> numbers = new ArrayList<Integer>();

                for(String x: numbersplit){
                    numbers.add(Integer.parseInt(x));
                }
                int [] nums = new int[numbers.size()-2];
                for (int x = numbers.size()-1; x>=2; x--){
                    nums[x-2] = numbers.remove(x);
                }
                Arrays.sort(nums);
                for(int x :nums){
                    numbers.add(x);
                }
                for(int x = 3; x<numbers.size()-1; x+=2){
                    numbers.add(x, numbers.remove(x+1));
                }

                System.out.println(numbers);
            }

        }
        catch (IOException io) {
            System.err.println("File does not exist");
        }
    }

    public static void main(String[] args) {
        ProblemThree app=new ProblemThree();
    }
}
