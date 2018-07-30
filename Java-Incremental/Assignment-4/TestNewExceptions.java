 class ChildAgeException extends Exception {       //creating customException 1
 
    public ChildAgeException(String message) {
        super(message);
    }
}

 class AdultAgeException extends Exception {       //creating customException 2
 
    public AdultAgeException(String message) {
        super(message);
    }
}

 class OldAgeException extends Exception {         //creating customException 3
 
    public OldAgeException(String message) {
        super(message);
    }
}

 class ExceptionThrow {
 
    public void check(int age) throws ChildAgeException, AdultAgeException, OldAgeException {
        if (age>0 && age<18) 
            throw new ChildAgeException("ChildAgeException");    //throwing ChildAgeException
        if(age>=18 && age<50)
        	throw new AdultAgeException("AdultAgeException");    //throwing AdultAgeException
        if(age>=50 && age<100)
        	throw new OldAgeException("OldAgeException");        //throwing OldAgeException
    
    }
}

 class TestNewExceptions{

	public static void main(String[] args){

		try{                                         
         ExceptionThrow ex = new ExceptionThrow();    
         ex.check(10);
         ex.check(20);
         ex.check(60); 
         
		}

		catch(ChildAgeException | AdultAgeException | OldAgeException e){     //single catch clause for three exceptions
			//e.getMessage();
			System.out.println(e.getMessage());
		}

		finally{                                                   //finally block
			System.out.println("This is final block ");
		}
	}
}