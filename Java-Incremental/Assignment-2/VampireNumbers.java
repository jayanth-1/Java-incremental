import java.util.Arrays;
import java.util.HashSet;
import java.util.*;
 
public class VampireNumbers{

    /**
    * numDigits method takes one parameter and returns number of digits in it
    * @param num is a integer of type long
    */
    private static int numDigits(long num){
        return Long.toString(Math.abs(num)).length();
    }
    
    /**
    * fangCheck method takes 3 parameters and returns a true if it is vampire else false
    * @param orig it is a number to check whether it is vampire or not
    * @param fang1 it is a factor of orig
    * @param fang2 it is another factor of orig
    */
    private static boolean fangCheck(long orig, long fang1, long fang2){
        if(Long.toString(fang1).endsWith("0") && Long.toString(fang2).endsWith("0")) return false;
 
        int origLen = numDigits(orig);
        if(numDigits(fang1) != origLen / 2 || numDigits(fang2) != origLen / 2) return false;
 
        byte[] origBytes = Long.toString(orig).getBytes();
        byte[] fangBytes = (Long.toString(fang1) + Long.toString(fang2)).getBytes();
        Arrays.sort(origBytes);
        Arrays.sort(fangBytes);
        return Arrays.equals(origBytes, fangBytes);
    }
 
    public static void main(String[] args){
        System.out.println("First 100 vampire numbers and its fangs are : ");

        HashSet<Long> vamps = new HashSet<Long>();
        for(long i = 10; vamps.size() <= 100; i++ ){
            if((numDigits(i) % 2) != 0) {i = i * 10 - 1; continue;}
            for(long fang1 = 2; fang1 <= Math.sqrt(i) + 1; fang1++){
                if(i % fang1 == 0){
                    long fang2 = i / fang1;
                    if(fangCheck(i, fang1, fang2) && fang1 <= fang2){
                        vamps.add(i);
                        System.out.println(i + ": [" + fang1 + ", " + fang2 +"]");   // printing vampire number and its factors
                    }
                }
            }
        }
        
        /*Iterator<Long> it = vamps.iterator();
        while (it.hasNext())
            System.out.println(it.next());*/
    }
    }
