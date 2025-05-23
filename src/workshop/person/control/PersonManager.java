package workshop.person.control;
import workshop.person.entity.PersonEntity;

public class PersonManager {
	
	public static void main(String[] args) {
		PersonManager pManager = new PersonManager();
		PersonEntity[] persons = new PersonEntity[10];
		pManager.fillPersons(persons);
		
		pManager.showPersons(persons);
		System.out.println("여성은 " + pManager.findbyGender(persons, '여')+"명입니다.");
		System.out.println("남성은 " + pManager.findbyGender(persons, '남')+"명입니다.");
		
		pManager.showPerson(persons, "김하늘");
	}

	private void fillPersons(PersonEntity[] persons) {
		persons[0] = new PersonEntity("이성호","7212121028102", "인천 계양구", "032-392-2932");
		persons[1] = new PersonEntity("김하늘","7302132363217", "서울 강동구", "02-362-1932");
		persons[2] = new PersonEntity("박영수","7503111233201", "서울 성북구", "02-887-1542");
		persons[3] = new PersonEntity("나인수","7312041038988", "대전 유성구", "032-384-2223");
		persons[4] = new PersonEntity("홍정수","7606221021341", "서울 양천구", "02-158-7333");
		persons[5] = new PersonEntity("이미숙","7502142021321", "서울 강서구", "02-323-1934");
		persons[6] = new PersonEntity("박성구","7402061023101", "서울 종로구", "02-308-0932");
		persons[7] = new PersonEntity("유성미","7103282025101", "서울 은평구", "02-452-0939");
		persons[8] = new PersonEntity("황재현","7806231031101", "인천 중구", "032-327-2202");
		persons[9] = new PersonEntity("최철수","7601211025101", "인천 계양구", "032-122-7832");
	}
	public PersonManager() {
		
	}
	public void showPersons(PersonEntity[] persons) {
		System.out.println("@@@ 인물 정보 조회 시스템 @@@");
		System.out.println("==============================================");
		for (PersonEntity person : persons) {
			System.out.println("[이름] " + person.getName() + "\t[성별] " + person.getGender() + "\t [전화번호] " + person.getPhone());
		}
	}
	public int findbyGender(PersonEntity[] persons, char gender) {
		int count=0;
		for (PersonEntity person : persons)
			if (person.getGender() == gender) {
				count+=1;
			}
		return count;
	}
	public void showPerson(PersonEntity[] persons, String name) {
		for (PersonEntity person : persons) {
			if (person.getName().equals(name)) {
				System.out.println("[이름] " + person.getName() + "\t[성별] " + person.getGender() + "\t [전화번호] " + person.getPhone() +"\t [주소] "+person.getAddress());
				break;
			}
		}
	}
	public void printTitle(String title) {
		
	}
	public void printTitleLine() {
		
	}
	public void printItemLine() {
		
	}
}
