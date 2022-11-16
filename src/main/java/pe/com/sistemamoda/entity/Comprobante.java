
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
@Entity(name="Comprobante")
@Table(name="t_comprobante")
public class Comprobante implements Serializable{
     private static final long serialVersionUID=1L;
     
    @Id
    @Column(name="idcomprobante")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name="tipo")
    private String tipo;
    @Column(name="numero")
    private long numero;
    @Column(name="estado")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name="idusuario", nullable=false)
    private Usuario usuario;
}
