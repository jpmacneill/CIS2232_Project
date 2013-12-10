/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package forms;

import java.sql.Date;

/**
 *
 * @author Joel
 */
public class CheckInForm extends org.apache.struts.action.ActionForm {
    protected String memberID = "";
    protected String firstName = "";
    protected String lastName = "";
    protected Date checkInTime = null;
    protected boolean towel = false;
    protected String action = "";

    public String getMemberID() {
        return memberID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getCheckInTime() {
        return checkInTime;
    }

    public boolean isTowel() {
        return towel;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCheckInTime(Date checkInTime) {
        this.checkInTime = checkInTime;
    }

    public void setTowel(boolean towel) {
        this.towel = towel;
    }
    
    public String getAction() {
        return action;
    }
    
    public void setAction(String action) {
        this.action = action;
    }
}
