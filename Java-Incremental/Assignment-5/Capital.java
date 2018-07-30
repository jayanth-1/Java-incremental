import java.util.regex.*;
import java.util.Scanner;
class Capital{

	public static void main(String[] args) {

         System.out.println("Enter string ");
         Scanner sc = new Scanner(System.in);
         String str = sc.next();
             
         System.out.println(Pattern.matches("^[A-Z][^.]*[.]$",str));
	}
}