
package TOBA.data;

import TOBA.Business.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountDB {
    public static int insert(Account account) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        
        String query
                = "INSERT INTO Account (Balance, UserID) "
                + "VALUES (?, ?)";
        try {
            ps = connection.prepareStatement(query);
            ps.setLong(1, account.getBalance());
            ps.setObject(2, account.getUserID());      
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }

}
