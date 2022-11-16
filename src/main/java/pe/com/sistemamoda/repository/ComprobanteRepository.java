
package pe.com.sistemamoda.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.sistemamoda.entity.Comprobante;



public interface ComprobanteRepository extends JpaRepository<Comprobante, Long>{
    @Query("select c from Comprobante c where c.estado='1'")
    List<Comprobante> findAllCustom();
}
