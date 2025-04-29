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
		System.out.println("바이닐레코드 "+super.title+"이 "+rpm+"으로 재생됩니다.");
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("회전속도: "+rpm+"rpm");
	}
	
	public void clean() {
		System.out.println("바이닐 레코드를 청소합니다.");
	}

}
