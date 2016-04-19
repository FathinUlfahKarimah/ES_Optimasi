/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_optimasi;

/**
 *
 * @author UPEFATHIN
 */

public class ES_optimasi {
    FORM_ES es = new FORM_ES();

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FORM_ES().setVisible(true);
            }
        });
    }
}
