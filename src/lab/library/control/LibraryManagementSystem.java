package lab.library.control;
import java.util.List;

import lab.library.entity.Book;
import lab.library.entity.Library;

public class LibraryManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib = new Library("�߾ӵ�����");
		
		addSampleBooks(lib);
		System.out.println("===== �߾ӵ����� =====");
		printLibrary(lib);
		testFindBook(lib);
		testCheckOut(lib);
		System.out.println("������ ���� ����: ");
		printLibrary(lib);
		testReturn(lib);
		System.out.println("������ ���� ����: ");
		printLibrary(lib);
		displayAvailableBooks(lib);
		
	}
	private static void printLibrary(Library lib) {
		System.out.println("��ü ���� ��: "+lib.getTotalBooks());
		System.out.println("���� ���� ���� ��: "+lib.getAvailableBooksCount());
		System.out.println("���� ���� ���� ��: "+lib.getBorrowedBooksCount());
	}
	private static void addSampleBooks(Library library) {
		library.addBook(new Book("�ڹ� ���α׷���", "���ڹ�", "978-89-01-12345-6", 2022));
		library.addBook(new Book("��ü������ ��ǰ� ����", "����ȣ", "978-89-01-67890-1", 2015));
		library.addBook(new Book("Clean Code", "Robert C. Martin", "978-0-13-235088-4", 2008));
		library.addBook(new Book("Effective Java", "Joshua Bloch", "978-0-13-468599-1", 2018));
		library.addBook(new Book("Head First Java", "Kathy Sierra", "978-0-596-00920-5", 2005));
		library.addBook(new Book("�ڹ��� ����", "���ü�", "978-89-01-14077-4", 2019));
	}

	private static void testFindBook(Library library) {
		System.out.println("=====���� �˻� �׽�Ʈ=====");
		System.out.println("�������� �˻� ���:");
		System.out.println(library.findBookByTitle("�ڹ��� ����"));
		System.out.println("���ڷ� �˻� ���:");
		System.out.println(library.findBookByAuthor("Robert C. Martin"));
	}
	private static void testCheckOut(Library library) {
		System.out.println("=====���� ���� �׽�Ʈ=====");
		if(library.checkOutBook("978-89-01-14077-4")) {
			System.out.println("���� ���� ����!");
			System.out.println("����� ���� ����:");
			System.out.println(library.findBookByISBN("978-89-01-14077-4"));
		}
	}
	private static void testReturn(Library library) {
		System.out.println("=====���� �ݳ� �׽�Ʈ=====");
		if(library.returnBook("978-89-01-14077-4")) {
			System.out.println("���� �ݳ� ����!");
			System.out.println("�ݳ��� ���� ����:");
			System.out.println(library.findBookByISBN("978-89-01-14077-4"));
		}
	}
	private static void displayAvailableBooks(Library library) {
		System.out.println("===== ���� ������ ���� ��� =====");
		List<Book> availableBooks = library.getAvailableBooks();
	    if (availableBooks != null && !availableBooks.isEmpty()) {
	        for (Book book : availableBooks) {
	            System.out.println(book);
	            System.out.println("--------------------");
	        }
	    } else {
	        System.out.println("���� ���� ������ ������ �����ϴ�.");
	    }
	}

}
