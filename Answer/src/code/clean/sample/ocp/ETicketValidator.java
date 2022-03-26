package code.clean.sample.ocp;

public class ETicketValidator implements Validator {

	@Override
	public boolean support(Production production) {
		// TODO Auto-generated method stub
		 return production.getOption().equals("E");
	}

	@Override
	public void validate(Production production) throws IllegalArgumentException {
		if (production.getNameLength() < 10) {
            throw new IllegalArgumentException("전자티켓 상품의 이름은 10글자보다 길어야 합니다.");
        }
		
	}

}
