package lab.music.entity;

public class Vinyl extends MusicMedia {
	private int rpm;
	public Vinyl(String title, String artist, int rpm) {
		super(title, artist);
		this.rpm=rpm;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void play() {
		System.out.println("���̴ҷ��ڵ� "+super.title+"�� "+rpm+"���� ����˴ϴ�.");
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("ȸ���ӵ�: "+rpm+"rpm");
	}
	
	public void clean() {
		System.out.println("���̴� ���ڵ带 û���մϴ�.");
	}

}
