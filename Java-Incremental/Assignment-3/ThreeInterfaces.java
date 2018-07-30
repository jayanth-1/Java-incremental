interface A{                             //first interface
	void method1();
	void method2(); 

}

interface B{                             //second interface
	void method3();
	void method4(); 
}

interface C{                             //third interface 
	void method5();
	void method6(); 
}

interface D extends A, B, C {            // extends all three interfaces to a new interface

	void method7();                      // added new method
}

class E{                                 // created another concrete class
 public void method8(){
 	System.out.println("This is concrete class E ");
 }

}
class F extends E implements D{                       // class F implents interface D and also inherited class E 

	public void method1(){
		System.out.println("This is Interface A ");
	}

	public void method2(){
		System.out.println("This is Interface A ");
	}
	public void method3(){
		System.out.println("This is Interface B ");
	}
	public void method4(){
		System.out.println("This is Interface B ");
	}
	public void method5(){
		System.out.println("This is Interface C ");
	}
	public void method6(){
		System.out.println("This is Interface C ");
	}
	public void method7(){
		System.out.println("This is Interface D ");
	}
	public void method8(A a){
		a.method1();
		//a.method2();
    
	}
	public void method9(B b){
        b.method3();

	}
	public void method10(C c){
        c.method5();

	}
	public void method11(D d){
        d.method7();

	}


}

class ThreeInterfaces{

	

	public static void main(String[] args){
        F objF = new F();
        objF.method8(objF); // passing object to method which has first interface as an argument
        objF.method9(objF); // passing object to method which has second interface as an argument
        objF.method10(objF); // passing object to method which has third interface as an argument
        objF.method11(objF); // passing object to method which has new interface as an argument

	}

}