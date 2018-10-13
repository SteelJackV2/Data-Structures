import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ProblemNine {
    public ProblemNine(){
        File name = new File("D:\\Akash's Stuff\\Computer Science\\Data Structures\\FirstProject\\src\\PrNine");
        try{
            BufferedReader input = new BufferedReader(new FileReader(name));
            String text="";
            while( (text=input.readLine())!= null) {
                int number = Integer.parseInt(text);
                String [][] pattern = new String[number][number];

                for (int x = 0; x<number; x++){
                    for(int y = 0; y<number; y++){
                        pattern[x][y] = "-";
                    }
                }

                int next = 0;
                int org = number;
                for(int x = 0; x<number; x+=2){
                    for(int y = 0+x; y<number-x; y++){
                        pattern[x][y] = "*";
                        pattern[number-(x+1)][y] = "*";
                        pattern[y][number-(x+1)] = "*";
                    }
                    next+=2;
                }

                next = 0;
                for(int x = 0; x<number; x+=2){
                    for(int y = number-(x+1); y>= (2+x); y--){
                        pattern[y][x] = "*";
                    }
                    next+=2;
                }
                int a = 1;
                int b = 2;
                for (int x = 0; x <(number/4); x++){
                    pattern[b][a] = "*";
                    a+=2;
                    b+=2;
                }

                for (int x = 0; x<number; x++){
                    for(int y = 0; y<number; y++){
                        System.out.print(pattern[x][y] +" ");
                    }
                    System.out.println();
                }
                System.out.println();

            }

        }
        catch (IOException io) {
            System.err.println("File does not exist");
        }
    }

    public static void main(String[] args)
    {
        ProblemNine app=new ProblemNine();
    }
}
