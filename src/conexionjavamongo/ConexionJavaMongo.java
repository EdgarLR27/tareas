/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionjavamongo;

/**
 *
 * @author yair1
 */
public class ConexionJavaMongo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion conec = new Conexion();
        //conec.insertar("Comer");
        //conec.Mostrar();
        //conec.Actualizar("brincar", "bailar");
        conec.Mostrar();
        conec.Eliminar("Comer");
        conec.Mostrar();
    }
    
}
