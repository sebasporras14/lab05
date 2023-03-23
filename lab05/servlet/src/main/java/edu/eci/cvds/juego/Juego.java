package edu.eci.cvds.juego;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "juego")
@ApplicationScoped
public class Juego {

    private int guessNumber, number, intentos, premio;
    private String state;
    private List<Integer> lista;
    
    public Juego() {
        restart();
    }

    public void guess() {
    	intentos += 1;
    	lista.add(number);
        if (number == guessNumber) {
            state = "Ganaste $" + premio + "!";
        } else {
        	if (!state.contains("Ganaste $") && premio >= 10000) {
        		premio -= 10000;
        		state = "Intenta de nuevo!";
        	}
        }
    }

    public void restart() {
        Random rand = new Random();
        guessNumber = rand.nextInt(20) + 1;
        intentos = 0;
        premio = 100000;
        number = 10;
        lista = new ArrayList<Integer>();
        state = "Adivina el número entre 1 y 20!";
    }

    public int getguessNumber() {
        return guessNumber;
    }

    public void setguessNumber (int guessNumber) {
        this.guessNumber = guessNumber;
    }
    
    public int getNumber() {
        return number;
    }

    public void setNumber (int number) {
        this.number = number;
    }

    public int getIntentos() {
        return intentos;
    }
    
    public void setIntentos (int intentos) {
        this.intentos = intentos;
    }

    public int getPremio() {
        return premio;
    }

    public void setPremio (int premio) {
        this.premio = premio;
    }
    
    public String getState() {
        return state;
    }

    public void setEstado (String state) {
        this.state = state;
    }
    
    public List<Integer> getLista() {
        return lista;
    }

    public void setLista (List<Integer> lista) {
        this.lista = lista;
    }
}