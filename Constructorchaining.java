
public class Constructorchaining {
	
	Constructorchaining(String input) {
		System.out.println("c1:"+input);
			}
	Constructorchaining(String input1, String input2) {
		this(input1);
		System.out.println(input1+" "+input2);
		
	}
}
