import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBAccess{

    private final String url = "jdbc:postgresql://database-1.c5pgy23e1h2n.us-east-1.rds.amazonaws.com:5432/postgres";
    private final String user = "yetihop";
    private final String password = "08022013";

    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
/*    public void connect() throws SQLException {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        List result = new ArrayList<>();


       String SQL_update = "INSERT INTO company (id, company_name, age, salary) VALUES (?, ?, ?, ?);" ;
        PreparedStatement preparedStatement2 = conn.prepareStatement(SQL_update);
        for (int i = 1; i<=5; i++) {
            preparedStatement2.setInt(1, i);
            preparedStatement2.setString(2, "company " + i);
            preparedStatement2.setInt(3, 142);
            preparedStatement2.setInt(4, 1420000);
            preparedStatement2.executeUpdate();
        }
        String SQL_SELECT = "Select * from company";
        PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int salary = resultSet.getInt("salary");
            String age = resultSet.getString("age");
            int id = resultSet.getInt("id");
            String company_name = resultSet.getString("company_name");
            System.out.println(id + " " + company_name + " " + age + " " + salary);
        }



        conn.close();
    }*/

    public void truncate() throws SQLException {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        List result = new ArrayList<>();


        String SQL_update = "truncate table company;";
        PreparedStatement preparedStatement2 = conn.prepareStatement(SQL_update);
        for (int i = 1; i<=5; i++) {
            preparedStatement2.setInt(1, i);
            preparedStatement2.setString(2, "company " + i);
            preparedStatement2.setInt(3, 142);
            preparedStatement2.setInt(4, 1420000);
            preparedStatement2.executeUpdate();
        }
        String SQL_SELECT = "Select * from company";
        PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int salary = resultSet.getInt("salary");
            String age = resultSet.getString("age");
            int id = resultSet.getInt("id");
            String company_name = resultSet.getString("company_name");
            System.out.println(id + " " + company_name + " " + age + " " + salary);
        }



        conn.close();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        DBAccess app = new DBAccess();
        app.truncate();


    }
}
