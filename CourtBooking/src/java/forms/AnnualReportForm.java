/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.sql.Date;
import java.util.ArrayList;
import org.apache.struts.validator.ValidatorForm;

/**
 *
 * @author
 * Jeff
 * White
 */
public class AnnualReportForm extends ValidatorForm {
 
    private  ArrayList<forms.AnnualReportForm> members;
    private int membershipId;
    private Date check_in_time;
    
    public ArrayList<forms.AnnualReportForm> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<forms.AnnualReportForm> members) {
        this.members = members;
    }

    public int getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(int memberId) {
        this.membershipId = memberId;
    }

    public Date getCheck_in_time() {
        return check_in_time;
    }

    public void setCheck_in_time(Date check_in_time) {
        this.check_in_time = check_in_time;
    }
    
}
