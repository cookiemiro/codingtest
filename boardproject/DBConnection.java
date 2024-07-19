package boardproject;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import lombok.Getter;

@Getter
public abstract class DBConnection {
  private Connection connection = null;

  Properties properties = new Properties();
//  private String db_url = "jdbc:mysql://localhost:3306/ssgdatabase";
//  private String db_id = "root";
//  private String db_pwd = "dbxodml";

  protected Connection open() {
    try {
      properties.load(DBConnection.class.getResourceAsStream("../database.properties"));

      String driver = properties.getProperty("driver");
      String db_url = properties.getProperty("url");
      String db_id = properties.getProperty("username");
      String db_pwd = properties.getProperty("password");

      Class.forName(driver);
      connection = DriverManager.getConnection(db_url, db_id, db_pwd);
      return connection;
    } catch (ClassNotFoundException | SQLException | IOException e) {
      System.err.println(e.getMessage());
      return null;
    }
  }

  protected boolean close() {
    try {
      connection.close();
      return true;
    } catch (SQLException e) {
      System.err.println(e.getMessage());
      return false;
    }
  }

  protected ResultSet execute(String query) {
    ResultSet rs = null;
    try {
      open();
      Statement obj = connection.createStatement();
      rs = obj.executeQuery(query);

    } catch (SQLException e) {
      System.err.println(e.getMessage());
    }

    return rs;
  }
}
