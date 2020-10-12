package com.zll.java.week.week2;


import java.math.BigDecimal;
import java.util.Date;

;

/**
 * @ClassName Book1
 * @Description TODO
 * @Author 86180
 * @Date 2020/10/12
 **/
public class Book1 {
    private String bookName;
    private String isbn;
    private String author;
    private BigDecimal price;
    private Date publishedDate;

    /**
     * @return 返回书名
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * @param bookName Book
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }
}
