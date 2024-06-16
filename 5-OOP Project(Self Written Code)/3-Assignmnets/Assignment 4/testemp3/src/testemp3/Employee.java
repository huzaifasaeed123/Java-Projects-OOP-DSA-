
package testemp3;
public class Employee {
    private String fname,lname,SocialSecurityNum;

    public Employee(String fname, String lname, String SocialSecurityNum) {
        this.fname = fname;
        this.lname = lname;
        this.SocialSecurityNum = SocialSecurityNum;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getSocialSecurityNum() {
        return SocialSecurityNum;
    }

    public void setSocialSecurityNum(String SocialSecurityNum) {
        this.SocialSecurityNum = SocialSecurityNum;
    }
    @Override
    public String toString()
    {
        return String.format("First Name:%s\nLast Name:%s\nSocialSecurityNum:%s\n",this.fname,this.lname,this.SocialSecurityNum);
    }
    
    
}
