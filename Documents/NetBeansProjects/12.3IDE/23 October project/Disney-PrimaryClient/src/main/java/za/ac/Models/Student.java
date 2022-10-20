
/**
 *Book.java
 * @author Cwenga Dlova(214310671)
 * This is the worker class for Student.
 * 19/10/2022
 */
package za.ac.Models;

public class Student {
    
    private String studentNumber;
    private String studentName;
    private int studentGrade;
    private String cellPhone;
    private String address;

    public Student() {
    }

    public Student(String studentNumber, String studentName, int studentGrade, String cellPhone, String address) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.studentGrade = studentGrade;
        this.cellPhone = cellPhone;
        this.address = address;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" + "studentNumber=" + studentNumber + ", studentName=" + studentName + ", studentGrade=" + studentGrade + ", cellPhone=" + cellPhone + ", address=" + address + '}';
    }
    
    
    
}