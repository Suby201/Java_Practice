package lab.music.entity;

public class MP3 extends DigitalMedia implements Playable{
	private int fileSize;
	private int volume=5;

	public MP3(String title, String artist, int fileSize ) {
		super(title, artist,"MP3");
		this.fileSize=fileSize;
		// TODO Auto-generated constructor stub
	}
	
	public MP3(String title) {
		super(title,"Unknown artist","MP3");
	}
	
	@Override
	public void play() {
		super.play();
		System.out.println("현재 볼륨: "+volume);
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("파일 크기: "+fileSize+"MB");
	}
	public void setVolume(int level) {
		System.out.println("볼륨이 "+level+"로 설정되었습니다.");
	}
	
	public void stop() {
		System.out.println("MP3 재생이 중지되었습니다.");
	}

}
