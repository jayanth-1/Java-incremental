 class C {
    private int x;

    public C() {

        this(1);           // Calling second constructor from first constructor

    }

    public C(int x) {
        this.x = x;
        System.out.println("x : " + x);
    }
}

public class Overload{

	 public static void main(String[] args) {

	 	C objC = new C();
		
	}
}