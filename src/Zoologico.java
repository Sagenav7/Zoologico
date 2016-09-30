/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lds
 */
public class Zoologico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Gato g = new Gato();
        g.roam();
        g.Molesta();
        g.Esamigable();
        
        Perro p = new Perro();
        p.Esamigable();
        p.Molesta();
       
    }
    
}
