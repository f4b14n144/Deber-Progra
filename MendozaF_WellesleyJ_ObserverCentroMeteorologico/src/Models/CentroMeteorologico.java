/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author fabia
 */
public interface CentroMeteorologico 
{
    void registrarSubscriptor(Suscrito sus);
    
    void notificarCambio(float temperatura);
    
}
