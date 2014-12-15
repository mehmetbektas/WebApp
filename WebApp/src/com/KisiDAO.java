package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class KisiDAO extends ConnectionHelper {
	
	public void kayitEkle(Kisi kisi){
		
            Connection con = null;
            Statement stmt = null;
            
            try {
            	con = getConnection();
	            stmt = con.createStatement();
	            stmt.execute("insert into kullanici (isim,yas) values ('"+kisi.isim+"','"+kisi.yas+"')");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				closeStatement(stmt);
				closeConnection(con);
				
			}
            
        
		
	}
}
