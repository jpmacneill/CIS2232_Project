package actions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import beans.Member;
import business.LookupBO;
import forms.FutureForm;
import forms.MemberLookupForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Joel
 */
public class MemberLookup extends Action {

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        MemberLookupForm checkInForm = (MemberLookupForm) request.getAttribute("MemberLookupForm");
        //System.out.println("THIS IS WORKING");
        if (checkInForm.getAction().equalsIgnoreCase("Lookup")) {
            //System.out.println("THIS IS WORKING");
            
            Member member = new Member(checkInForm.getMemberID());
            
            if (!LookupBO.exists(member)) {
                return mapping.findForward("member-look-up");
                
            } else {
                
                checkInForm.setFirstName(member.getFirstName());
                checkInForm.setLastName(member.getLastName());
                if (member.getStatus().equals("1")) {
                    checkInForm.setStatus("Active");
                } else {
                    checkInForm.setStatus("Inactive");
                }
                return mapping.findForward("checkIn");
            }
        } else{
            return mapping.findForward("");
        }
      
        //return mapping.findForward("");
    }
}
