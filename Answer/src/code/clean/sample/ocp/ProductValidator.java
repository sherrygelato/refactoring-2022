package code.clean.sample.ocp;

import java.util.Arrays;
import java.util.List;

public class ProductValidator {
    private final List<Validator> validators = Arrays.asList(new NormalValidator(), new ETicketValidator(), new LocalValidator());

    public void validate(Production production) {
        Validator productionValidator = new NormalValidator();

        for (Validator localValidator : validators) {
            if (localValidator.support(production)) {
                productionValidator = localValidator;
                break;
            }
        }

        productionValidator.validate(production);
    }

}
