package ejemploInterfazDos;

public class Piano implements IInstrumento {

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("Piano.tocar()");
	}

	@Override
	public String tipo() {
		// TODO Auto-generated method stub
		return "Piano";
	}

	@Override
	public void afinar() {
		// TODO Auto-generated method stub
		
	}

}
