package question18;

public class TwiceThread {

public void run(){

System.out.println("running...");
}

public static void main(String args[]){ 
	
	TwiceThread t1=new TwiceThread();
}

t1.start();

t1.start();

}