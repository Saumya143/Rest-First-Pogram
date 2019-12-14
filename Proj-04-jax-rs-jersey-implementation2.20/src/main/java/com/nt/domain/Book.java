package com.nt.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Book {
	private Integer bookId;
	private String bookName;
	private String AutherName;
	private Double bookPrice;

	public Book() {
		System.out.println("Book.Book()");
	}

	public Book(Integer bookId, String bookName, String autherName, Double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		AutherName = autherName;
		this.bookPrice = bookPrice;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAutherName() {
		return AutherName;
	}

	public void setAutherName(String autherName) {
		AutherName = autherName;
	}

	public Double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", AutherName=" + AutherName + ", bookPrice="
				+ bookPrice + "]";
	}

}
