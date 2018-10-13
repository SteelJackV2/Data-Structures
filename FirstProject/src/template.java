import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class template {
    public template(){
        File name = new File("D:\\Akash's Stuff\\Computer Science\\Data Structures\\FirstProject\\src\\PrOne.txt");
        try{
            BufferedReader input = new BufferedReader(new FileReader(name));
            String text="";
            while( (text=input.readLine())!= null) {
                String [] split = text.split(" ");

            }

        }
        catch (IOException io) {
            System.err.println("File does not exist");
        }
    }

    public static void main(String[] args)
    {
        template app=new template();
    }
}
