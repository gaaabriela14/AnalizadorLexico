/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.FlujoCaracteres;
import Modelo.Lexema;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Manuel Alejandro
 */
public class AnalizadorTest {
    


   
    /**
     * Test of analizar method, of class Analizador.
     */
    @Test
    public void testAnalizar() {
        Analizador_bit instance = new Analizador_bit();
        char[] caracteres = "bit".toCharArray();
        Lexema flu = instance.inicio(new FlujoCaracteres(0, caracteres));
        int esperado= 3;
        int total ;
        if(flu != null){
            total =1;
        }else{
            total=0;
        }
        assertEquals(esperado,total);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of Analizador_bit method, of class Analizador.
     */
//    @Test
//    public void testAnalizador_bit() {
//        System.out.println("Analizador_bit");
//        Analizador instance = new Analizador();
//        instance.Analizador_bit();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
