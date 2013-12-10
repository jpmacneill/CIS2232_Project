/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business;

import beans.Member;
import forms.CheckInForm;
import forms.MemberLookupForm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import util.ConnectionUtils;

/**
 *
 * @author Joel
 */
public class LookupBO {
    
    public static ArrayList<CheckInForm> getMemberDetails(int memberID) {
        ArrayList<CheckInForm> memberDetails = new ArrayList();
        
        PreparedStatement ps = null;
    
        String sql = null;
        Connection conn = null;

        try {
            sql = "SELECT * FROM member WHERE member_id = ?";
            
            ps = conn.prepareStatement(sql);
            ps.setInt(1, memberID);
            
            ResultSet rs = ps.executeQuery(sql);
            
            while(rs.next()) {
                //Member member = new Member(memberID);
            }

        } catch (Exception e) {
            System.out.println("Error message: " + e);
        }
        
        return memberDetails;
    }
    
    public static boolean exists(Member member) throws Exception {
        boolean userExists = false;
        
        PreparedStatement ps = null;
        String sql = null;
        
        Connection conn = ConnectionUtils.getConnection();
        
        try {
            sql = "SELECT * FROM member WHERE member_id = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(member.getMemberId()));
            System.out.println(ps);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                member.setFirstName(rs.getString("firstName"));
                member.setLastName(rs.getString("lastName"));
                member.setStatus(rs.getString("status"));
                userExists = true;
            } else {
                userExists = false;
            }
        } catch (Exception e) {
            System.out.println("Error message: " + e);
        }
        
        return userExists;
    }
}
