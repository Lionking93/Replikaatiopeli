/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohha.replikaatiopeli.grafiikka;

import javax.swing.JFrame;

/**
 * Rajapinta, joka tekee pelin häviämis- ja voittamisikkunoiden antamisesta
 * parametreinä joustavampaa. Helpottaa näiden ikkunoiden sulkemista ja uuden pelin aloittamista.
 * 
 * @author Leo Kallonen leo.kallonen@gmail.com
 * @version 1.1
 * @since  2014-02-13
 */
public interface Ikkuna {
    JFrame getFrame();
}
