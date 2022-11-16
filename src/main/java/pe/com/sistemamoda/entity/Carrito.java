
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
@Entity(name="Carrito")
@Table(name="t_carrito")
public class Carrito implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name="idcarrito")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo; 
    @Column(name="cantidad")
    private double cantidad;   
    @Column(name="total")
    private double total;    
    @Column(name="estado")
    private boolean estado;
    
    @ManyToOne
    @JoinColumn(name="idprenda", nullable=false)
    private Prenda prenda;
}
