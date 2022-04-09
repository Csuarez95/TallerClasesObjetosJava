package com.company;

/**
 * Representa un Animal de acuerdo con las características presentadas.
 *
 * @author Cristian Suárez Acosta
 */
public class Animal {

    /**
     * Declaración atributo para almacenar el nombre del animal.
     */
    private String name;

    /**
     * Declaración atributo para almacenar la edad del animal en años.
     */
    private int age;

    /**
     * Declaración atributo para almacenar el tipo de alimentación del animal.
     */
    private String diet;

    /**
     * Declaración atributo para almacenar el pelaje del animal.
     */
    private String coat;

    /**
     * Declaración atributo para almacenar el tipo de animal (Doméstico o salvaje).
     */
    private String type;

    /**
     * Constructor para inicializar las variables.
     */
    public Animal() {
        this.name = "";
        this.age = 0;
        this.diet = "";
        this.coat = "";
        this.type = "";
    }

    /**
     * Método que solicita el nombre del animal.
     * @param name Variable para asignar el nombre del animal.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método para el retorno del nombre del animal.
     * @return Nombre del animal.
     */
    public String getName() {
        return name;
    }

    /**
     * Método que solicita la edad del animal.
     * @param age Variable para asignar la edad del animal.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Método para el retorno de la edad del animal.
     * @return Edad del animal.
     */
    public int getAge() {
        return age;
    }

    /**
     * Método que solicita el tipo de alimentación del animal.
     * @param diet Variable para asignar el tipo de alimentación del animal.
     */
    public void setDiet(String diet) {
        this.diet = diet;
    }

    /**
     * Método para el retorno del tipo de alimentación del animal.
     * @return Tipo de alimentación del animal.
     */
    public String getDiet() {
        return diet;
    }

    /**
     * Método que solicita el tipo de pelaje del animal.
     * @param coat Variable para asignar el tipo de pelaje del animal.
     */
    public void setCoat(String coat) {
        this.coat = coat;
    }

    /**
     * Método para el retorno del tipo de pelaje del animal.
     * @return Tipo de pelaje del animal.
     */
    public String getCoat() {
        return coat;
    }

    /**
     * Método que solicita el tipo de animal.
     * @param type Variable para asignar el tipo de animal.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Método para el retorno del tipo de animal.
     * @return Tipo de animal.
     */
    public String getType() {
        return type;
    }

} //Cierre de clase Animal.
