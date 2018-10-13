import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.math.*;
import java.util.ArrayList;
public class ProblemFive {
    public ProblemFive() {
        File name = new File("D:\\Akash's Stuff\\Computer Science\\Data Structures\\FirstProject\\src\\PrFive");

        try {
            BufferedReader input = new BufferedReader(new FileReader(name));

            String text, text2, text3="";
            while( (text=input.readLine())!= null) {
                text2 = input.readLine();
                text3 = input.readLine();

                String [] lineOne = text.split(" ");
                String [] lineTwo = text2.split(" ");
                String [] lineThree = text3.split(" ");
                String[][] game = new String[3][3];
                for(int x = 0; x<3; x++){
                    if(x == 0){
                        for(int y = 0; y<3; y++){
                            game[x][y]= lineOne[y];
                        }
                    }
                    if(x == 1){
                        for(int y = 0; y<3; y++){
                            game[x][y]= lineTwo[y];
                        }
                    }
                    if(x == 2){
                        for(int y = 0; y<3; y++){
                            game[x][y]= lineThree[y];
                        }
                    }
                }

                String winner = "-";
                int Xs = 0;
                int Os = 0;
                int length = 3;
                for (int x = 0; x < length; x++) {
                    for (int y = 0; y < length; y++) {
                        if(game[x][y].equals("X")){
                            Xs++;
                        }else if(game[x][y].equals("O")){
                            Os++;
                        }
                    }if(Xs == length){
                        winner = "X";
                    }else if(Os == length){
                        winner = "0";
                    }
                    Os = 0;
                    Xs = 0;
                }
                for (int x = 0; x < length; x++) {
                    for (int y = 0; y < length; y++) {
                        if(game[y][x].equals("X")){
                            Xs++;
                        }else if(game[y][x].equals("O")){
                            Os++;
                        }
                    }if(Xs == length){
                        winner = "X";
                    }else if(Os == length){
                        winner = "0";
                    }
                    Os = 0;
                    Xs = 0;
                }
                Os = 0;
                Xs = 0;
                for (int x = 0, y = 0; x <length ; x++, y++) {
                    if (game[x][y].equals("X")){
                        Xs++;
                    }else if(game[x][y].equals("O")){
                        Os++;
                    }
                }if(Xs == length){
                    winner = "X";
                }else if(Os == length){
                    winner = "0";
                }
                for (int x= length-1, y= length-1; x >= 0 ; x--, y--) {
                    if (game[x][y].equals("X")){
                        Xs++;
                    }else if(game[x][y].equals("O")){
                        Os++;
                    }
                }if(Xs == length){
                    winner = "X";
                }else if(Os == length){
                    winner = "0";
                }

                System.out.println(winner);
            }

        }
        catch (IOException io) {
            System.err.println("File does not exist");
        }
    }

    public static void main(String[] args) {
        ProblemFive app=new ProblemFive();
    }
}
