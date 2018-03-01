
public class OTP implements Protocolos{
	@Override
	public void Enviar(Transferencia trans) {
		System.out.println("Enviando Transferencia "+ trans.ID + " a banco destino");
	}
}
