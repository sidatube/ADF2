package Demo.s5;

import java.io.*;

public class Main {
    public static void main(String[] args ){
        try {
            // write
            FileOutputStream fos = new FileOutputStream("doto.txt");
            DataOutputStream dos= new DataOutputStream(fos);
            dos.writeBytes("new cc\n");
            dos.writeBytes("weo vkl\n");
            dos.writeBytes("weo? leviathan  day");
            //read file
            FileInputStream fis = new FileInputStream("doto.txt");
            DataInputStream dis = new DataInputStream(fis);
            String txt ="";
            while (txt!=null){
                System.out.println(txt);
                txt=dis.readLine();

            }
        }catch (FileNotFoundException f){
            System.out.println("Đéo thấy file boke");
        }catch (IOException io){
            System.out.println("Lỗi file boke");
        }
    }
}
