
package pe.com.sistemamoda.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.sistemamoda.entity.DetalleVenta;



public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Long>{
    @Query("select dv from DetalleVenta dv where dv.estado='1'")
    List<DetalleVenta> findAllCustom();
}
