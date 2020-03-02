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
    private int score;

    /**
     * The default way to create a new Application.
     * @param name the name of the contact
     * @param score the credit score of the contact
     */
    public Application(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Application that = (Application) o;
        return score == that.score &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public String toString() {
        return "Application{" +
                "name='" + name + '\'' +
                ", creditScore=" + score +
                '}';
    }
}
