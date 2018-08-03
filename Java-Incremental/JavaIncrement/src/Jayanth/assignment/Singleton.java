package Jayanth.assignment;

public class Singleton {

        String a;
        public static Singleton prints(String b){
            a=b;                    // It initializes string 
            return new Singleton(); // It return singleton object

        }

        public void nonStatic(){
            System.out.println("String is " + a);

        }


    }

