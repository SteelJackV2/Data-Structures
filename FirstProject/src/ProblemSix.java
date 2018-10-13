import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ProblemSix {
    public ProblemSix(){
        File name = new File("D:\\Akash's Stuff\\Computer Science\\Data Structures\\FirstProject\\src\\PrSix");
        try{
            BufferedReader input = new BufferedReader(new FileReader(name));
            String text="";
            while( (text=input.readLine())!= null) {
                String [] split = text.split(" ");
                ArrayList<Integer> numbers = new ArrayList<Integer>();
                for(String a : split){
                    numbers.add(Integer.parseInt(a));
                }
                int []daysInaMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
                String [] weekdays = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
                if(numbers.get(0)==1){
                    daysInaMonth[1] = 29;
                }

                int totalDays = 0;
                for (int x = 0; x<numbers.get(2)-1; x++){
                    totalDays += daysInaMonth[x];
                }
                totalDays+= ((numbers.get(1)-1)+numbers.get(3));

                System.out.println(text+" "+weekdays[totalDays%7]);
            }

        }
        catch (IOException io) {
            System.err.println("File does not exist");
        }
    }

    public static void main(String[] args)
    {
        ProblemSix app=new ProblemSix();
    }
}
