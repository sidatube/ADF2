package Demo.s4;

import java.util.Scanner;

public class DemoWait {
    public static void main(String[] args){
        Account a = new Account();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so tien can rut:");
        int y = sc.nextInt();
        System.out.println("Nhap so tien dc gui:");
        int x = sc.nextInt();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                a.rut(y);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<y/x;i++){
                    a.nap(x);

                }

            }
        });
        t1.start();
        t2.start();
    }
}
