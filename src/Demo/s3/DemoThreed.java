package Demo.s3;

public class DemoThreed extends Thread{
    public void run(){
        for (int i=0;i<20;i++){
            System.out.println(Thread.currentThread().getName()+" = "+i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}
