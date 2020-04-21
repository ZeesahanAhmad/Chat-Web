/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author zeeshan ahmad
 */
public class dbConnect {

    private Connection c;
    private Statement st;
    PreparedStatement insertUser, checkLogin, getPhoto, searchPeople, getPeoplebyEmailId;

    public dbConnect() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ptalk", "root", "incapp123");
        st = c.createStatement();
        insertUser = c.prepareStatement("insert into user_info values(?,?,?,?,?,?,?,?,?,?)");
        checkLogin = c.prepareStatement("select * from user_info where email=? and password=?");
        getPhoto = c.prepareStatement("select photo from user_info where email=?");
        searchPeople = c.prepareStatement("select name,email,phone,dob,gender from user_info where  state=? and city=? and email!=? and area like ? ");
        getPeoplebyEmailId = c.prepareStatement("select * from user_info where email=?");

    }

    public String insertUser(HashMap userDetails) throws SQLException {
        try {
            insertUser.setString(1, (String) userDetails.get("email"));
            insertUser.setString(2, (String) userDetails.get("password"));
            insertUser.setString(3, (String) userDetails.get("name"));
            insertUser.setString(4, (String) userDetails.get("phone"));
            insertUser.setString(5, (String) userDetails.get("gender"));
            insertUser.setDate(6, (Date) userDetails.get("dob"));
            insertUser.setString(7, (String) userDetails.get("state"));
            insertUser.setString(8, (String) userDetails.get("city"));
            insertUser.setString(9, (String) userDetails.get("area"));
            insertUser.setBinaryStream(10, (InputStream) userDetails.get("photo"));
            int x = insertUser.executeUpdate();

            if (x != 0) {
                return "Registeration Successfull!";
            } else {
                return "Registration failed !";
            }

        } catch (java.sql.SQLIntegrityConstraintViolationException ex) {
            return "Email ID already exist !";

        }

    }

    public HashMap checkLogin(String e, String p) throws SQLException {
        try {
            checkLogin.setString(1, e);
            checkLogin.setString(2, p);
            ResultSet rs = checkLogin.executeQuery();
            if (rs.next()) {
                HashMap userDetails = new HashMap();
                
                userDetails.put("email", rs.getString("email"));
                userDetails.put("name", rs.getString("name"));
                userDetails.put("phone", rs.getString("phone"));
                userDetails.put("gender", rs.getString("gender"));
                userDetails.put("dob", rs.getDate("dob"));
                userDetails.put("state", rs.getString("state"));
                userDetails.put("city", rs.getString("city"));
                userDetails.put("area", rs.getString("area"));

                return userDetails;

            } else {
                return null;
            }

        } catch (Exception ex) {
            return null;

        }

    }

    public byte[] getPhoto(String e) throws SQLException {
        try {
            getPhoto.setString(1, e);
            ResultSet rs = getPhoto.executeQuery();
            if (rs.next()) {
                byte[] b = rs.getBytes("photo");

                if (b.length != 0) {
                    return b;
                } else {
                    return null;
                }
            } else {
                return null;
            }

        } catch (Exception ex) {
            return null;
        }

    }

    public ArrayList<java.util.HashMap> searchPeople(String s, String c, String e, String a) throws SQLException {
        searchPeople.setString(1, s);
        searchPeople.setString(2, c);
        searchPeople.setString(3, e);
        searchPeople.setString(4, "%" + a + "%");
        ResultSet rs = searchPeople.executeQuery();

        ArrayList<java.util.HashMap> allUserDetails = new ArrayList();
        while (rs.next()) {
            HashMap userDetails = new HashMap();
            userDetails.put("name", rs.getString("name"));
            userDetails.put("email", rs.getString("email"));
            userDetails.put("phone", rs.getString("phone"));
            userDetails.put("dob", rs.getDate("dob"));
            userDetails.put("gender", rs.getString("gender"));

            allUserDetails.add(userDetails);

        }
        return allUserDetails;

    }

    public HashMap getPeoplebyEmailId(String temail) throws SQLException {
        getPeoplebyEmailId.setString(1, temail);
        ResultSet rs = getPeoplebyEmailId.executeQuery();
        if (rs.next()) {

            HashMap tUserDetails = new HashMap();

            tUserDetails.put("email", rs.getString("email"));
            tUserDetails.put("name", rs.getString("name"));
            tUserDetails.put("phone", rs.getString("phone"));
            tUserDetails.put("gender", rs.getString("gender"));
            tUserDetails.put("dob", rs.getDate("dob"));
            tUserDetails.put("state", rs.getString("state"));
            tUserDetails.put("city", rs.getString("city"));
            tUserDetails.put("area", rs.getString("area"));

            return tUserDetails;

        } else {
            return null;
        }

    }

}
