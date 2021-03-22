package Demo.s4;

public class Prime {
    int x=0,y=0;
    int z=0;
    public  void tangXY(){
        x++;
        y++;
    }
    public  void inXY(){
        System.out.println(Thread.currentThread().getName()+"---");
        System.out.println("x="+x);
        System.out.println("y="+y);
    }

    public synchronized void thayxy(){
        tangXY();
        inXY();
    }
    public synchronized void thayz(){
        System.out.println(Thread.currentThread().getName()+"---");
        z++;
        System.out.println("z="+z);
    }
}
