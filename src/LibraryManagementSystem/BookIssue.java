/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManagementSystem;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Umashankar Vishwakar
 */
@Entity
@Table(name = "BOOK_ISSUE", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "BookIssue.findAll", query = "SELECT b FROM BookIssue b")
    , @NamedQuery(name = "BookIssue.findByStudentCardNo", query = "SELECT b FROM BookIssue b WHERE b.studentCardNo = :studentCardNo")
    , @NamedQuery(name = "BookIssue.findByBookName", query = "SELECT b FROM BookIssue b WHERE b.bookName = :bookName")
    , @NamedQuery(name = "BookIssue.findByIssueDate", query = "SELECT b FROM BookIssue b WHERE b.issueDate = :issueDate")
    , @NamedQuery(name = "BookIssue.findByReturnDate", query = "SELECT b FROM BookIssue b WHERE b.returnDate = :returnDate")})
public class BookIssue implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "STUDENT_CARD_NO")
    private String studentCardNo;
    @Column(name = "BOOK_NAME")
    private String bookName;
    @Column(name = "ISSUE_DATE")
    @Temporal(TemporalType.DATE)
    private Date issueDate;
    @Column(name = "RETURN_DATE")
    @Temporal(TemporalType.DATE)
    private Date returnDate;

    public BookIssue() {
    }

    public BookIssue(String studentCardNo) {
        this.studentCardNo = studentCardNo;
    }

    public String getStudentCardNo() {
        return studentCardNo;
    }

    public void setStudentCardNo(String studentCardNo) {
        String oldStudentCardNo = this.studentCardNo;
        this.studentCardNo = studentCardNo;
        changeSupport.firePropertyChange("studentCardNo", oldStudentCardNo, studentCardNo);
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        String oldBookName = this.bookName;
        this.bookName = bookName;
        changeSupport.firePropertyChange("bookName", oldBookName, bookName);
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        Date oldIssueDate = this.issueDate;
        this.issueDate = issueDate;
        changeSupport.firePropertyChange("issueDate", oldIssueDate, issueDate);
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        Date oldReturnDate = this.returnDate;
        this.returnDate = returnDate;
        changeSupport.firePropertyChange("returnDate", oldReturnDate, returnDate);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentCardNo != null ? studentCardNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BookIssue)) {
            return false;
        }
        BookIssue other = (BookIssue) object;
        if ((this.studentCardNo == null && other.studentCardNo != null) || (this.studentCardNo != null && !this.studentCardNo.equals(other.studentCardNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LibraryManagementSystem.BookIssue[ studentCardNo=" + studentCardNo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
