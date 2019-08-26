
public class Chaningmainclass {

	public static void main(String[] args) {
		Constructorchaining[] object=new Constructorchaining[2];
		for(Constructorchaining obj :object) {
			//returns null values
			System.out.print(obj);
		}
		object[0]=new Constructorchaining("Manikanta", "Rahul");
		object[1]=new Constructorchaining("ManikantaRahul", "Nelluru");

	}

}
