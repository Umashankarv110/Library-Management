/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManagementSystem;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Umashankar Vishwakar
 */
@Entity
@Table(name = "BOOK_INFO", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "BookInfo.findAll", query = "SELECT b FROM BookInfo b")
    , @NamedQuery(name = "BookInfo.findByIsbnno", query = "SELECT b FROM BookInfo b WHERE b.isbnno = :isbnno")
    , @NamedQuery(name = "BookInfo.findByBookName", query = "SELECT b FROM BookInfo b WHERE b.bookName = :bookName")
    , @NamedQuery(name = "BookInfo.findByAuthorName", query = "SELECT b FROM BookInfo b WHERE b.authorName = :authorName")
    , @NamedQuery(name = "BookInfo.findByPublisher", query = "SELECT b FROM BookInfo b WHERE b.publisher = :publisher")
    , @NamedQuery(name = "BookInfo.findByPrice", query = "SELECT b FROM BookInfo b WHERE b.price = :price")
    , @NamedQuery(name = "BookInfo.findByEdition", query = "SELECT b FROM BookInfo b WHERE b.edition = :edition")
    , @NamedQuery(name = "BookInfo.findByQty", query = "SELECT b FROM BookInfo b WHERE b.qty = :qty")})
public class BookInfo implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ISBNNO")
    private String isbnno;
    @Column(name = "BOOK_NAME")
    private String bookName;
    @Column(name = "AUTHOR_NAME")
    private String authorName;
    @Column(name = "PUBLISHER")
    private String publisher;
    @Column(name = "PRICE")
    private Integer price;
    @Column(name = "EDITION")
    private String edition;
    @Column(name = "QTY")
    private Integer qty;

    public BookInfo() {
    }

    public BookInfo(String isbnno) {
        this.isbnno = isbnno;
    }

    public String getIsbnno() {
        return isbnno;
    }

    public void setIsbnno(String isbnno) {
        String oldIsbnno = this.isbnno;
        this.isbnno = isbnno;
        changeSupport.firePropertyChange("isbnno", oldIsbnno, isbnno);
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        String oldBookName = this.bookName;
        this.bookName = bookName;
        changeSupport.firePropertyChange("bookName", oldBookName, bookName);
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        String oldAuthorName = this.authorName;
        this.authorName = authorName;
        changeSupport.firePropertyChange("authorName", oldAuthorName, authorName);
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        String oldPublisher = this.publisher;
        this.publisher = publisher;
        changeSupport.firePropertyChange("publisher", oldPublisher, publisher);
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        Integer oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        String oldEdition = this.edition;
        this.edition = edition;
        changeSupport.firePropertyChange("edition", oldEdition, edition);
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        Integer oldQty = this.qty;
        this.qty = qty;
        changeSupport.firePropertyChange("qty", oldQty, qty);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (isbnno != null ? isbnno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BookInfo)) {
            return false;
        }
        BookInfo other = (BookInfo) object;
        if ((this.isbnno == null && other.isbnno != null) || (this.isbnno != null && !this.isbnno.equals(other.isbnno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LibraryManagementSystem.BookInfo[ isbnno=" + isbnno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
