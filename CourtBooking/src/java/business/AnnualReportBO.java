package business;

import beans.CourtBooking;
import forms.AnnualReportForm;
import forms.MemberForm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import util.ConnectionUtils;
import util.DbUtils;

/**
 *
 * @author
 * Jeff
 * White
 */
public class AnnualReportBO {
    
    /**
     * This method will get all of the members from the members table.  
     * 
     * @return an array list of the MemberForm class
     * @author BJ
     * @since 20131202
     */
    
    public static ArrayList<AnnualReportForm> getAllMembers() {
        //return the members from the member table.
        ArrayList<AnnualReportForm> members = new ArrayList();

        PreparedStatement ps = null;
        String sql = null;
        Connection conn = null;

        try {
            conn = ConnectionUtils.getConnection();

            sql = "SELECT * FROM `check_in` WHERE 1";

            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                // It is possible to get the columns via name
                // also possible to get the columns via the column number
                // which starts at 1

                // e.g. resultSet.getSTring(2);
                AnnualReportForm AnnualReportForm = new AnnualReportForm();
                AnnualReportForm.setMembershipId(rs.getInt(2));
                AnnualReportForm.setCheck_in_time(rs.getDate(3));
                System.out.println(AnnualReportForm.getCheck_in_time());
                members.add(AnnualReportForm);
            }
        } catch (Exception e) {
            String errorMessage = e.getMessage();
            e.printStackTrace();
        } finally {
            DbUtils.close(ps, conn);
        }

        return members;
    }

}
