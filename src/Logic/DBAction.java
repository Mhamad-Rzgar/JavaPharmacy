package Logic;

import Models.ItemsModel;
import Models.LoginModel;
import Models.RegisterModel;
import com.mysql.cj.jdbc.CallableStatement;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DBAction {

    private static final String URL = "jdbc:mysql://localhost:3307/Pharmacy";

    // this
    public static boolean loginUser(LoginModel loginModel) throws Exception {
        Connection conn = DriverManager.getConnection(URL, "root", "HHaa1414@");

        String query = "select * from user where username=? AND password=?";

        PreparedStatement pst = conn.prepareStatement(query);

        pst.setString(1, loginModel.getUserName());
        pst.setString(2, loginModel.getPassword());

        ResultSet data = pst.executeQuery();

        boolean result = false;

        if (data.next()) {
            result = true;
        }

        conn.close();
        return result;
    }

    public static boolean registerAction(RegisterModel regMod) throws Exception {
        Connection conn = DriverManager.getConnection(URL, "root", "HHaa1414@");

        conn.setAutoCommit(false);

        String sql = "INSERT INTO profile (name, phoneNumber, age, gender, address) VALUES(?, ?, ?, ?, ?);";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, regMod.getName());
        stmt.setString(2, regMod.getMobile());
        stmt.setString(3, Integer.toString(regMod.getAge()));
        stmt.setString(4, regMod.getGender());
        System.out.println(regMod.getAddress());
        stmt.setString(5, regMod.getAddress());

        int rowsInserted2 = stmt.executeUpdate();

        sql = "INSERT INTO user (username, password, profileId) VALUES(?, ?, LAST_INSERT_ID());";
        stmt = conn.prepareStatement(sql);

        stmt.setString(1, regMod.getUsername());
        stmt.setString(2, regMod.getPassword());

        int rowsInserted = stmt.executeUpdate();

        boolean result = false;

        if (rowsInserted > 0 && rowsInserted2 > 0) {
            result = true;
        }
        conn.commit();
        conn.close();
        return result;
    }

    // this
//    public static boolean addProduct(ItemsModel itemsModel) throws Exception {
//        Connection conn = DriverManager.getConnection(URL, "root", "HHaa1414@");
//
//        String sql = "INSERT INTO products (barcode, scientificName, commercialName, category, brand, type, quanitity, expireDate, buyingPrice, sellingPrice) VALUES(?, ?, ?, ?, ?, ?, ? , ? , ? , ?);";
//        PreparedStatement stmt = conn.prepareStatement(sql);
//
//        stmt.setString(1, itemsModel.getBarcode());
//        stmt.setString(2, itemsModel.getScinteficName());
//        stmt.setString(3, itemsModel.getCommercialName());
//        stmt.setString(4, itemsModel.getCatigory());
//        stmt.setString(5, itemsModel.getBrand());
//        stmt.setString(6, itemsModel.getType());
//
//        stmt.setString(7, itemsModel.getQuantity());
//        stmt.setString(8, itemsModel.getExpireDate());
//        stmt.setString(9, itemsModel.getBuyingPrice());
//        stmt.setString(10, itemsModel.getSellingPrice());
//
//        int rowsInserted = stmt.executeUpdate();
//
//        boolean result = false;
//
//        if (rowsInserted > 0) {
//            result = true;
//        }
//
//        conn.close();
//        return result;
//    }
//    
    public static boolean addProduct(ItemsModel itemsModel) throws Exception {
        Connection conn = DriverManager.getConnection(URL, "root", "HHaa1414@");

        String sql = "{CALL insertProduct(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}"; // Stored Procedure Call
        try ( CallableStatement stmt = (CallableStatement) conn.prepareCall(sql)) {
            stmt.setString(1, itemsModel.getBarcode());
            stmt.setString(2, itemsModel.getScinteficName());
            stmt.setString(3, itemsModel.getCommercialName());
            stmt.setString(4, itemsModel.getCatigory());
            stmt.setString(5, itemsModel.getBrand());
            stmt.setString(6, itemsModel.getType());

            stmt.setString(7, itemsModel.getQuantity());
            stmt.setString(8, itemsModel.getExpireDate());
            stmt.setString(9, itemsModel.getBuyingPrice());
            stmt.setString(10, itemsModel.getSellingPrice());

            int rowsInserted = stmt.executeUpdate();

            boolean result = false;
            if (rowsInserted > 0) {
                result = true;
            }

            return result;
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }

    // this
    public static boolean updateProductById(ItemsModel itemsModel, int selectedId) throws Exception {
        Connection conn = DriverManager.getConnection(URL, "root", "HHaa1414@");

        String sql = "UPDATE products SET barcode = ?, scientificName = ?, commercialName = ?, category = ?, brand = ?, type = ?, quanitity = ?, expireDate = ?, buyingPrice = ?, sellingPrice = ? WHERE id = ?;";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, itemsModel.getBarcode());
        stmt.setString(2, itemsModel.getScinteficName());
        stmt.setString(3, itemsModel.getCommercialName());
        stmt.setString(4, itemsModel.getCatigory());
        stmt.setString(5, itemsModel.getBrand());
        stmt.setString(6, itemsModel.getType());

        stmt.setString(7, itemsModel.getQuantity());
        stmt.setString(8, itemsModel.getExpireDate());
        stmt.setString(9, itemsModel.getBuyingPrice());
        stmt.setString(10, itemsModel.getSellingPrice());

        stmt.setInt(11, selectedId);

        int rowsInserted = stmt.executeUpdate();

        boolean result = false;

        if (rowsInserted > 0) {
            result = true;
        }

        conn.close();
        return result;
    }

    // this
    public static boolean deleteProduct(int productId) {
        boolean success = false;
        try {
            Connection conn = DriverManager.getConnection(URL, "root", "HHaa1414@");

            String query = "DELETE FROM products WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, productId);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                success = true;
            }

            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return success;
    }

    // this
    public static ResultSet getAllProducts() throws Exception {
        Connection conn = DriverManager.getConnection(URL, "root", "HHaa1414@");

        String sql = "select * from products;";

        PreparedStatement stmt = conn.prepareStatement(sql);

        ResultSet data = stmt.executeQuery();
        return data;
    }

    // this
    public static ResultSet getProductByBarcode(String barcode) throws Exception {
        Connection conn = DriverManager.getConnection(URL, "root", "HHaa1414@");

        String sql = "select id, scientificName, sellingPrice from products where barcode=?";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, barcode);

        ResultSet data = stmt.executeQuery();
        return data;
    }

    public static boolean addSelling(DefaultTableModel model) throws Exception {

        boolean result = false;

        try {

            int rowCount = model.getRowCount();
            int columnCount = model.getColumnCount();
            Object[][] data = new Object[rowCount][columnCount];

            for (int i = 0; i < rowCount; i++) {
                for (int j = 0; j < columnCount; j++) {
                    data[i][j] = model.getValueAt(i, j);
                }
            }

            Connection conn = DriverManager.getConnection(URL, "root", "HHaa1414@");

            conn.setAutoCommit(false);

            String sql = "INSERT INTO selling (productId, quantity, discount) VALUES(?, ?, ?);";
            PreparedStatement stmt = conn.prepareStatement(sql);

            String sql2 = "UPDATE products SET quanitity = quanitity - ? WHERE id = ?;";
            PreparedStatement stmt2 = conn.prepareStatement(sql2);

            for (int i = 0; i < rowCount; i++) {
                stmt.setString(1, data[i][0].toString());
                stmt.setString(2, data[i][2].toString());
                stmt.setString(3, data[i][5].toString());
                stmt.addBatch();
            }

            for (int i = 0; i < rowCount; i++) {
                stmt2.setString(1, data[i][2].toString());
                stmt2.setString(2, data[i][0].toString());
                stmt2.addBatch();
            }

            int[] rowsInserted = stmt.executeBatch();
            int[] rowsInserted2 = stmt2.executeBatch();

            if (rowsInserted.length > 0 && rowsInserted2.length > 0) {
                result = true;
            }

            conn.commit();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    public static void printSelling(DefaultTableModel model) throws Exception {
        File file = new File("table_data.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter writer = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(writer);

        for (int i = 0; i < model.getColumnCount(); i++) {

            bw.write(model.getColumnName(i) + "\t");
        }
        bw.write("\n");

        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                bw.write(model.getValueAt(i, j) + "\t");
            }
            bw.write("\n");
        }
        JOptionPane.showMessageDialog(null, "success");
        bw.close();
        writer.close();
    }

}
