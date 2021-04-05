package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector {
    private static Connector connector;
    public final static String connectString ="jdbc:mysql://localhost:3306/T2008M?useUnicode=true&characterEncoding=utf-8" ;
    public final static String user ="root";
    public final static String password ="";
    Statement statement;
    private Connector() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(connectString, user, password);
            setStatement(conn.createStatement());
        }catch (ClassNotFoundException c){
            System.out.println("Class Eror!!!!!!!!");
        }catch (SQLException s){
            System.out.println("SQL Eror!!!!!!!!");
        }
    }
    public static Connector getInstance(){
        if (connector==null)
            connector = new Connector();
        return  connector;
    }


    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }
}
