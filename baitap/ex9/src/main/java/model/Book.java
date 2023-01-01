package model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBook;
    private String nameBook;
    private String authorBook;
    private  Integer amountBook;
    private String describeBook;
    @OneToMany(mappedBy = "books", fetch = FetchType.LAZY)
    private Set<BorrowBook> borrowBooks;
    public Book() {
    }
    public Book(Long idBook, String nameBook, String authorBook, Integer amountBook, String describeBook) {
        this.idBook = idBook;
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.amountBook = amountBook;
        this.describeBook = describeBook;
    }

    public Long getIdBook() {
        return idBook;
    }

    public void setIdBook(Long idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public Integer getAmountBook() {
        return amountBook;
    }

    public void setAmountBook(Integer amountBook) {
        this.amountBook = amountBook;
    }

    public String getDescribeBook() {
        return describeBook;
    }

    public void setDescribeBook(String describeBook) {
        this.describeBook = describeBook;
    }

    public Set<BorrowBook> getPersonBookBorrowers() {
        return borrowBooks;
    }

    public void setPersonBookBorrowers(Set<BorrowBook> personBookBorrowers) {
        this.borrowBooks = personBookBorrowers;
    }

}
