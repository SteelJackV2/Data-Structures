import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ProblemSeven {
    public ProblemSeven(){
        File name = new File("D:\\Akash's Stuff\\Computer Science\\Data Structures\\FirstProject\\src\\PrSeven");
        try{
            BufferedReader input = new BufferedReader(new FileReader(name));
            String text="";
            int output = 0;
            while( (text=input.readLine())!= null) {
                String [] split = text.split(" ");
                int card = Integer.parseInt(split[0]);
                int target = Integer.parseInt(split[1]);
                output++;
                ArrayList<Integer> iNumbers = new ArrayList<Integer>();
                for (int x =0; x<4; x++){
                    iNumbers.add(0,card%10);
                    card/=10;
                }
                ArrayList<Integer> addition = new ArrayList<Integer>();

                int additon = (iNumbers.get(0)+iNumbers.get(1)+iNumbers.get(2)+iNumbers.get(3));
                addition.add(additon);

                String combined = iNumbers.get(1).toString()+iNumbers.get(2).toString();
                addition.add(iNumbers.get(0) + Integer.parseInt(combined) + iNumbers.get(3));

                combined = iNumbers.get(1).toString()+iNumbers.get(2).toString()+iNumbers.get(3).toString();
                addition.add( iNumbers.get(0) + Integer.parseInt(combined));

                combined = iNumbers.get(0).toString()+iNumbers.get(1).toString()+iNumbers.get(2).toString();
                addition.add( iNumbers.get(3) + Integer.parseInt(combined));

                combined = iNumbers.get(0).toString()+iNumbers.get(1).toString();
                String combinedtwo = iNumbers.get(2).toString()+iNumbers.get(3).toString();
                addition.add(Integer.parseInt(combined) + Integer.parseInt(combinedtwo));

                combined = iNumbers.get(0).toString()+iNumbers.get(1).toString();
                addition.add(iNumbers.get(3) + Integer.parseInt(combined) + iNumbers.get(2));

                combined = iNumbers.get(2).toString()+iNumbers.get(3).toString();
                addition.add(iNumbers.get(1) + Integer.parseInt(combined) + iNumbers.get(0));


                int number = 0;
                for (int x : addition){
                    if(x<=target){
                        if(x>number){
                            number = x;
                        }
                    }
                }
                System.out.println("Output #"+output+": "+number);

            }

        }
        catch (IOException io) {
            System.err.println("File does not exist");
        }
    }

    public static void main(String[] args){
        ProblemSeven app=new ProblemSeven();
    }
}
