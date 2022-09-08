class Animal {
	String name;

	void setName(String name) {
		this.name = name;
	}
}

class dog extends Animal {
	void sleep() { //오버라이딩 재정의 똑같이 
		System.out.println(this.name+" zzz");
	}
}

class HouseDog extends Dog{
	
}

public class 오버라이딩 {

	public static void main(String[] args) {
		HouseDog houseDog = new HouseDog();
		houseDog.setName("happy");
		houseDog.sleep(); 
		

	}

}
