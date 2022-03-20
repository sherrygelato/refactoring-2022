package code.clean.sample.ocp;

public class Production {
    private String name;
    private int price;
    // N(�Ϲ�) ,E(����Ƽ��) ,L(������ǰ)...
    private String option;

    public Production(String name, int price, String option) {
        this.name = name;
        this.price = price;
        this.option = option;
    }

    public int getNameLength() {
        return name.length();
    }

    public String getOption() {
        return option;
    }

}
