package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    //@Query(value="SELECT * FROM PRODUCTOS WHERE ID_CATEGORIA= ?", nativeQuery = true)
    List<Producto> findByIdCategoriaOrderByNombreAsc(Integer idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(Integer cantidadStock, boolean estado);
}
