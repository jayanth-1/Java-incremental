interface Cycle{

	void cycleType();
}

interface CycleFactory{

	Cycle getCycle();
}
class Unicycle implements Cycle{

	
	public void cycleType(){

		System.out.println("It is Unicycle...");

	}
}


class Bicycle implements Cycle{

	public void cycleType(){

		System.out.println("It is Bicycle...");

	}

	
}

class Tricycle implements Cycle{

	public void cycleType(){

		System.out.println("It is Tricycle...");

	}
}

class UniFactory implements CycleFactory{

	public Cycle getCycle(){
		return new Unicycle();
	}
}

class BiFactory implements CycleFactory{

	public Cycle getCycle(){
		return new Bicycle();
	}
}

class TriFactory implements CycleFactory{

	public Cycle getCycle(){
		return new Tricycle();
	}
}

public class TestInterface {
	public static void newCycle(CycleFactory factory){
		Cycle c = factory.getCycle();
		c.cycleType();
	}
	public static void main(String[] args) {
		newCycle(new UniFactory());
		newCycle(new BiFactory());
		newCycle(new TriFactory());
	}
}