/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RawatInap;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author CAPTAIN
 */
public class KoneksiDatabase {
    private static Connection koneksi;
    public static Connection getKoneksi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/UnitRawatInap";
                String user = "root";
                String password = "";

                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                JOptionPane.showMessageDialog(null," Koneksi Sukses ",
                 "Informasi",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException t) {
                JOptionPane.showMessageDialog(null," Koneksi Gagal ",
                 "Perhatian",JOptionPane.INFORMATION_MESSAGE);
            }
        }

        return koneksi;


    }
    
}
