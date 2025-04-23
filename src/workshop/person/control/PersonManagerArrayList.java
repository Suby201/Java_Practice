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
		System.out.println("������ " + pManager.findbyGender(personList, '��')+"���Դϴ�.");
		System.out.println("������ " + pManager.findbyGender(personList, '��')+"���Դϴ�.");
		
		pManager.showPerson(personList, "���ϴ�");
	}

	private void fillPersons(List<PersonEntity> persons) {
		persons.add(new PersonEntity("�̼�ȣ","7212121028102", "��õ ��籸", "032-392-2932"));
		persons.add(new PersonEntity("���ϴ�","7302132363217", "���� ������", "02-362-1932"));
		persons.add(new PersonEntity("�ڿ���","7503111233201", "���� ���ϱ�", "02-887-1542"));
		persons.add(new PersonEntity("���μ�","7312041038988", "���� ������", "032-384-2223"));
		persons.add(new PersonEntity("ȫ����","7606221021341", "���� ��õ��", "02-158-7333"));
		persons.add(new PersonEntity("�̹̼�","7502142021321", "���� ������", "02-323-1934"));
		persons.add(new PersonEntity("�ڼ���","7402061023101", "���� ���α�", "02-308-0932"));
		persons.add(new PersonEntity("������","7103282025101", "���� ����", "02-452-0939"));
		persons.add(new PersonEntity("Ȳ����","7806231031101", "��õ �߱�", "032-327-2202"));
		persons.add(new PersonEntity("��ö��","7601211025101", "��õ ��籸", "032-122-7832"));
	}   
	public PersonManagerArrayList() {
		
	}
	public void showPersons(List<PersonEntity> persons) {
		for (PersonEntity person : persons) {
			System.out.println("[�̸�] " + person.getName() + "\t[����] " + person.getGender() + "\t [��ȭ��ȣ] " + person.getPhone());
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
				System.out.println("[�̸�] " + person.getName() + "\t[����] " + person.getGender() + "\t [��ȭ��ȣ] " + person.getPhone() +"\t [�ּ�] "+person.getAddress());
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
