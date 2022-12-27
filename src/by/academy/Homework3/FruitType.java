package by.academy.Homework3;

public enum FruitType {
    STONEFRUIT(1, "Косточковые"), CITRUS(2, "цитрусовые"), TROPICAL(3, "тропические"), POMEFRUIT(4, "семечковые");
    int index;  
    String desc;


    FruitType(int index, String desc) {
        this.index = index;
        this.desc = desc;
    }
}
