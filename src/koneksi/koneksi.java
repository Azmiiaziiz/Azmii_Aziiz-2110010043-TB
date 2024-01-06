
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class koneksi {
     
      public static Connection konn( ){
          Connection conn=null;
                     String url  = "jdbc:mysql://localhost:3306/apk_krs",
                          user       = "root",
                          pass       = "";
               try{
                      conn = (Connection) DriverManager.getConnection(url, user, pass);
                      System.out.println("koneksi ok");
               }catch (SQLException err){
                       System.out.println(""+err.getMessage( ));
               }
               return conn;
      }
     
    
}

