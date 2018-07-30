class Cycle{

	public void cycle(){

		System.out.println("This is Cycle");
	}

	
}

class Unicycle extends Cycle{

	public void uniCycle(){

		System.out.println("This is  Unicycle");
	}

	public void balance(){      //added balance method

		System.out.println("Balancing Unicycle...");

	}

}

class Bicycle extends Cycle{

	public void bicycle(){

		System.out.println("This is derived class Bicycle");
	}

	public void balance(){      // added balance method

		System.out.println("Balancing Bicycle...");

	}

}

class Tricycle extends Cycle{

	public void triCycle(){

		System.out.println("This is derived class Tricycle");
	}

}

class CycleTest{

	public static void main(String[] args){
        Cycle[]  c = {new Unicycle(),new Bicycle(),new Tricycle()} ;  // upcasted to array of Cycle
		
		/*for(Cycle it: C )
			it.balance();*/ // It won't compile because it has no balance method
         
        
		
        ((Unicycle)c[0]).balance();
        ((Bicycle)c[1]).balance();
        //((Tricycle)c[2]).balance();   // It won't compile because it has no balance method
		
	}
}