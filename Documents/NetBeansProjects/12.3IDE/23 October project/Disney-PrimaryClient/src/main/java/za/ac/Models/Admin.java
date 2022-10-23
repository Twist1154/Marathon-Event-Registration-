package za.ac.Models;

/**
 *
 * @author retha
 */
public class Admin {
    private String usn;
    private String name;

    public Admin(String usn, String name) {
        this.usn = usn;
        this.name = name;
    }

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Admin" + "Usn:" + usn + "Name: " + name;
    }
    
}
