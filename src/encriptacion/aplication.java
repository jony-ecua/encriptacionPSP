/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptacion;

/**
 *
 * @author HERMANOS
 */
public class aplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Seguridad.md5("ECUADOR"));
         System.out.println(Seguridad.sha1("ECUADOR"));
    }
    
}
