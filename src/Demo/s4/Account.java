package Demo.s4;

public class Account {
    int balance;
    public  synchronized void nap(int gold){
        balance+=gold;
        System.out.println("Nap "+gold+" thanh cong");
        try{
            notifyAll();
        }catch (Exception e){}
    }
    public synchronized void rut(int gold){

        while (balance<gold){
            System.out.println("Cho tien tu tren troi roi xuong");
            try {
                wait();
            }catch (Exception e){}
        }
        balance-=gold;
        System.out.println("Rut "+gold+" thanh cong");
    }
}
