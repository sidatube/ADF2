package Demo.s3;

public class Main {
    public  static  void main(String[] args ){
//        DemoThreed dt = new DemoThreed();
//        dt.setName("dmm");
//        dt.start();
//        DemoThreed dt2 = new DemoThreed();
//        dt2.setName("dmm p2");
//        dt2.start();
        Threedcon doto = new Threedcon();
        doto.start();

        for (int i=0;i<20;i++){
            System.out.println("i = "+i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){}
        }

    }
    //tao 1 threed dem nuoc thời gian vê 0
    //gia su tg 10p

}
