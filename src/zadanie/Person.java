package zadanie;

public class Person implements Atm {

    private String name;
    private int price = 0;
    private int age;
    private boolean vernostnyProgram;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isVernostnyProgram() {
        return vernostnyProgram;
    }

    public void setVernostnyProgram(boolean vernostnyProgram) {
        this.vernostnyProgram = vernostnyProgram;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void insertMoney(int a) {

        setPrice(getPrice() + a);
        System.out.println("price= " + a);

    }

    @Override
    public void takeMoney(int a) {

        price = price - a;

    }

    @Override
    public void showMoney() {
        System.out.println(getPrice());
    }

}
