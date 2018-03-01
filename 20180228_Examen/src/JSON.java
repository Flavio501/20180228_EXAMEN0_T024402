
public class JSON implements Formato{

	@Override
	public void Parse(Transferencia trans) {
		System.out.println("Parseando Transferencia "+ trans.ID + " a JSON");
	}

}
