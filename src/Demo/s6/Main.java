package Demo.s6;
import java.sql.*;
public class Main {
    public final static String connectString ="jdbc:mysql://localhost:3306/T2008M?useUnicode=true&characterEncoding=utf-8" ;
    public final static String user ="root";
    public final static String password ="";// nếu dùng mamp thì là root xampp thì bỏ trống
    public static void main(String[] args ){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(connectString, user, password);
            Statement stt = conn.createStatement();
            // xem sinh vien
            String txt_sql ="select * from sinhvien";
            ResultSet rs = stt.executeQuery(txt_sql);
            while (rs.next()){
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getInt("age"));
                System.out.println(rs.getInt("mark"));
        }
            //thêm sinh viên
            String insert_sql = "insert into sinhvien(name,age,mark) values('Đoàn Đụ',20,7)";
            stt.execute(insert_sql);

        }catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }catch (SQLException e){
            System.out.println("SQL Error");
        }
    }
}
