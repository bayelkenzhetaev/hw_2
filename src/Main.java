public class Main {
    public static void main(String[] args) {
        System.out.println(method(20, 10));
        System.out.println(method(18, 6));
        System.out.println(method(15, 98));
        System.out.println(method(17, 8));
        System.out.println(method(26, 19));
    }
    
    public static String method(int age, int temp){
        if (age >= 20 && age <= 45 && temp >=-20 && temp <=30) {
            return "Можно идти гулять one";
        } else if (age <=20 && age >=0 && temp >=0 && temp <=28) {
            return "Можно идти гулять two";
        } else if (age >=45 && temp<= 25 && temp >=-10){
            return "Можно идти гулять three";
        } else {
            return "Оставайся дома";
        }
    }
}