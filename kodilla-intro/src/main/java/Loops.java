public class Loops {
    public static int kwadracik(int number){
        int wynik;
        wynik=number*number;
        return wynik;
    }
    public static void main(String[] args) {

        String[] names = new String[]{"Zygfryd", "Gwindon", "Florentyna"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
        System.out.println(kwadracik(2));
    }
    public int sumNumbers(int[] numbers) {
            int result = 0;
            for (int i=0; i<numbers.length;i++){
                result = result+numbers[i];
                System.out.println(result);
        }
        return result;

    }


}
