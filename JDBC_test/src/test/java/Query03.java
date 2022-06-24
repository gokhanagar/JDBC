import java.sql.*;

public class Query03 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC", "root", "23932393Gc.");

        Statement st = con.createStatement();

        // SORU1: Bölümler tablosundan tüm kayıtları listeleyiniz.
        ResultSet veri = st.executeQuery("select * from bolumler ");

        while(veri.next()) {

            System.out.printf("%-6d %-15.15s %-8s\n",
                    veri.getInt(1), veri.getString(2), veri.getString(3));
        }

        // SORU2:SATIS ve MUHASEBE bolumlerinde calişan personelin isimlerini ve maaşlarını,
        // maaş ters sıralı listeleyiniz.
        ResultSet veri1 = st.executeQuery("select personel_isim, maas from personel " +
                "where bolum_id in(10,30) " +
                "order by maas desc;");


        while(veri1.next()) {

            System.out.printf("%-15.15s %-6d\n", veri1.getString(1), veri1.getInt(2));
        }















    }
}
