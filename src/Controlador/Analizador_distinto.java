/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.FlujoCaracteres;
import Modelo.Lexema;

/**
 *
 * @author Manuel Alejandro
 */
public class Analizador_distinto {

    int cont;
    boolean aceptada;/*para guardar los caratcteres y los va ir separando*/

    char[] car;

    public Lexema inicio(FlujoCaracteres flujo) {
        cont = flujo.getPosActual();
        car = flujo.getCaracteres();
        aceptada = false;
        q0();
        if (aceptada == true) {
            AnalizadorLexico.flujo.setPosActual(cont);

            return new Lexema("!=", "Operadores relacionales");
        } else {
            return null;
        }

    }

    public void q0() {

        if (cont < car.length) {/*cuantos espacios tiene mi arreglo*/

            if (car[cont] == '!') {/*el arreglo car en el contador 0 lo vamos a comparar si es = a*/

                cont++;/*incrememnto mi contador*/

                qF();

            } else {

                aceptada = false;

            }
        }
    }

    public void qF() {
        if (cont < car.length) {/*cuantos espacios tiene mi arreglo*/

            if (car[cont] == '=') {/*el arreglo car en el contador 0 lo vamos a comparar si es = a*/

                aceptada = true;
                cont++;
                qF();

            } else if (Character.isLetter(car[cont]) || Character.isDigit(car[cont])) {
                aceptada = false;
                cont--;

            }
        }
    }

}
