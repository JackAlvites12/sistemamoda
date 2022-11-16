
package pe.com.sistemamoda.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.sistemamoda.entity.Carrito;



public interface CarritoRepository extends JpaRepository<Carrito, Long>{
    @Query("select ca from Carrito ca where ca.estado='1'")
    List<Carrito> findAllCustom();
}
