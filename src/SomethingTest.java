import java.util.Scanner;

public class SomethingTest {
    public static void main(String[] args) {
        Something[] somethings = new Something[3];
        Scanner scan1=new Scanner(System.in);
        String nazwa;
        int dlugosc;
        double waga;
//        somethings[0]= new Something("Miecz", 150, 5);
//        somethings[1]= new Something("Miecz", 150, 5);
//        somethings[2]= new Something("Miecz", 130, 4.6);

        for(int i=0; i<3; i++){
            System.out.println("Podaj obiekt");
            nazwa=scan1.nextLine();
            dlugosc=scan1.nextInt();
            scan1.nextLine();
            waga=scan1.nextDouble();
            scan1.nextLine();

            somethings[i]=new Something(nazwa, dlugosc,waga);
            for (int j=0; j<3; j++){
                if(i!=j && somethings[i].equals(somethings[j]) ){
                    System.out.println("Zmien cos");
                    i--; j=3;
                }

            }
        }
        for(int i=0; i<3; i++){
            System.out.println("Cos"+i+"="+somethings[i].getNazwa()+" dlugosc: " +somethings[i].getDlugosc()+" i waga: " +somethings[i].getWaga());
        }

        System.out.println("Koniec programu");
    }
}
