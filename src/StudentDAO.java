import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    public void insert(Student s) {
        try (Connection con = DBUtil.getConnection()) {
            String sql = "INSERT INTO students VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, s.getRollNo());
            ps.setString(2, s.getName());
            ps.setString(3, s.getBranch());
            ps.setInt(4, s.getMarks());
            ps.executeUpdate();
            System.out.println("✅ Student added successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showAll() {
        try (Connection con = DBUtil.getConnection()) {
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM students");
            while (rs.next()) {
                System.out.println(
                    "Roll No: " + rs.getInt("roll_no") +
                    ", Name: " + rs.getString("name") +
                    ", Branch: " + rs.getString("branch") +
                    ", Marks: " + rs.getInt("marks"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(int rollNo) {
        try (Connection con = DBUtil.getConnection()) {
            String sql = "DELETE FROM students WHERE roll_no=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, rollNo);
            ps.executeUpdate();
            System.out.println("🗑 Student deleted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateMarks(int rollNo, int newMarks) {
        try (Connection con = DBUtil.getConnection()) {
            String sql = "UPDATE students SET marks=? WHERE roll_no=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, newMarks);
            ps.setInt(2, rollNo);
            ps.executeUpdate();
            System.out.println("✏️ Marks updated.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}