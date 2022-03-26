package code.clean.sample.ocp;

public class ProductValidator {

    public void validateProduction(Production production) throws IllegalArgumentException {

        if (production.getOption().equals("N")) {
            if (production.getNameLength() < 3) {
                throw new IllegalArgumentException("�Ϲ� ��ǰ�� �̸��� 3���ں��� ���� �մϴ�.");
            }
        } else if (production.getOption().equals("E")) {
            if (production.getNameLength() < 10) {
                throw new IllegalArgumentException("����Ƽ�� ��ǰ�� �̸��� 10���ں��� ���� �մϴ�.");
            }
        } else if (production.getOption().equals("L")) {
            if (production.getNameLength() < 20) {
                throw new IllegalArgumentException("���� ��ǰ�� �̸��� 20���ں��� ���� �մϴ�.");
            }
        }
    }

}
