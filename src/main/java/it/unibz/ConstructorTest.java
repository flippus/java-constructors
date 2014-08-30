package it.unibz;

public class ConstructorTest {

	static {
		System.out.println("static");
	}

	{
		System.out.println("anonymous");
	}

	public ConstructorTest() {
		System.out.println("normal");
	}

	public ConstructorTest(int i) {
		System.out.println(i);
	}

}
