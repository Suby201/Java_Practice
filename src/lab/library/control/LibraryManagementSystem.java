package lab.library.control;
import java.util.List;

import lab.library.entity.Book;
import lab.library.entity.Library;

public class LibraryManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib = new Library("중앙도서관");
		
		addSampleBooks(lib);
		System.out.println("===== 중앙도서관 =====");
		printLibrary(lib);
		testFindBook(lib);
		testCheckOut(lib);
		System.out.println("도서관 현재 상태: ");
		printLibrary(lib);
		testReturn(lib);
		System.out.println("도서관 현재 상태: ");
		printLibrary(lib);
		displayAvailableBooks(lib);
		
	}
	private static void printLibrary(Library lib) {
		System.out.println("전체 도서 수: "+lib.getTotalBooks());
		System.out.println("대출 가능 도서 수: "+lib.getAvailableBooksCount());
		System.out.println("대출 중인 도서 수: "+lib.getBorrowedBooksCount());
	}
	private static void addSampleBooks(Library library) {
		library.addBook(new Book("자바 프로그래밍", "김자바", "978-89-01-12345-6", 2022));
		library.addBook(new Book("객체지향의 사실과 오해", "조영호", "978-89-01-67890-1", 2015));
		library.addBook(new Book("Clean Code", "Robert C. Martin", "978-0-13-235088-4", 2008));
		library.addBook(new Book("Effective Java", "Joshua Bloch", "978-0-13-468599-1", 2018));
		library.addBook(new Book("Head First Java", "Kathy Sierra", "978-0-596-00920-5", 2005));
		library.addBook(new Book("자바의 정석", "남궁성", "978-89-01-14077-4", 2019));
	}

	private static void testFindBook(Library library) {
		System.out.println("=====도서 검색 테스트=====");
		System.out.println("제목으로 검색 결과:");
		System.out.println(library.findBookByTitle("자바의 정석"));
		System.out.println("저자로 검색 결과:");
		System.out.println(library.findBookByAuthor("Robert C. Martin"));
	}
	private static void testCheckOut(Library library) {
		System.out.println("=====도서 대출 테스트=====");
		if(library.checkOutBook("978-89-01-14077-4")) {
			System.out.println("도서 대출 성공!");
			System.out.println("대출된 도서 정보:");
			System.out.println(library.findBookByISBN("978-89-01-14077-4"));
		}
	}
	private static void testReturn(Library library) {
		System.out.println("=====도서 반납 테스트=====");
		if(library.returnBook("978-89-01-14077-4")) {
			System.out.println("도서 반납 성공!");
			System.out.println("반납된 도서 정보:");
			System.out.println(library.findBookByISBN("978-89-01-14077-4"));
		}
	}
	private static void displayAvailableBooks(Library library) {
		System.out.println("===== 대출 가능한 도서 목록 =====");
		List<Book> availableBooks = library.getAvailableBooks();
	    if (availableBooks != null && !availableBooks.isEmpty()) {
	        for (Book book : availableBooks) {
	            System.out.println(book);
	            System.out.println("--------------------");
	        }
	    } else {
	        System.out.println("현재 대출 가능한 도서가 없습니다.");
	    }
	}

}
