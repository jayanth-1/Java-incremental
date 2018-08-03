package Jayanth.assignment;

class Main{
    public static void main(String[] args){
        
        Data objA = new Data();
        objA.printing();
        //objA.localVariablesPrint(); //It shows compile error because local variables are not initialised

        Singleton obj = Singleton.prints("Hi"); // It will creates singleton object and initializes with string
        obj.nonStatic();


    }
}
