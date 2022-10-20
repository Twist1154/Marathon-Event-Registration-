/**
 *Book.java
 * @author Cwenga Dlova(214310671)
 * This is the worker class for Loan.
 * 19/10/2022
 */

package za.ac.Models;

public class Loan {
    
    private int issueId;
    private String studentNumber;
    private String bookIsbn;
    private int period;
    private String loanDate;
    private int penalty;

    public Loan() {
    }

    public Loan(int issueId, String studentNumber, String bookIsbn, int period, String loanDate, int penalty) {
        this.issueId = issueId;
        this.studentNumber = studentNumber;
        this.bookIsbn = bookIsbn;
        this.period = period;
        this.loanDate = loanDate;
        this.penalty = penalty;
    }

    public int getIssueId() {
        return issueId;
    }

    public void setIssueId(int issueId) {
        this.issueId = issueId;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    @Override
    public String toString() {
        return "Loan{" + "issueId=" + issueId + ", studentNumber=" + studentNumber + ", bookIsbn=" + bookIsbn + ", period=" + period + ", loanDate=" + loanDate + ", penalty=" + penalty + '}';
    }
    
    
}
