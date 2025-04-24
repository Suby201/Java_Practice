package workshop.animal.entity;

public class Cat extends Animal implements Pet{
	private String name;
	
	public Cat(String name) {
		super(4);
		setName(name);
	}
	public Cat() {
		this("");
	}
	@Override
	public void eat() {
		System.out.println("Cat�� Fish�� �Խ��ϴ�.");
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("����̴� ȥ�� ��ƿ�!");
	}
	
}
