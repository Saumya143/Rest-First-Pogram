package com.nt.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nt.domain.Book;

@Path("/book")
public class BookResource {
	
	public BookResource() {
		System.out.println("BookResource.BookResource()");
	}
	
	@GET
	@Path("/get")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Book findBook() {
		Book book=new Book();
		book.setBookId(1021);
		book.setBookName("spring");
		book.setAutherName("rod johnson");
		book.setBookPrice((double) 1000);
		return book;
	
	}
    @Path("/addBook")
	@POST
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Book addBook(Book book) {
		System.out.println(book);
		return book;
	}
	
	@PUT
	public String updateBook() {
		return "update successfull";
	}
	
	@DELETE
	public String deleteBook() {
		return "Delete successful";
	}

}
