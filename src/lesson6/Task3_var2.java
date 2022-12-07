package lesson6;

public class Task3_var2 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Object-oriented programming is a programming language model organized around objects"
                +" rather than \"actions\" and data rather than logic. Object-oriented programming blablabla. Object-oriented programming blabla." +
                "Object-oriented programming bla.");
        String sLower = s.toString().toLowerCase();
        String substrFrom = "object-oriented programming";
        String substrTo = "OOP";
        StringBuilder res = new StringBuilder();
        boolean isOdd = false;
        int postion = -1 ;
        int positionPrev = 0;
        do {
            postion = sLower.indexOf(substrFrom,postion +1);
            if (postion != -1){
                if (! isOdd) {
                    res.append(s.substring(positionPrev, postion));
                    res.append(substrTo);

                } else {
                    res.append(s.substring(positionPrev,postion + substrFrom.length()));
                }
                positionPrev = postion + substrFrom.length();
            }
        isOdd = !isOdd;

        } while (postion != -1);
        res.append(s.substring(positionPrev));
        System.out.println(res);
    }
}
