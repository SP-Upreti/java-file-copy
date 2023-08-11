import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException{
        FileInputStream inp = new FileInputStream("Test.txt");
        FileOutputStream another = new FileOutputStream("Output.txt");
       
        int i;
        while ((i = inp.read()) != -1){
            another.write(i);
        }
        System.out.println("Data Copied sucessfully!");
        inp.close();
        another.close();

    }
}
