import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Databases {
    public static void main(String[] args) throws Exception {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/home/ramesh/Databases/testjava.db");
           Statement statement = conn.createStatement();
         statement.execute("CREATE TABLE student (name TEXT, phone INTEGER, email TEXT)");
           //statement.execute("CREATE TABLE IF NOT EXISTS contacts" +"(name TEXT,phone INTEGER, email TEXT)");
            statement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
    }