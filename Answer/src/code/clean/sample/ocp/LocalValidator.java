package code.clean.sample.ocp;

public class LocalValidator implements Validator {

	@Override
	public boolean support(Production production) {
		// TODO Auto-generated method stub
		return production.getOption().equals("L");
	}

	@Override
	public void validate(Production production) throws IllegalArgumentException {
		if (production.getNameLength() < 20) {
            throw new IllegalArgumentException("���� ��ǰ�� �̸��� 20���ں��� ���� �մϴ�.");
        }
		
	}

}
