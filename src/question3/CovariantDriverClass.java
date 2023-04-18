package question3;

import question3.CovariantA;
import question3.CovariantB;

public class CovariantDriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CovariantA a1 = new CovariantA();  
	       a1.foo().print();    
	       CovariantB a2 = new CovariantB();  
	       ((CovariantB)a2.foo()).print();  
	}
}

