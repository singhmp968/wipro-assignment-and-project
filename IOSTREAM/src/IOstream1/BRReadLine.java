package IOstream1;
import java.io.*;
public class BRReadLine{
    public static void main(String args[])throws IOException{
        String str;BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("EnterCharacters,'stop'toquit");
        do{
            str=br.readLine();
            System.out.println(str);}
            while(!str.equals("stop"));}}