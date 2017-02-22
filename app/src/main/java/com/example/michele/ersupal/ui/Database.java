package com.example.michele.ersupal.ui;

/**
 * Created by Michele on 19/02/2017.
 */
import android.database.sqlite.SQLiteDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Database {

    /**
     * Create a new table in the test database
     *
     */
    public static void createNewTable() {
        // SQLite connection string

        String url = "jdbc:sqlite:C://Users/Michele/Desktop/Database/tests.db";

        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS Utente (\n"
                + "	id integer PRIMARY KEY,\n"
                + "	name text NOT NULL,\n"
                + "	password text not null\n"
                + ");";
        String insertUtenti = "Insert into Utente(id,name,password) values (1,'Cannas','1234')";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
            stmt.execute(insertUtenti);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        createNewTable();
    }
    public static boolean GetUtente(String name, String password){

        String url = "jdbc:sqlite:C://Users/Michele/Desktop/Database/tests.db";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            // create a new table
            ResultSet res = stmt.executeQuery("Select id,nome,password from Utente where nome =\" +name +\"and password=\"+password+\";");
            if(res.first()){
                return true;
            }
            else{
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;

    }


}
