package new_18;


interface k{
	default void m1() {
		System.out.println("Df...m1...i");
	}
	static void m2() {
		System.out.println("st....m2..i");
	}
}
interface O{
	default void m3() {
		System.out.println("df...m3...j");
	}
	static void m4() {
		System.out.println("st..m4..j");
	}
}
public class StDfi implements k,O{
	public static void main(String[] args) {
		k i1=new StDfi();
		i1.m1();
		k.m2();
		
		O j1=new StDfi();
		j1.m3();
		O.m4();
	}
}
