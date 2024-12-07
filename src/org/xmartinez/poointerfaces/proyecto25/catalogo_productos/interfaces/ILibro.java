package org.xmartinez.poointerfaces.proyecto25.catalogo_productos.interfaces;

import java.util.Date;

public interface ILibro {

    Date getFechaPublicacion();
    String getAutor();
    String getTitulo();
    String getEditorial();

}
