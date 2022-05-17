package cat.itacademy.barcelonactiva.rodriguez.eva.s05.t01.n01.DTO;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.*;
import java.util.List;


public class SucursalDTO {

    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter @Setter
    private String nombreSucursal;

    @Getter @Setter
    private String paisSucursal;

    @Getter @Setter
    private String tipoSucursal;

    final List<String> paisesUE = Arrays.asList("alemania", "austria", "belgica", "bulgaria","chipre", "croacia","dinamarca","eslovenia",
            "españa", "estonia","finlandia", "francia", "grecia", "hungria","irlanda","italia", "letonia", "lituania",
            "luxebmurg", "malta","paises bajos","polonia","portugal", "republica checa", "republica eslovaca", "rumania", "suecia");


    public SucursalDTO (){

    }
    public SucursalDTO(String nombre, String pais){
        nombreSucursal = nombre;
        paisSucursal = pais;
        tipoSucursal = verificacionUE(pais);
    }



    //metode que retorna un string indicant si els paisos estan dins o fora la UE
    public String verificacionUE (String pais){
        int size = paisesUE.size();
        for (int i =0; i<size;i++){
            if(pais.equalsIgnoreCase(paisesUE.get(i))){
                return "UE";
            }
        }
    return "fueraUE";
    }


}
