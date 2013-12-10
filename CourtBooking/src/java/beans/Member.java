package beans;

/**
 *
 * @author bjmaclean
 */
public class Member {

    private String memberId = "";
    private String password = "";
    private String firstName = "";
    private String lastName = "";
    private String status = "";
    private int userType = 0;
    private boolean authenticated;

    public boolean isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }

    public Member(String memberId, String password) {
        this.memberId = memberId;
        this.password = password;
    }
    
    /**
     * @author  Joel
     * @param memberID 
     */
    public Member(String memberID) {
        this.memberId = memberID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public int getUserType() {
        return userType;
    }
    
    public void setUserType(int userType) {
        this.userType = userType;
    }
    
}
