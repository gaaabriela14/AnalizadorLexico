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
public class Analizador_caracter {

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
            return new Lexema("caracter", "tipo de dato");
        } else {
            return null;
        }
    }

    public void q0() {

        if (cont < car.length) {

            if (car[cont] == 'c') {

                cont++;

                q1();

            } else {

                aceptada = false;

            }
        }
    }

    public void q1() {

        if (cont < car.length) {

            if (car[cont] == 'a') {

                cont++;

                q2();

            } else {

                aceptada = false;

            }
        }
    }

    public void q2() {

        if (cont < car.length) {

            if (car[cont] == 'r') {

                cont++;

                q3();

            } else {

                aceptada = false;

            }
        }
    }

    public void q3() {

        if (cont < car.length) {

            if (car[cont] == 'a') {

                cont++;

                q4();

            } else {

                aceptada = false;

            }
        }
    }

    public void q4() {

        if (cont < car.length) {

            if (car[cont] == 'c') {

                cont++;

                q5();

            } else {

                aceptada = false;

            }
        }
    }

    public void q5() {

        if (cont < car.length) {

            if (car[cont] == 't') {

                cont++;

                q6();

            } else {

                aceptada = false;

            }
        }
    }

    public void q6() {

        if (cont < car.length) {

            if (car[cont] == 'e') {

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
