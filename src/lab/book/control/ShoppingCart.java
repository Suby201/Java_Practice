// ShoppingCart.java
package lab.book.control;

import java.util.ArrayList;
import java.util.List;

import lab.book.entity.Magazine;
import lab.book.entity.Novel;
import lab.book.entity.Publication;
import lab.book.entity.ReferenceBook;

public class ShoppingCart {
	private List<Publication> items = new ArrayList<>();

	public ShoppingCart() {
	}

	public void addItem(Publication item) {
		items.add(item);
	}

	public boolean removeItem(String title) {
		Publication pub = null; // ã�� Publication ��ü�� ������ ����
		for (Publication publication : items) {
			if (publication.getTitle().equals(title)) { // String �񱳴� == ��� equals() ���
				pub = publication;
				break; // ã������ ���� ����
			}
		}
		if (pub != null) {
			items.remove(pub);
			System.out.println("å " + title + " ���� �Ϸ�");
			return true;
		}
		return false;
	}

	public int calculateTotalPrice() {
		int tPrice = 0;
		for (Publication publication : items) {
			tPrice = tPrice + publication.getPrice();
		}
		return tPrice;
	}

	public int calculateDiscountedPrice() {
		int tPrice = 0;
		for (Publication publication : items) {
			if (publication instanceof Novel) {
				tPrice = (int) (tPrice + (publication.getPrice() * 0.85));
			} else if (publication instanceof Magazine) {
				tPrice = (int) (tPrice + (publication.getPrice() * 0.9));
			} else if (publication instanceof ReferenceBook) {
				tPrice = (int) (tPrice + (publication.getPrice() * 0.8));
			} else {
				tPrice = tPrice + publication.getPrice();
			}
		}
		return tPrice;
	}

	public void displayCart() {
		int i=1;
		for (Publication publication : items) {
			System.out.print(i+". "); i++;
			System.out.println(publication.toString());
		}
		System.out.println("�� ����: " + calculateTotalPrice() + ", ���� ����: " + calculateDiscountedPrice());
	}

	public void printStatics() {
		int nCount = 0, rCount = 0, mCount = 0, pCount = 0;
		System.out.println("���");
		for (Publication publication : items) {
			if (publication instanceof Novel) {
				nCount++;
			} else if (publication instanceof Magazine) {
				mCount++;
			} else if (publication instanceof ReferenceBook) {
				rCount++;
			} else {
				pCount++;
			}
		}
		System.out.println("�Ҽ�: " + nCount + "��, ����: " + mCount + "��, ����: " + rCount + "��, ��Ÿ: " + pCount + "��");
	}

	// �߰��� �޼���
	public List<Publication> getItems() {
		return items;
	}
}