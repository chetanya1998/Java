//read a file and count the number of lines in a file
import java.io.*;
public class filehandling3{
    public static void main(String[] args) throws IOException {
    File file = new File("/home/chetanya/Desktop/smartcity.txt");
    FileInputStream fin = new FileInputStream(file);
    InputStreamReader input = new InputStreamReader(fin);
    BufferedReader reader = new BufferedReader(input);
    int linecount=0;
    String s;
    while((s=reader.readLine())!=null)
    {
      ++linecount;
    }
      fin.close();
      System.out.println("Number of lines in the files:"+linecount);
    }
  }
