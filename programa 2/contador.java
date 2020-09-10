/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentes;
import jade.core.behaviours.Behaviour;

/**
 *
 * @author tania Virginia Espinoza Castellanos
 */
public class contador extends Behaviour
{
    int contador = 0; //se inicia el contador en 0
    public void action()
    {
        contador ++; /*contador incrementa*/
        System.out.println(contador ); //imprimimos el contador
    }
   
    public boolean done()
    {
        return contador > 99;   //el agente se va estar regresando hasta que llegue al 100
    }
    
}
