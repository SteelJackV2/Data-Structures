import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.math.*;

public class ProblemFour {
    public ProblemFour() {
        File name = new File("D:\\Akash's Stuff\\Computer Science\\Data Structures\\FirstProject\\src\\PrFour");

        try {
            BufferedReader input = new BufferedReader(new FileReader(name));

            String text="";
            while( (text=input.readLine())!= null) {
                String [] inst = text.split(" ");
                int [] format = new int [5];
                int n = 0;
                for(String x : inst){
                    format[n] = Integer.parseInt(x);
                    n++;
                }


                String[][] draw = new String[format[0]][format[1]];
                for(int x = 0; x<format[0]; x++){
                    for(int y = 0; y<format[1]; y++){
                       draw[x][y] = "0";
                    }
                }

                int l= 1;
                int w = 0;
                for(int x = format[3]; x<format[3]+format[2]; x++){
                    for(int y = format[4]-w; y<l+format[4]; y++){
                        draw[x][y] = "X";
                    }
                    l+=1;
                    w++;
                }
                l-=2;
                w-=2;
                for(int x = format[3]+format[2]; x<format[3]+format[2]+format[2]; x++){
                    for(int y = format[4]-w; y<l+format[4]; y++){
                        draw[x][y] = "X";
                    }
                    l--;
                    w--;
                }


                for(int x = 0; x<format[0]; x++){
                    for(int y = 0; y<format[1]; y++){
                        System.out.print(draw[x][y]);
                    }
                    System.out.println();
                }

            }

        }
        catch (IOException io) {
            System.err.println("File does not exist");
        }
    }

    public static void main(String[] args) {
        ProblemFour app=new ProblemFour();
    }
}
