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
		Publication pub = null; // 찾은 Publication 객체를 저장할 변수
		for (Publication publication : items) {
			if (publication.getTitle().equals(title)) { // String 비교는 == 대신 equals() 사용
				pub = publication;
				break; // 찾았으면 루프 종료
			}
		}
		if (pub != null) {
			items.remove(pub);
			System.out.println("책 " + title + " 제거 완료");
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
		System.out.println("총 가격: " + calculateTotalPrice() + ", 할인 가격: " + calculateDiscountedPrice());
	}

	public void printStatics() {
		int nCount = 0, rCount = 0, mCount = 0, pCount = 0;
		System.out.println("통계");
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
		System.out.println("소설: " + nCount + "권, 잡지: " + mCount + "권, 참고서: " + rCount + "권, 기타: " + pCount + "권");
	}

	// 추가된 메서드
	public List<Publication> getItems() {
		return items;
	}
}