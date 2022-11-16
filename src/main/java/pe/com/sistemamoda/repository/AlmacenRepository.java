
package pe.com.sistemamoda.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.sistemamoda.entity.Almacen;

public interface AlmacenRepository extends JpaRepository<Almacen, Long>{
    @Query("select a from Almacen a where a.estado='1'")
    List<Almacen> findAllCustom();
}
