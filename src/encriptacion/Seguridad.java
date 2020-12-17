/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptacion;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author HERMANOS e
 */
public class Seguridad {
  /**
     * Aplica SHA al texto pasado por parámetro
     * 
     * @param texto
     */
    public static  String getHash(String txt, String tipo){
        
        try {
            MessageDigest md = MessageDigest.getInstance(tipo);
            byte[] array = md.digest(txt.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; i++) {
                sb.append(Integer.toHexString((array[i] & 0xFF)| 0x100 )
                        .substring(1,3));
                
            }
            System.out.println("Mensaje original: "+txt);
            System.out.println("Número de Bytes: "+array.length);
            System.out.println("Algoritmo usado: "+tipo);           
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
            
            System.out.println("Proveedor: ");
        return null;
                
                
    }
   public static String md5(String txt){
       return Seguridad.getHash(txt, "MD5");
   }
   public static String sha1(String txt){
       return Seguridad.getHash(txt, "SHA1");
   }
}

