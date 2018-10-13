import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.*;
import java.util.Date;

public class ProblemEight {
    public ProblemEight(){
        File name = new File("D:\\Akash's Stuff\\Computer Science\\Data Structures\\FirstProject\\src\\PrEight");
        try{
            BufferedReader input = new BufferedReader(new FileReader(name));
            String text="";
            while( (text=input.readLine())!= null) {
                String [] split = text.split(" ");

                Date dat = new Date();
                SimpleDateFormat ft = new SimpleDateFormat ("hh:mm a 'on' MM/dd/yyyy");
                int []daysInaMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
                String d = dat.toString();
                String [] dateDetails = d.split( " ");
                int hour = dat.getHours();
                int minutes = dat.getMinutes();
                int day = Integer.parseInt(dateDetails[2]);
                int year = Integer.parseInt(dateDetails[5]);
                int month = dat.getMonth();
                month++;
                String DM = "AM";




                minutes+= Integer.parseInt(split[2]);
                hour+=(minutes/60);
                minutes%=60;
                hour+= Integer.parseInt(split[1]);
                day+= (hour/24);
                hour%=24;
                day+= Integer.parseInt(split[0]);
                int m  = month;
                month+=(day/30);
                year+=month/12;
                month%=12;
                if(year%4 == 0){
                    day--;
                }
                while (day>=daysInaMonth[m-1]){
                    day-=daysInaMonth[m-1];
                    if (m == 12){
                        m=0;
                    }
                    m++;
                }
                if(hour/12 == 1){
                    DM = "PM";
                }
                hour%=12;


                System.out.println("Departure Date and Time: " + ft.format(dat));
                System.out.println("Arrival Date and Time: " + hour+":"+minutes+" "+DM+" on "+month+"/"+day+"/"+year);
                System.out.println();
            }


        }
        catch (IOException io) {
            System.err.println("File does not exist");
        }
    }


    public static void main(String[] args)
    {
        ProblemEight app=new ProblemEight();
    }
}
