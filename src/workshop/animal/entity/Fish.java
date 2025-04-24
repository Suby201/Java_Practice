package workshop.animal.entity;

public class Fish extends Animal implements Pet {
	private String name;
	public Fish() {
		super(0);
		// TODO Auto-generated constructor stub
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
		System.out.println("물고기는 헤엄치고 놀아요!");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("물고기는 해초를 먹어요.");
	}
	public void walk() {
		System.out.println("물고기는 다리가 없어요ㅋ");
	}
}
