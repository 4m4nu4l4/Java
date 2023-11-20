import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

public class Conectando {
    public static void main(String[] args) {
        try {
            Connection connManager = DriverManager
                .getConnection(
                    "jdbc:mysql://localhost:3306/",
                    "root",
                    ""
                );
            System.out.println("Conexão estabelecida!");
            PreparedStatement ps = connManager.prepareStatement("SELECT * FROM biblioteca WHERE nome LIKE ?");
            ps.setString(1, "%JA%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("nome"));
            }
            connManager.close();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }
}