package lab.music.control;

import lab.music.entity.MP3;
import lab.music.entity.MusicMedia;
import lab.music.entity.Vinyl;

public class MusicPlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===== ���� ��� �ý��� �׽�Ʈ =====");
		
		testMP3();
		testVinyl();
		MusicMedia mp3 = new MP3("Butter", "BTS", 4);
		testPolymorphism(mp3);
		testCasting(mp3);
	}

	private static void testCasting(MusicMedia mp3) {
		System.out.println("--- ĳ���� �׽�Ʈ ---");
		MP3 mp4 = (MP3) mp3;
		mp4.setVolume(3);
		mp4.play();
		mp4.setVolume(7);
		mp4.stop();
	}

	private static void testPolymorphism(MusicMedia mp3) {
		System.out.println("--- ������ �׽�Ʈ ---");
		mp3.displayInfo();
		mp3.play();
	}

	private static void testVinyl() {
		System.out.println("--- Vinyl �׽�Ʈ ---");
		Vinyl vinyl = new Vinyl("Yesterday", "The Beatles", 33);
		vinyl.displayInfo();
		vinyl.play();
		vinyl.clean();
	}

	private static void testMP3() {
		System.out.println("--- MP3 �׽�Ʈ ---");
		MP3 mp3 = new MP3("Dynamite", "BTS", 5);
		mp3.displayInfo();
		mp3.play();
		mp3.setVolume(8);
		mp3.stop();
	}

}
