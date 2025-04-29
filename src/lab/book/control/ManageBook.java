package lab.book.control;

import lab.book.entity.Magazine;
import lab.book.entity.Novel;
import lab.book.entity.Publication;
import lab.book.entity.ReferenceBook;
import lab.book.control.StatisticsAnalyzer;
import java.util.List;

public class ManageBook {

	public static void main(String[] args) {
		ShoppingCart shoppingCart = new ShoppingCart();

		Publication pub1 = new Magazine("마이크로소프트", "2007-10-01", 328, 9900, "매월");
		Publication pub2 = new Magazine("경영과컴퓨터", "2007-10-03", 316, 9000, "매월");
		Publication pub3 = new Novel("빠삐용", "2007-07-01", 396, 9800, "베르나르베르베르", "현대소설");
		Publication pub4 = new Novel("남한산성", "2007-04-14", 383, 11000, "김훈", "대하소설");
		Publication pub5 = new ReferenceBook("실용주의프로그래머", "2007-01-14", 496, 25000, "소프트웨어공학");
		Publication pub6 = new Novel("소년이온다", "2014-05-01", 216, 15000, "한강", "장편소설");
		Publication pub7 = new Novel("작별하지않는다", "2021-09-09", 332, 15120, "한강", "장편소설");
		shoppingCart.addItem(pub1);
		shoppingCart.addItem(pub2);
		shoppingCart.addItem(pub3);
		shoppingCart.addItem(pub4);
		shoppingCart.addItem(pub5);
		shoppingCart.addItem(pub6);
		shoppingCart.addItem(pub7);

		shoppingCart.displayCart();
		shoppingCart.removeItem("빠삐용");
		shoppingCart.displayCart();

		StatisticsAnalyzer analyzer = new StatisticsAnalyzer();
		List<Publication> items = shoppingCart.getItems(); // ShoppingCart의 아이템 리스트를 가져옴
		Publication[] pubs = items.toArray(new Publication[0]); // 리스트를 배열로 변환
		analyzer.printStatics(pubs); // 변환된 배열을 전달
		System.out.println(pubs[2].getTitle() + " 도서 가격 변경");
		modifyPrice(pubs[2]);
		shoppingCart.removeItem(pubs[2].getTitle());
		shoppingCart.addItem(pubs[2]);
		shoppingCart.displayCart();
	}

	private static void modifyPrice(Publication pub) {
		if (pub instanceof Novel) {
			pub.setPrice((int) (pub.getPrice() * 0.8));
		} else if (pub instanceof ReferenceBook) {
			pub.setPrice((int) (pub.getPrice() * 0.9));
		} else if (pub instanceof Magazine) {
			pub.setPrice((int) (pub.getPrice() * 0.6));
		}
	}
}