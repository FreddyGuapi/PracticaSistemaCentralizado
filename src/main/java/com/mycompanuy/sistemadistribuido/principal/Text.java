
package com.mycompanuy.sistemadistribuido.principal;

import com.mycompany.sistemadistribuido.Producto;
import com.mycompany.sistemadistribuido.controladores.ProductoJpaController;
import java.math.BigDecimal;
import java.sql.ResultSet;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Text {

   
    public static void main(String[] args) throws Exception {
        
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("practicabdd");
    
        ProductoJpaController pjc = new ProductoJpaController(emf);
        
        
        
        Producto p = new Producto();
        
/*
        //Insertar nueva información
        
        p.setNombre("Vino");
        
        Double dl = 10.35;
        
        BigDecimal bdl =BigDecimal.valueOf(dl.doubleValue());
        
        p.setPrecio(bdl);
    
        pjc.create(p);

 */
/*

//Actualizar información
    p.setCodigo(1);
       p.setNombre("leche");
        
        Double dl = 10.35;
        
        BigDecimal bdl =BigDecimal.valueOf(dl.doubleValue());
        
        p.setPrecio(bdl);
        
        pjc.edit(p);
        System.out.println("Se actualizo la información");
 
*/

/*
        //Eliminar todos los datos
        pjc.destroy(3);
        System.out.println("Información eliminada");
        
*/

    // modificar e imprimir la información
    
    p.setCodigo(6);
    p.setNombre("leche");
        
        Double dl = 10.20;
        
        BigDecimal bdl =BigDecimal.valueOf(dl.doubleValue());
        
        p.setPrecio(bdl);
        
        pjc.edit(p);
    String Producto;
        Producto = p.getCodigo( ) + " " + p.getNombre()+" "+p.getPrecio();
        System.out.println(Producto);
}
    
    
}
