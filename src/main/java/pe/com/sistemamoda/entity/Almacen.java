
package pe.com.sistemamoda.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="Almacen")
@Table(name="t_almacen")
public class Almacen implements Serializable{
    private static final long serialVersionUID=1L;
    
    
    @Id
    @Column(name="idalmacen")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name="stock")
    private double stock;
    @Column(name="g_entrada")
    private String g_entrada;
    @Column(name="g_salida")
    private String g_salida;
    @Column(name="estado")
    private boolean estado;
    
    @ManyToOne
    @JoinColumn(name="idventa", nullable=false)
    private Venta venta;
    
    
    @ManyToOne
    @JoinColumn(name="idprenda", nullable=false)
    private Prenda prenda;
}
