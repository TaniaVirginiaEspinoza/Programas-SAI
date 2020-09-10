/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentes;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;

/**
 *
 * @author tania Virginia Espinoza Castellanos
 */
public class agente extends Behaviour /*Clase comportamiento donde se dice al agente que debe hacer*/
{
    public void action() 
    {
        Agent nombre=this.getAgent();
        nombre.getAID();
        System.out.println("hola Mundo 3 " + nombre.getName());
    }

    public boolean done()
    {
        return true;
    }
}

