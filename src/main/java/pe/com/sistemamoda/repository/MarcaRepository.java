
package pe.com.sistemamoda.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.sistemamoda.entity.Marca;


public interface MarcaRepository extends JpaRepository<Marca, Long>{
    @Query("select m from Marca m where m.estado='1'")
    List<Marca> findAllCustom();
}
