package programaciondmi.dca.core;

import java.util.UUID;

public abstract class EspecieAbstracta implements Runnable{ // TODO verificar si se quiere interfaz o clase...
	
	protected UUID id;
	protected int x;
	protected int y;
	public final int NORMAL = 0;
	public final int ENVENENADO = 1;
	public final int ENFERMO = 2;
	public final int EXTASIS = 3;
	public final int MUERTO = 4;
	protected int estado;
	 
	public EspecieAbstracta() {
		id = UUID.randomUUID();
		estado = NORMAL;
	}
	
	public int getEstado() {
		return estado;
	}
	
	public void setEstado(int estado) throws Exception {
		if(estado == NORMAL || estado == ENFERMO || estado == ENVENENADO || estado == EXTASIS|| estado == MUERTO ){
			this.estado = estado;
		}else{
			System.err.println("Estado no valido... use: NORMAL, ENVENENADO, ENFERMO, MUERTO, EXTASIS");		
			throw new Exception("Ese estado no es valido"); // TODO crear excepcion propia
		}		
	}
	
	public abstract void dibujar();
	public abstract void mover();

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
