package code.clean.sample.ocp;

public class NormalValidator implements Validator  {

	@Override
	public boolean support(Production production) {
		// TODO Auto-generated method stub
		return production.getOption().equals("N");
	}

	@Override
	public void validate(Production production) throws IllegalArgumentException {
		if (production.getNameLength() < 3) {
            throw new IllegalArgumentException("�Ϲ� ��ǰ�� �̸��� 3���ں��� ���� �մϴ�.");
        }
		
	}

}
