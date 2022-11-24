
package pe.com.sistemamoda.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.sistemamoda.entity.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long>{
    @Query("select e from Empleado e where e.estado='1'")
    List<Empleado> findAllCustom();
}
