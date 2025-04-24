package lab.library.entity;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> books;
	private String name;
	
	public Library(String name) {
		this.name = name;
		this.books = new ArrayList<>();
	}
	public void addBook(Book book) {
		System.out.println("도서가 추가되었습니다." + book.getTitle());
		this.books.add(book);
	}
	public Book findBookByTitle(String title) {
		Book book = null;
		for (Book book2 : books) {
			if(book2.getTitle().equals(title)) {
				book=book2;
				break;
			}
		}
		return book;
	}
	public Book findBookByAuthor(String author) {
		Book book = null;
		for (Book book2 : books) {
			if(book2.getAuthor().equals(author)) {
				book=book2;
				break;
			}
		}
		return book;
	}
	public Book findBookByISBN(String isbn) {
		Book book = null;
		for (Book book2 : books) {
			if(book2.getIsbn().equals(isbn)) {
				book=book2;
				break;
			}
		}
		return book;
	}
	public boolean checkOutBook(String isbn) {
		for (Book book : books) {
			if(book.getIsbn().equals(isbn) && book.isAvailable()) {
				book.setAvailable(false);
				return true;
			}
		}
		return false;
	}
	public boolean returnBook(String isbn) {
		for (Book book : books) {
			if(book.getIsbn().equals(isbn) && !book.isAvailable()) {
				book.setAvailable(true);
				return true;
			}
		}
		return false;
	}
	public List<Book> getAvailableBooks(){
 		List<Book> booksAvailable = new ArrayList<>();
		for (Book book :books) {
			if(book.isAvailable()) {
				booksAvailable.add(book);
			}
		}
		return booksAvailable;
	}
	public List<Book> getAllBooks(){
 		List<Book> booksAvailable = new ArrayList<>();
		for (Book book :books) {
				booksAvailable.add(book);
		}
		return booksAvailable;
	}
	public int getTotalBooks() {
		int count=0;
		for (Book book : books) {
			count++;
		}
		return count;
	}
	public int getAvailableBooksCount() {
		int count=0;
		for (Book book : books) {
			if(book.isAvailable()) {
				count++;
			}
		}
		return count;
	}
	public int getBorrowedBooksCount() {
		int count=0;
		for (Book book : books) {
			if (!book.isAvailable()){
				count++;
			}
		}
		return count;
	}
}
