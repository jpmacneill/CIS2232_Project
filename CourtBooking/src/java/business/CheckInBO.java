/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business;

import java.sql.Connection;
import java.sql.PreparedStatement;
import util.ConnectionUtils;

/**
 *
 * @author Joel
 */
public class CheckInBO {
    public static void checkIn(int memberID, boolean towel) throws Exception {
        PreparedStatement ps = null;
        String sql = null;
        
        Connection conn = ConnectionUtils.getConnection();
        
        try {
            sql = "INSERT INTO check_in (`membership_id`, `towel_taken`) VALUES (?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, memberID);
            if (towel) {
                ps.setInt(2, 1);
            } else {
                ps.setInt(2, 0);
            }
            System.out.println(ps);
            
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Error message: " + e);
        }
    }
}
