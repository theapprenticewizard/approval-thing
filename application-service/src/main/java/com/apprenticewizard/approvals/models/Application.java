package com.apprenticewizard.approvals.models;

import java.util.Objects;

public class Application {

    /**
     * The Applicant's first name.
     */
    private String name;

    /**
     * Represents the applicant's credit score for the loan amount.
     */
    private int creditScore;

    /**
     * The default way to create a new Application.
     * @param name the name of the contact
     * @param creditScore the credit score of the contact
     */
    public Application(String name, int creditScore) {
        this.name = name;
        this.creditScore = creditScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Application that = (Application) o;
        return creditScore == that.creditScore &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, creditScore);
    }

    @Override
    public String toString() {
        return "Application{" +
                "name='" + name + '\'' +
                ", creditScore=" + creditScore +
                '}';
    }
}
