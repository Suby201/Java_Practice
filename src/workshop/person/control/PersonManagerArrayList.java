package workshop.person.control;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import workshop.person.entity.PersonEntity;

public class PersonManagerArrayList {
	
	public static void main(String[] args) {
		List<PersonEntity> personList = new ArrayList<>();
//		ArrayList<PersonEntity> personList2 = new ArrayList<>();
//		List<PersonEntity> personList3 = new LinkedList<>();
		
		PersonManagerArrayList pManager = new PersonManagerArrayList();
//		PersonEntity[] persons = new PersonEntity[10];
		
		pManager.fillPersons(personList);
		
		pManager.showPersons(personList);
		System.out.println("여성은 " + pManager.findbyGender(personList, '여')+"명입니다.");
		System.out.println("남성은 " + pManager.findbyGender(personList, '남')+"명입니다.");
		
		pManager.showPerson(personList, "김하늘");
	}

	private void fillPersons(List<PersonEntity> persons) {
		persons.add(new PersonEntity("이성호","7212121028102", "인천 계양구", "032-392-2932"));
		persons.add(new PersonEntity("김하늘","7302132363217", "서울 강동구", "02-362-1932"));
		persons.add(new PersonEntity("박영수","7503111233201", "서울 성북구", "02-887-1542"));
		persons.add(new PersonEntity("나인수","7312041038988", "대전 유성구", "032-384-2223"));
		persons.add(new PersonEntity("홍정수","7606221021341", "서울 양천구", "02-158-7333"));
		persons.add(new PersonEntity("이미숙","7502142021321", "서울 강서구", "02-323-1934"));
		persons.add(new PersonEntity("박성구","7402061023101", "서울 종로구", "02-308-0932"));
		persons.add(new PersonEntity("유성미","7103282025101", "서울 은평구", "02-452-0939"));
		persons.add(new PersonEntity("황재현","7806231031101", "인천 중구", "032-327-2202"));
		persons.add(new PersonEntity("최철수","7601211025101", "인천 계양구", "032-122-7832"));
	}   
	public PersonManagerArrayList() {
		
	}
	public void showPersons(List<PersonEntity> persons) {
		for (PersonEntity person : persons) {
			System.out.println("[이름] " + person.getName() + "\t[성별] " + person.getGender() + "\t [전화번호] " + person.getPhone());
		}
	}
	public int findbyGender(List<PersonEntity> persons, char gender) {
		int count=0;
		for (PersonEntity person : persons)
			if (person.getGender() == gender) {
				count+=1;
			}
		return count;
	}
	public void showPerson(List<PersonEntity> persons, String name) {
		for (PersonEntity person : persons) {
			if (person.getName().equals(name)) {
				System.out.println("[이름] " + person.getName() + "\t[성별] " + person.getGender() + "\t [전화번호] " + person.getPhone() +"\t [주소] "+person.getAddress());
				break;
			}
		}
	}
	public void printTitle(String title) {
		System.out.println("\n" + title + "\n");
	}
	public void printTitleLine() {
		for i ()
		System.out.println();
	}
	public void printItemLine() {
		
	}
}
