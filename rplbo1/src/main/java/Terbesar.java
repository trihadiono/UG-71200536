public class Terbesar {
    public static void main(String[] args) {
        int min = 1000000;
        int max = -1000000;
        for (String number : args){
            System.out.println("number: " + number);
            int angka = Integer.parseInt(number);
            if (angka > max){
                max = angka;
            }
            if (angka < min) {
                min = angka;
            }
        }
        System.out.println("maksimum: " + max);
        System.out.println("minimum: " + min);
    }
}
