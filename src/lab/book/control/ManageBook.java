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

		Publication pub1 = new Magazine("����ũ�μ���Ʈ", "2007-10-01", 328, 9900, "�ſ�");
		Publication pub2 = new Magazine("�濵����ǻ��", "2007-10-03", 316, 9000, "�ſ�");
		Publication pub3 = new Novel("���߿�", "2007-07-01", 396, 9800, "����������������", "����Ҽ�");
		Publication pub4 = new Novel("���ѻ꼺", "2007-04-14", 383, 11000, "����", "���ϼҼ�");
		Publication pub5 = new ReferenceBook("�ǿ��������α׷���", "2007-01-14", 496, 25000, "����Ʈ�������");
		Publication pub6 = new Novel("�ҳ��̿´�", "2014-05-01", 216, 15000, "�Ѱ�", "����Ҽ�");
		Publication pub7 = new Novel("�ۺ������ʴ´�", "2021-09-09", 332, 15120, "�Ѱ�", "����Ҽ�");
		shoppingCart.addItem(pub1);
		shoppingCart.addItem(pub2);
		shoppingCart.addItem(pub3);
		shoppingCart.addItem(pub4);
		shoppingCart.addItem(pub5);
		shoppingCart.addItem(pub6);
		shoppingCart.addItem(pub7);

		shoppingCart.displayCart();
		shoppingCart.removeItem("���߿�");
		shoppingCart.displayCart();

		StatisticsAnalyzer analyzer = new StatisticsAnalyzer();
		List<Publication> items = shoppingCart.getItems(); // ShoppingCart�� ������ ����Ʈ�� ������
		Publication[] pubs = items.toArray(new Publication[0]); // ����Ʈ�� �迭�� ��ȯ
		analyzer.printStatics(pubs); // ��ȯ�� �迭�� ����
		System.out.println(pubs[2].getTitle() + " ���� ���� ����");
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