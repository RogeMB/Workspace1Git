package ejemploInterfazDos;

public class Guitarra implements IInstrumento {

	
	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("Guitarra.tocar()");
	}

	@Override
	public String tipo() {
		// TODO Auto-generated method stub
		return "Guitarra";
	}

	@Override
	public void afinar() {
		// TODO Auto-generated method stub
		
	}

}
