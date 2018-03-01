
public class Transferencia {
	int ID;
	Bancos origen;
	Bancos destino;
	int monto;
	
	public Transferencia(int id,Bancos ori,Bancos desti,int mont) {
		this.ID = id;
		this.origen = ori;
		this.destino = desti;
		this.monto = mont;
	}
	
	public void Transferir(Bancos origen,Bancos destino,int monto) {
		origen.prot.Enviar(this);
	}
}
