//counting number of words in textfile
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class filehandling1{
  public static void main(String[]args) throws IOException{
    File file =new File("/home/chetanya/Desktop/smartcity.txt");
    FileInputStream fin = new FileInputStream(file);
    InputStreamReader input = new InputStreamReader(fin);
    BufferedReader reader = new BufferedReader(input);
    String line;
    int countWord=0;
    int characterCount=0,i;
    do{
      i=fin.read();
      line = reader.readLine();
      if(i!=-1){
        if(line!=""){
          characterCount+=line.length();
          String[]words =line.split("\\s");
          countWord+=words.length;
        }
      }
    }while (i!=-1);
     {
      System.out.println("Total word count="+countWord);
      System.out.println("Totalnumber of characters="+characterCount);

    }


  }
}
