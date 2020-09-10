/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentes;
import jade.core.Agent;
/**
 *
 * @author tania Virginia Espinoza Castellanos
 */
public class class2 extends Agent /*Clase agente solo se manda a llamar la clase comportamiento*/
{
    protected void setup()
    {
        contador agnt =new contador();
        addBehaviour(agnt);
    }
}
