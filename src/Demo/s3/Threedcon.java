package Demo.s3;

public class Threedcon extends Thread{
//    public void run(){
//        for (int i=10;i>=0;i--){
//            if (i==10){
//                System.out.println(i+":00");
//                try{
//                    Thread.sleep(100);
//                }catch (Exception e){}
//            }else {
//                for (int j=59;j>-1;j--){
//                    if (j<10){
//                        System.out.println(i+":0"+j);
//                    }else {
//                        System.out.println(i + ":" + j);
//                    }
//                    try{
//                        Thread.sleep(100);
//                    }catch (Exception e){}
//                }
//            }
//
//        }
//    }
    public void run(){
        int min=10;
        int sec=0;
        while (min>=0){
            while (sec >=0){
                System.out.println((min>=10?min:"0"+min)+":"+(sec>=10?sec:"0"+sec));
                sec--;
                if (sec<0){
                    sec=59;
                    min--;
                }
                try{
                    Thread.sleep(1000);
                }catch (Exception e ){}
            }
        }
    }
}
