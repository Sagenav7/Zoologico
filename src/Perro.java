/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lds
 */
public class Perro extends Canino implements Mascota {
    @Override
    public void roam(){
        System.out.println("El perro esta hambriento");
        
    }   
    @Override
    public void Esamigable(){
        System.out.println("el perro es amigable ");
        
    }
    @Override
    public void Molesta(){
        System.out.println("el perro ladra ");
        
    }
}
