/*
 * DATABASE CONNECTOR - IF CHANGED TO OTHER SERVER/DATABASE, CHANGE THE DATA BELOW.
 */
package logic;

/**
 *
 * @author Dennis
 */
public class DB {
    public static final String driver = "oracle.jdbc.driver.OracleDriver";
    public static final String URL = "jdbc:oracle:thin:@datdb.cphbusiness.dk:1521:dat";
    public static final String user = "SEM2_GR05";
    public static final String password = "SEM2_GR05";
}