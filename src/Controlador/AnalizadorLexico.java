/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.FlujoCaracteres;
import Modelo.Lexema;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manuel Alejandro
 */
public class AnalizadorLexico {

    List<Lexema> listLexema = new ArrayList<>();
    Lexema lexe;
    public static FlujoCaracteres flujo;

    public List<Lexema> getListLexema() {
        return listLexema;
    }

    public void setListLexema(List<Lexema> listLexema) {
        this.listLexema = listLexema;
    }

    public void analizar(FlujoCaracteres flu) {
        flujo = flu;

        while (flujo.getPosActual() < flujo.getCaracteres().length) {
            Analizador_bit();
            Analizador_archivo();
            Analizador_neg();
            Analizador_suma();
            Analizador_JSONArreglo();
            Analizador_agregar();
            Analizador_captura();
            Analizador_diferente();
            Analizador_distinto();
            Analizador_div();
            Analizador_igualque();
            Analizador_listMapa();
            Analizador_mayorigual();
            Analizador_mayor();
            Analizador_menor();
            Analizador_menorigual();
            Analizador_multi();
            Analizador_nulo();
            Analizador_nuevo();
            Analizador_o();
            Analizador_resta();
            Analizador_y();
            Analizador_salto();
            
            

        }

    }

    public void Analizador_bit() {
        Analizador_bit not = new Analizador_bit();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_archivo() {
        Analizador_archivo not = new Analizador_archivo();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_neg() {
        Analizador_neg not = new Analizador_neg();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_suma() {
        Analizador_suma not = new Analizador_suma();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_nuevo() {
        Analizador_nuevo not = new Analizador_nuevo();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_nulo() {
        Analizador_nulo not = new Analizador_nulo();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_o() {
        Analizador_o not = new Analizador_o();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_y() {
        Analizador_y not = new Analizador_y();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_JSONArreglo() {
        Analizador_JSONArreglo not = new Analizador_JSONArreglo();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_igualque() {
        Analizador_igualque not = new Analizador_igualque();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_captura() {
        Analizador_captura not = new Analizador_captura();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_listMapa() {
        Analizador_listMapa not = new Analizador_listMapa();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_menor() {
        Analizador_menor not = new Analizador_menor();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_mayor() {
        Analizador_mayor not = new Analizador_mayor();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_menorigual() {
        Analizador_menorigual not = new Analizador_menorigual();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

    public void Analizador_mayorigual() {
        Analizador_mayorigual not = new Analizador_mayorigual();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }
    
     public void Analizador_modulo() {
        Analizador_modulo not = new Analizador_modulo();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }
      public void Analizador_div() {
        Analizador_div not = new Analizador_div();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }
       public void Analizador_multi() {
        Analizador_multi not = new Analizador_multi();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }
        public void Analizador_resta() {
        Analizador_resta not = new Analizador_resta();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }
        public void Analizador_salto() {
        Analizador_salto not = new Analizador_salto();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }
         public void Analizador_diferente() {
        Analizador_diferente not = new Analizador_diferente();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }
    
          public void Analizador_distinto() {
        Analizador_distinto not = new Analizador_distinto();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }
            public void Analizador_retorno() {
        Analizador_retorno not = new Analizador_retorno();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }
            public void Analizador_agregar() {
        Analizador_agregar not = new Analizador_agregar();
        lexe = not.inicio(flujo);
        if (lexe != null) {
            listLexema.add(lexe);
        }
    }

}
