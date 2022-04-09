package com.company;

import java.util.ArrayList;

/**
 * Representa las características que identifican a una fruta.
 *
 * @author Cristian Suárez Acosta
 */

public class Fruit {

    /**
     * Declaración atributo para almacenar nombre de la fruta.
     */
    public String name;

    /**
     * Declaración atributo para almacenar el peso promedio de la fruta.
     */
    private float averageWeight;

    /**
     * Declaración atributo para almacenar el color de la fruta.
     */
    ArrayList<String> colors;

    /**
     * Declaración atributo para almacenar el tamaño de la fruta.
     */
    private String size;

    /**
     * Declaración atributo para almacenar la forma de la fruta.
     */
    public String shape;

    /**
     * Declaración atributo para almacenar las vitaminas de la fruta.
     */
    public String vitamins;

    /**
     * Constructor para inicializar las variables.
     */
    public Fruit() {
        this.name = "";
        this.averageWeight = 0;
        this.size = "";
        this.shape = "";
        this.vitamins = "";
    }

    /**
     * Método que solicita el nombre de la fruta.
     * @param name Variable para asignar el nombre de la fruta.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método para el retorno del nombre de la fruta capturada.
     * @return Nombre de la fruta.
     */
    public String getName() {
        return name;
    }

    /**
     * Método que solicita el peso promedio de la fruta.
     * @param averageWeight Variable para asignar el peso promedio de la fruta.
     */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    /**
     * Método para el retorno del peso promedio de la fruta capturada.
     * @return Peso promedio de la fruta
     */
    public float getAverageWeight() {
        return averageWeight;
    }

    /**
     * Método que solicita el color de la fruta para almacenarlo en una posición de la lista.
     * @param colors Variable para asignar el color de la fruta.
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    /**
     * Método para el retorno del color de la fruta capturada.
     * @return Color de la fruta
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Método que solicita el tamaño de la fruta.
     * @param size Variable para asignar el tamaño de la fruta.
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Método para el retorno del tamaño de la fruta capturada.
     * @return Tamaño de la fruta.
     */
    public String getSize() {
        return size;
    }

    /**
     * Método que solicita la forma de la fruta.
     * @param shape Variable para asignar la forma de la fruta.
     */
    public void setShape(String shape) {
        this.shape = shape;
    }

    /**
     * Método para el retorno de la forma de la fruta capturada.
     * @return Forma de la fruta.
     */
    public String getShape() {
        return shape;
    }

    /**
     * Método que solicita las vitaminas de la fruta.
     * @param vitamins Variable para asignar las vitaminas de la fruta.
     */
    public void setVitamins(String vitamins) {
        this.vitamins = vitamins;
    }

    /**
     * Método para el retorno de las vitaminas de la fruta capturada.
     * @return Vitaminas de la fruta.
     */
    public String getVitamins() {
        return vitamins;
    }

} //Cierre de clase Fruit.
