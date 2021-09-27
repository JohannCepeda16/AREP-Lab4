package edu.escuelaing.documents;

public class Cadena {
    private String value;

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Cadena [value=" + value + "]";
    }
}
