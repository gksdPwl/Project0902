class Animal {
	String name;

	void setName(String name) {
		this.name = name;
	}
}

class dog extends Animal {
	void sleep() { //�������̵� ������ �Ȱ��� 
		System.out.println(this.name+" zzz");
	}
}

class HouseDog extends Dog{
	
}

public class �������̵� {

	public static void main(String[] args) {
		HouseDog houseDog = new HouseDog();
		houseDog.setName("happy");
		houseDog.sleep(); 
		

	}

}
