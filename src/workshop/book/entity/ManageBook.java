package workshop.book.entity;

public class ManageBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Publication[] pubs = new Publication[5];
		pubs[0] = new Magazine("����ũ�μ���Ʈ","2007-10-01",328,9900,"�ſ�");
		pubs[1] = new Magazine("�濵����ǻ��","2007-10-03",316,9000,"�ſ�");
		pubs[2] = new Novel("���߿�","2007-07-01",396,9800,"����������������","����Ҽ�");
		pubs[3] = new Novel("���ѻ꼺","2007-04-14",383,11000,"����","���ϼҼ�");
		pubs[4] = new ReferenceBook("�ǿ��������α׷���","2007-01-14",496,25000,"����Ʈ�������");
		
		for (Publication pub : pubs) {
			System.out.println(pub);
		}
		
		System.out.println("=====���� ���� ��=====");
		System.out.println(pubs[2].getTitle() +":"+ pubs[2].getPrice()+"��");
		modifyPrice(pubs[2]);
		System.out.println("=====���� ���� ��=====");
		System.out.println(pubs[2].getTitle() +":" + pubs[2].getPrice()+"��");
		
		for (Publication publication : pubs) {
			System.out.print(publication.getTitle() + "�� Ư�� �Ӽ�: ");
			printSubInfo(publication);
		}
		
		Magazine mgz = new Magazine();
		Publication pub = new Magazine();
		
		Novel nvl = new Novel();
		Publication pub2 = new Novel();
		
	}
	//���� Ŭ������ �ܵ� ���� ���
	public static void printSubInfo(Publication pub) {
		if (pub instanceof Magazine) {
			Magazine m = (Magazine) pub;
			System.out.println(m.getPublishingPeriod());
		}else if (pub instanceof Novel) {
			Novel n = (Novel) pub;
			System.out.println(n.getAuthor()+ " " + n.getGenre());
		}else if(pub instanceof ReferenceBook) {
			ReferenceBook r = (ReferenceBook) pub;
			System.out.println(r.getField());
		}
		
	}
	
	public static void modifyPrice(Publication pub) {
		double rate = 0.0;
		if (pub instanceof Magazine) {
			rate = 0.6;
		} else if(pub instanceof Novel) {
			rate = 0.8;
		} else if (pub instanceof ReferenceBook) {
			rate = 0.9;
		}
		pub.setPrice((int)(pub.getPrice()*rate));
	}
}
