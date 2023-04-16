import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCDemo {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/jdbcdemo";
        try {
        Class.forname("com.mysql.cj.jdbc.Driver");

        Connection connection= DriverManager.getConnection(null, null, null)

        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
