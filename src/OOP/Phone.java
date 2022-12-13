package OOP;

public class Phone {
    private String model;
    private String number;
    private int weight;

    public Phone() {
        super();
    }

    public Phone(String model, String number) {
        this.model = model;
        this.number = number;
    }

    public Phone(String model, String number, int weight) {
        this(model, number);
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public int getWeight() {
        return weight;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone[" +
                "model='" + model + '\'' +
                ", number='" + number + '\'' +
                ", weight=" + weight +
                ']';
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("звонит " + name + "с номера" + number);
    }

    public void sendMessage(String... numbers) {
        System.out.println("отправка сообщений");
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
            numbers[i] += " отправлено";
        }
       /* for (String number : numbers) {
            System.out.print(number + " ");
            number += " отправлено";
        }*/
        System.out.println();
        System.out.println("Отправка завершена");
    }
}
