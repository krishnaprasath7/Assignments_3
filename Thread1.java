
public class Thread1 implements Runnable {
	@Override  
    public void run() {  
        System.out.println("Thread has ended");  
    }  
   
    public static void main(String[] args) {  
    	Thread1 ex = new Thread1();  
        Thread t1= new Thread(ex);  
        t1.start();  
        System.out.println("Hi");  
    }  

}
