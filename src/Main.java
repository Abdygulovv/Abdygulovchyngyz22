import java.util.Random;

public class Main {
    public static void main(String[] args){
        System.out.println(school(22,18));
        System.out.println(school(28,23));
        System.out.println(school(19,-23));
        System.out.println(school(21,18));
        System.out.println(school(43,-22));
        System.out.println(school (generateRandomAge(), -35));
    }
    public static String school(int age,int temperature){
        generateRandomAge();
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature<=30){
            return "Можно идти гулять";
        } else if (age <20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature<= 25) {
            return "Оставайтесь дома";
        }else {
            return "Оставайтесь дома";
        }

    }
    public  static int generateRandomAge(){
        Random random = new Random();
        int age = random.nextInt(0,100);
        return age;
    }



}