package AssistedProjects2;

public class RunnableThreadEx implements Runnable {

	public static int i = 0;
    public RunnableThreadEx(){
         
    }
    public void run() {
        while(RunnableThreadEx.i <= 10){
            try{
                System.out.println("Custom Thread: "+(++RunnableThreadEx.i));
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Exception in thread Occured : "+e.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Main Thread Starts!!!");
        Runnable r =  new RunnableThreadEx();
        Thread t = new Thread(r);
        t.start();
        while(RunnableThreadEx.i <= 10){
            try{
                System.out.println("Main Thread : "+(++RunnableThreadEx.i));
                Thread.sleep(100);
            } catch (InterruptedException e){
                System.out.println("Exception in main thread Occured : "+e.getMessage());
            }
        }
        System.out.println("Main Thread Ends!!!");
    }



}
