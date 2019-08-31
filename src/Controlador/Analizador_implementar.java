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
 * @author GABRIELA
 */
public class Analizador_implementar {

    int cont;
    boolean aceptada;

    char[] car;

      public Lexema inicio(FlujoCaracteres flujo) {
        cont = flujo.getPosActual();
        car = flujo.getCaracteres();
        aceptada = false;
        q0();
         if (aceptada) {
            AnalizadorLexico.flujo.setPosActual(cont);
            return new Lexema("implementar", "estructura de datos");
        } else {
            return null;
        }
    }

    public void q0() {

        if (cont < car.length) {

            if (car[cont] == 'i') {

                cont++;

                q1();

            } else {

                aceptada = false;

            }
        }
    }

    public void q1() {

        if (cont < car.length) {

            if (car[cont] == 'm') {

                cont++;

                q2();

            } else {

                aceptada = false;

            }
        }
    }

    public void q2() {

        if (cont < car.length) {

            if (car[cont] == 'p') {

                cont++;

                q3();

            } else {

                aceptada = false;

            }
        }
    }

    public void q3() {

        if (cont < car.length) {

            if (car[cont] == 'l') {

                cont++;

                q4();

            } else {

                aceptada = false;

            }
        }
    }

    public void q4() {

        if (cont < car.length) {

            if (car[cont] == 'e') {

                cont++;

                q5();

            } else {

                aceptada = false;

            }
        }
    }

    public void q5() {

        if (cont < car.length) {

            if (car[cont] == 'm') {

                cont++;

                qF();

            } else {

                aceptada = false;

            }
        }
    }

    public void q6() {

        if (cont < car.length) {

            if (car[cont] == 'e') {

                cont++;

                q7();

            } else {

                aceptada = false;

            }
        }
    }

    public void q7() {

        if (cont < car.length) {

            if (car[cont] == 'n') {

                cont++;

                q8();

            } else {

                aceptada = false;

            }
        }
    }

    public void q8() {

        if (cont < car.length) {

            if (car[cont] == 't') {

                cont++;

                q9();

            } else {

                aceptada = false;

            }
        }
    }

    public void q9() {

        if (cont < car.length) {

            if (car[cont] == 'a') {

                cont++;

                qF();

            } else {

                aceptada = false;

            }
        }
    }

    public void qF() {
        if (cont < car.length) {

            if (car[cont] == 'r') {
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
