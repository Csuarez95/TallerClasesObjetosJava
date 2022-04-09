package com.company;

import java.text.DateFormat;
import java.util.Date;

/**
 * Representa una Persona y las características que la definen.
 *
 * @author Cristian Suárez Acosta
 */

public class Person {

    /**
     * Declaración atributo para almacenar nombre.
     */
    public String name;

    /**
     * Declaración atributo para almacenar apellido 1.
     */
    public String lastName1;

    /**
     * Declaración atributo para almacenar apellido 2.
     */
    public String lastName2;

    /**
     * Declaración atributo para almacenar fecha.
     */
    public Date dateBirth;

    /**
     * Declaración atributo para almacenar altura.
     */
    public float height;

    /**
     * Declaración atributo para almacenar identificación.
     */
    private String id;

    /**
     * Declaración atributo para almacenar género.
     */
    private String gender;

    /**
     * Declaración atributo para almacenar edad.
     */
    private int age;

    /**
     * Declaración atributo para almacenar color de cabello.
     */
    private String hairColor;

    /**
     * Declaración atributo para almacenar color de ojos.
     */
    private String eyeColor;

    /**
     * Constructor para inicializar las variables.
     */
    public Person() {
        this.name = "";
        this.lastName1 = "";
        this.lastName2 = "";
        this.height = 0;
        this.id = "";
        this.gender = "";
        this.age = 0;
        this.hairColor = "";
        this.eyeColor = "";
    }

    /**
     * Método que solicita el nombre de la persona.
     * @param name Variable para asignar el nombre de la persona.
     */
    public void setName(String name) {
        this.name = name;
    } // Cierre del método setName.

    /**
     * Método para el retorno del nombre capturado.
     * @return Nombre de la persona.
     */
    public String getName() {
        return name;
    } // Cierre del método getName.

    /**
     * Método que solicita el primer apellido de la persona.
     * @param lastName1 Variable para asignar el primer apellido de la persona.
     */
    public void setLastName1(String lastName1){
        this.lastName1 = lastName1;
    }

    /**
     * Método para el retorno del primer apellido capturado.
     * @return Primer apellido de la persona.
     */
    public String getLastName1() {
        return lastName1;
    }

    /**
     * Método que solicita el segundo apellido de la persona.
     * @param lastName2 Variable para asignar el segundo apellido de la persona.
     */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    /**
     * Método para el retorno del segundo apellido capturado.
     * @return Segundo apellido de la persona.
     */
    public String getLastName2() {
        return lastName2;
    }

    /**
     * Método que solicita la edad de la persona.
     * @param dateBirth Variable para asignar la fecha de cumpleaños de la persona.
     */
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    /**
     * Método para el retorno de la fecha de cumpleaños de la persona
     * @return fecha de cumpleaños de la persona.
     */
    public Date getDateBirth() {
        return dateBirth;
    }

    /**
     * Método que solicita la altura de la persona.
     * @param height Variable para asignar la altura de la persona
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * Método para el retorno de la fecha de cumpleaños de la persona.
     * @return Altura de la persona.
     */
    public float getHeight() {
        return height;
    }

    /**
     * Método que solicita el número de identificación de la persona.
     * @param id Variable para almacenar la identificación de la persona.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Método para el retorno del número de identificación de la persona.
     * @return Número de identificación de la persona.
     */
    public String getId() {
        return id;
    }

    /**
     * Método que solicita la edad de la persona.
     * @param age Variable para almacenar la edad de la persona.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Método para el retorno de la edad de la persona.
     * @return Edad de la persona.
     */
    public int getAge() {
        return age;
    }

    /**
     *  Método que solicita el género de la persona.
     * @param genre Variable para almacenar el género de la persona.
     */
    public void setGender(String genre) {
        this.gender = gender;
    }

    /**
     * Método para el retorno del género de la persona.
     * @return Género de la persona
     */
    public String getGender() {
        return gender;
    }

    /**
     * Método que solicita el color de cabello de la persona.
     * @param hairColor Variable para almacenar el color de cabello  de la persona.
     */
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    /**
     * Método para el retorno del género de la persona.
     * @return Color de cabello de la persona.
     */
    public String getHairColor() {
        return hairColor;
    }

    /***
     * Método que solicita el color de los ojos de la persona.
     * @param eyeColor Variable para almacenar el color de cabello  de la persona.
     */

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    /**
     * * Método para el retorno del color de los ojos de la persona.
     * @return
     */
    public String getEyeColor() {
        return eyeColor;
    }

} //Cierre de clase Person.
