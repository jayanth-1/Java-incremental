abstract class Rodent{

	Rodent(){

		System.out.println("In base class...");
	}
	
	public void eat(){
		System.out.println("in base class eating....");
	}

	public void teeth(){
		System.out.println("Rodents have no teeth...");

	}

    abstract void sound();

}

class Rat extends Rodent{

	Rat(){

		System.out.println("This is derived class Rat" );
	}

	public void eat(){
		System.out.println("Rat is eating....");
	}

	public void teeth(){
		System.out.println("Rat has teeth...");
	}
     
    public void sound(){
    	System.out.println("Rat has squeak sound...");
    }

}

class Squirrel extends Rodent{

	Squirrel(){

		System.out.println("This is derived class Squirrel" );
	}

	public void eat(){
		System.out.println("Squirrel is eating....");
	}

	public void teeth(){
		System.out.println("Squirrel has teeth...");
	}

	public void sound(){
    	System.out.println("Squirrel has whining sound...");
    }
}

class InheritanceHeirarchy{
	 
	 public static void main(String[] args) {

	 	Rodent[] test = {new Rat(),new Squirrel()};  

	 	for(int i=0; i<test.length; i++)
	 	{
	 		test[i].eat();
	 		test[i].teeth();
	 		test[i].sound();
	 	}
		
	}
}