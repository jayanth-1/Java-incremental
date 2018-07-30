import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.util.*;
class DistinctWordsInFile
{
    public static void main(String[] args) throws IOException
    {
        int ch;
        System.out.println("Enter file name : ")
        Scanner sc = new Scanner(System.in);
        String fileName = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();        // hashMap for storing distinct characters
        FileReader fr=null;
        try
        {
            fr = new FileReader(fileName);
        }
        catch (FileNotFoundException fe)
        {
            System.out.println("File not found");
        }
               while ((ch=fr.read())!=-1)
                 map.put((char)ch,1);
                 //System.out.print((char)ch);
        fr.close();

          
        FileWriter fw = new FileWriter("countWords.txt");
        for(Map.Entry m:map.entrySet()){ 
        	char c = m.getKey().toString().charAt(0);
             
            fw.write(c);                                         //writing distinct characters to a file countWords.txt
        }
        fw.close();
    
    }


}