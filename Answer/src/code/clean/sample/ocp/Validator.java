package code.clean.sample.ocp;

public interface Validator {
    boolean support(Production production);

    void validate(Production production) throws IllegalArgumentException;
}
