package generics;

public class generics{
	
	public static <T> void genric (T fr)

{

System.out.println("it is the "+" "+fr);
}

public static void main(String[] args) { // TODO Auto-generated method stub

genric("Avinash"); Integer myint =1;

genric(myint);

genric(true);

}
}