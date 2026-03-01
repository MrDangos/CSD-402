/**
 * @author Hugo Ramirez Jr.
 * @date 2/28/2026
 * Module 9 - SQL GUI
 * @description This file helps connect to the front end and db. This file also handles the
 * search and update features
 */
import java.net.URL;
import java.sql.*;

public class SelectData{

  Connection con;

  Statement stmt;

  ResultSet resultSet;

  public SelectData(){

    try{

      Class.forName("com.mysql.cj.jdbc.Driver");

      String url = "jdbc:mysql://localhost:3306/databasedb?";

      con = DriverManager.getConnection(url + "user=student1&password=pass");

      stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    }
    catch(Exception e){
        System.out.println(e);
        System.out.println("Error connection to database.");
        System.exit(0);
    }

    try{

      resultSet = stmt.executeQuery("SELECT * FROM fans");
    }
    catch(SQLException e){

      System.out.println(e);
      System.out.println("Result Request Failed");
    }
  }

    public MyRecord getSearch(int id){

        MyRecord myRecord = new MyRecord();

        try{
            ResultSet rs = stmt.executeQuery("SELECT * FROM fans WHERE field_id = " + id);

            if (rs.next()) {
                myRecord.setFeild_id(rs.getInt("field_id"));
                myRecord.setFirstname(rs.getString("firstname"));
                myRecord.setLastname(rs.getString("lastname"));
                myRecord.setFavoriteteam(rs.getString("favoriteteam"));
            }

            rs.close();
        }
        catch(Exception e){
            System.out.println(e);
        }

        return myRecord;
    }

    public MyRecord updateRecord(int id, String firstName, String lastName, String favoriteTeam){

        MyRecord myRecord = new MyRecord();

        try{
            String sql = "UPDATE fans SET firstname=?, lastname=?, favoriteteam=? WHERE field_id=?";

            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, firstName);
            pstmt.setString(2, lastName);
            pstmt.setString(3, favoriteTeam);
            pstmt.setInt(4, id);

            int rowsAffected = pstmt.executeUpdate();

            if(rowsAffected > 0){
                System.out.println("Record updated successfully.");
            }

            pstmt.close();

            // Return updated record
            return getSearch(id);
        }
        catch(Exception e){
            System.out.println("Update Failed: " + e);
        }

        return myRecord;
    }

  public void close(){

    try{
      stmt.close();
      con.close();
    }
    catch(SQLException e){

      System.out.println("Connection close failed");
    }
  }

    public static void main(String args[]) {

        SelectData selectMyData = new SelectData();

        MyRecord record = selectMyData.getSearch(1);

        System.out.println(record.getFeild_id());
        System.out.println(record.getFirstname());
        System.out.println(record.getLastname());
        System.out.println(record.getFavoriteteam());

        selectMyData.close();
    }
}