package Demo.s4;

public class Main {
    public static void main(String[] args){
        Prime p = new Prime();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<20;i++){
//                   synchronized (p){
                       p.thayxy();
//                   }
                    try{
                        Thread.sleep(1000);
                    }catch (Exception e){

                    }
                }

            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<20;i++){
//                    synchronized (p){
                        p.thayxy();
//                    }
                    try{
                        Thread.sleep(1000);
                    }catch (Exception e){

                    }
                }

            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<20;i++){
                    p.thayz();
                    try{
                        Thread.sleep(1000);
                    }catch (Exception e){

                    }
                }

            }
        });
        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");
        t1.start();
//        t2.setDaemon(true);
//        try {
//            t1.join();
//        }catch (Exception e){        }
        t2.start();
        t3.start();
    }
}
