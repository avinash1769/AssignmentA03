package question3;

public class CovariantB extends CovariantA{
    @Override  
    CovariantB foo()  
    {  
        return this;  
    }  
      
    void print()  
    {  
        System.out.println("In th WithIn the covariantB class");  
    }  

}
