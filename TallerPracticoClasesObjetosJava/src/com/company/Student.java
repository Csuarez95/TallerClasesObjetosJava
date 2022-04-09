package com.company;

/**
 * Representa la información correspondiente a un estudiante universitario.
 *
 * @author Cristian Suárez Acosta
 */
public class Student {

    /**
     * Declaración atributo para almacenar nombre completo del estudiante.
     */
    private String fullName;

    /**
     * Declaración atributo para almacenar la identificación del estudiante.
     */
    private int studentId;

    /**
     * Declaración atributo para almacenar el género del estudiante.
     */
    private char gender;

    /**
     * Declaración atributo para almacenar el nombre de la universidad del estudiante.
     */
    private String university;

    /**
     * Declaración atributo para almacenar el semestre en curso del estudiante.
     */
    private byte semester;

    /**
     * Declaración atributo para almacenar la carrera del estudiante.
     */
    private String career;

    /**
     * Constructor para inicializar las variables.
     */
    public Student() {
        this.fullName = "";
        this.studentId = 0;
        this.gender = '0';
        this.university = "";
        this.semester = 0;
        this.career = "";
    }

    /**
     * Método que solicita el nombre del estudiante.
     * @param name Variable para asignar el nombre del estudiante.
     */
    public void setFullName(String name) {
        this.fullName = fullName;
    }

    /**
     * Método para el retorno del nombre capturado.
     * @return Nombre del estudiante.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Método que solicita la identificación del estudiante.
     * @param studentId Variable para asignar la identificación del estudiante.
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * Método para el retorno de la identificación capturada.
     * @return Identificación del estudiante.
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * Método que solicita el género del estudiante.
     * @param gender Variable para asignar el género del estudiante.
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * Método para el retorno del género capturado.
     * @return genero del estudiante.
     */
    public char getGender() {
        return gender;
    }

    /**
     * Método que solicita la universidad del estudiante.
     * @param university Variable para asignar la universidad del estudiante.
     */
    public void setUniversity(String university) {
        this.university = university;
    }

    /**
     * Método para el retorno de la universidad capturada.
     * @return Universidad del estudiante.
     */
    public String getUniversity() {
        return university;
    }

    /**
     * Método que solicita la carrera del estudiante.
     * @param career Variable para asignar la carrera del estudiante.
     */
    public void setCareer(String career) {
        this.career = career;
    }

    /**
     * Método para el retorno de la carrera capturada.
     * @return Carrera del estudiante
     */
    public String getCareer() {
        return career;
    }

    /**
     * Método que solicita el semestre actual del estudiante.
     * @param semester Variable para asignar el semestre actual del estudiante.
     */
    public void setSemester(byte semester) {
        this.semester = semester;
    }

    /**
     * Método para el retorno del semestre actual capturada.
     * @return Semestre actual del estudiante
     */
    public byte getSemester() {
        return semester;
    }

} //Cierre de clase Student.
