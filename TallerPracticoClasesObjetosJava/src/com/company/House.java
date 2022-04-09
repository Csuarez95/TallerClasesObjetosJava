package com.company;

/**
 * Representa las dimensiones de una casa.
 *
 * @author Cristian Suárez Acosta
 */

public class House {

    /**
     * Declaración atributo para almacenar el ancho de la casa.
     */
    private int width;

    /**
     * Declaración atributo para almacenar el alto de la casa.
     */
    private int height;

    /**
     * Declaración atributo para almacenar la profundidad de la casa.
     */
    private int depth;

    /**
     * Declaración atributo para almacenar el precio de la casa.
     */
    private int price;

    /**
     * Declaración atributo para almacenar el número de pisos de la casa.
     */
    private byte floorsNumber;

    /**
     * Declaración atributo para almacenar el número de habitaciones de la casa.
     */
    private byte roomsNumber;

    /**
     * Constructor para inicializar las variables.
     */
    public House() {
        this.width = 0;
        this.height = 0;
        this.depth = 0;
        this.price = 0;
        this.floorsNumber = 0;
        this.roomsNumber = 0;
    }

    /**
     * Método que solicita el ancho de la casa.
     * @param width Variable para asignar el ancho de la casa.
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Método para el retorno del ancho de la casa capturado.
     * @return Ancho de la casa.
     */
    public int getWidth() {
        return width;
    }

    /**
     * Método que solicita el ancho de la casa.
     * @param height Variable para asignar la altura de la casa.
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Método para el retorno de la altura de la casa capturada.
     * @return Altura de la casa.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Método que solicita la profundidad de la casa.
     * @param depth Variable para asignar la profundidad de la casa.
     */
    public void setDepth(int depth) {
        this.depth = depth;
    }

    /**
     * Método para el retorno de la profundidad de la casa capturada.
     * @return Profundiad de la casa.
     */
    public int getDepth() {
        return depth;
    }

    /**
     * Método que solicita el precio de la casa.
     * @param price Variable para asignar el precio de la casa.
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Método para el retorno del precio de la casa capturada.
     * @return Precio de la casa.
     */
    public int getPrice() {
        return price;
    }

    /**
     * Método que solicita el número de pisos de la casa.
     * @param floorsNumber Variable para asignar el número de pisos de la casa.
     */
    public void setFloorsNumber(byte floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    /**
     * Método para el retorno de la cantidad de pisos de la casa capturada.
     * @return Cantidad de pisos de la casa.
     */
    public byte getFloorsNumber() {
        return floorsNumber;
    }

    /**
     * Método que solicita el número de habitaciones de la casa.
     * @param roomsNumber ariable para asignar el número de habitaciones de la casa.
     */
    public void setRoomsNumber(byte roomsNumber) {
        this.roomsNumber = roomsNumber;
    }

    /**
     * Método para el retorno de la cantidad de habitaciones de la casa capturada.
     * @return Cantidad de habitaciones de la casa.
     */
    public byte getRoomsNumber() {
        return roomsNumber;
    }

} //Cierre de clase House.
