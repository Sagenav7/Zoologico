/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lds
 */
public class Gato extends Felino implements Mascota {
    @Override
    public void roam(){
        System.out.println("El gato esta comiendo");
                
    }
    @Override
    public void Esamigable() {
        System.out.println("el gato es amigable");
        
    }
    @Override
    public void Molesta(){
        System.out.println("el gato aruña");
        
    }
}
