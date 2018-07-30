class A{

	public A(String a){

		System.out.println("argument is : " + a);
	}

}

class Construction{

	public static void main(String[] args){

		A[] objectsA = new A[3];  // not assigning objects to array in this case print statement in constructor is not executed

	}
}


class ConstructionReference{

	public static void main(String[] args){

		A[] objectsA = new A[3];  

		objectsA[0] = new A("Hi"); // in this case constructor is executed
	}
}