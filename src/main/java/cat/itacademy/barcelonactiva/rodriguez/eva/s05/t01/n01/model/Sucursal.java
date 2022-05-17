package cat.itacademy.barcelonactiva.rodriguez.eva.s05.t01.n01.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "sucursal")
public class Sucursal {
    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Getter @Setter
    @Column (name = "nombre_sucursal")
    private String nombreSucursal;

    @Getter @Setter
    @Column (name = "pais_sucursal")
    private String paisSucursal;

    @Getter @Setter
    @Column (name = "tipo_sucursal")
    private String tipoSucursal;

    public Sucursal (){

    }
    public Sucursal(String nombre, String pais,String tipoSucursal ){
        this.nombreSucursal = nombre;
        this.paisSucursal = pais;
        this.tipoSucursal = tipoSucursal;
    }

}
