package es.fpdual.testing.mapper;

import org.apache.ibatis.annotations.*;

import es.fpdual.testing.modelo.Documento;

public interface MiMapper {

    int getNumeroElementos();

	int insertarDocumento(Documento documento);

	Documento obtenerDocumento(@Param("id") int id); //busca el parámetro en MiMapper.xml

	int borrarDocumento(@Param("id") int id);
	
	int actualizarDocumento(@Param("documento") Documento documento);

}
