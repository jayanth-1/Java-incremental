package Jayanth.assignment;

class Main{
    public static void main(String[] args){
        int p,q;
        Data objA = new Data();
        objA.printing();
        //objA.localVariablesPrint(p,q); //It shows compile error because local variables are not initialised

        Singleton obj = Singleton.prints("Hi");
        obj.nonStatic();


    }
}