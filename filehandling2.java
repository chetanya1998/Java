//searching a word in a textfile
//if found "Word Found" else "Not Found"
import java.io.*;
import java.util.Scanner;
public class filehandling2{
  public static int searchCount(File fileA, String fileWord)
  throws FileNotFoundException
  {
    int count=0;
    fileWord=fileWord.trim();
    Scanner scanner = new Scanner(fileA);

    while(scanner.hasNext()){
      String nextWord = scanner.next().trim();
      if(nextWord.equals(fileWord)){
        ++count;
      }
    }
    return count;

  }
   public static void main(String[] args) {
    File file = new File("/home/chetanya/Desktop/smartcity.txt");
    Scanner scn = new Scanner (System.in);
    String str=scn.next();
    try{
      int count = searchCount(file,str);
      if(count != 0)
        System.out.println("word found");
      else

       System.out.println("word not found");

      }catch(FileNotFoundException e){
        e.printStackTrace();
      }
    }
  }
