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
            throw new IllegalArgumentException("����Ƽ�� ��ǰ�� �̸��� 10���ں��� ���� �մϴ�.");
        }
		
	}

}
