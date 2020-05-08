package es.fpdual.testing.modelo;

public class Documento {
	
	private final int id;
	private final int tipo;
	private final String descripcion;
	
	public Documento(int id, int tipo, String descripcion) {
		
		this.id = id;
		this.tipo = tipo;
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}

	public int getTipo() {
		return tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public String toString() {
		return "Documento [id=" + id + ", tipo=" + tipo + ", descripcion=" + descripcion + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + id;
		result = prime * result + tipo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Documento other = (Documento) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (id != other.id)
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}
	
	
	
	

}
