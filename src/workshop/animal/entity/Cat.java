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
		System.out.println("Cat은 Fish를 먹습니다.");
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
		System.out.println("고양이는 혼자 놀아요!");
	}
	
}
