package lesson6;

public class Task3 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Object-oriented programming is a programming language model organized around objects"
                +"rather than \"actions\" and data rather than logic. Object-oriented programming blablabla. Object-oriented programming blabla." +
                "Object-oriented programming bla.");
        String sLower = s.toString().toLowerCase();
        String substrFrom = "Object-oriented programming";
        String substrTo = "OOP";
        boolean isOdd = false;
        int postion = -1 ;
        do {
            postion = s.indexOf(substrFrom,postion +1);
        if (isOdd && postion != -1 ){
                s.replace(postion,postion+substrFrom.length(),substrTo);
            }
            isOdd = !isOdd;

        } while (postion != -1);
        System.out.println(s);
    }
}
