package com.company;

import java.util.Date;

/**
 * Representa las diversas propiedades de una cuenta bancaria.
 *
 * @author Cristian Suárez Acosta
 */
public class BankAccount {

    /**
     * Declaración atributo para almacenar número de la cuenta.
     */
    private int accountNumber;
    /**
     * Declaración atributo para almacenar el estado de la cuenta.
     */
    protected boolean activated;

    /**
     * Declaración atributo para almacenar el nombre del propietario de la cuenta.
     */
    private String owner;

    /**
     * Declaración atributo para almacenar tipo de cuenta (Ahorros, corriente).
     */
    private String bankAccountType;

    /**
     * Declaración atributo para almacenar la fecha de expiración de la cuenta.
     */
    private Date expirationDate;

    /**
     * Constructor para inicializar las variables.
     */
    public BankAccount() {
        this.accountNumber = 0;
        this.activated = false;
        this.owner = "";
        this.bankAccountType = "";
    }

    /**
     * Método que solicita el estado de la cuenta.
     * @param activated Variable para asignar el estado de la cuenta.
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**
     * Método para el retorno del estado de la cuenta.
     * @return Estado de la cuenta.
     */
    public boolean isActivated() {
        return activated;
    }

    /**
     * Método que solicita el número de la cuenta.
     * @param accountNumber Variable para asignar el número de la cuenta.
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Método para el retorno del número de la cuenta.
     * @return Número de la cuenta
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Método que solicita el nombre del propietario de la cuenta.
     * @param owner Variable para asignar el nombre del propietario de la cuenta.
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Método para el retorno del propietario de la cuenta.
     * @return Propietario de la cuenta.
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Método que solicita el tipo de cuenta.
     * @param bankAccountType Variable para asignar el tipo de cuenta.
     */
    public void setBankAccountType(String bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    /**
     * Método para el retorno del tipo de cuenta.
     * @return Tipo de cuenta.
     */
    public String getBankAccountType() {
        return bankAccountType;
    }

    /**
     * Método que solicita la fecha de vencimiento de la cuenta.
     * @param expirationDate Variable para asignar la fecha de vencimiento de la cuenta.
     */
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * Método para el retorno la fecha de vencimiento de la cuenta.
     * @return Fecha de vencimiento de la cuenta.
     */
    public Date getExpirationDate() {
        return expirationDate;
    }

} //Cierre de clase BankAccount.
