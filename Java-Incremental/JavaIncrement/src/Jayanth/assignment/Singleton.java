package Jayanth.assignment;

public class Singleton {

        String a;
        public static Singleton prints(String a){
            a = "Hi ";               
            return new Singleton();

        }

        public void nonStatic(){
            System.out.println("String is " + a);

        }


    }

