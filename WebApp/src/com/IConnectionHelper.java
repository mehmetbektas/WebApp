/**
 * 
 */
package com;

import java.sql.Connection;
import java.sql.Statement;

/**
 * @author Innocent
 *
 */
public interface IConnectionHelper {
	/**
	 * 
	 * @return
	 */
	Connection getConnection();
	/**
	 * 
	 * @param con
	 */
	void closeConnection(Connection con);
	/**
	 * 
	 * @param ps
	 */
	void closeStatement(Statement st);
	
}
