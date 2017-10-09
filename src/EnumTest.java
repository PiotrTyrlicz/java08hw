import java.util.Scanner;

public class EnumTest {
    public static void main(String[] args) {
        Scanner scan1=new Scanner(System.in);
        String kierunek;

        Direction[] directions=Direction.values();
        for(Direction direction: directions){
            System.out.println(direction);
        }

        System.out.println("Podaj kierunek");
        kierunek=scan1.nextLine();
        Direction dir1;
        dir1=Direction.valueOf(kierunek);

        switch (dir1){

            case NORTH:
                System.out.println("No to na północ");
                break;
            case SOUTH:
                System.out.println("W takim razie na południe");
                break;
            case WEST:
                System.out.println("Na dziki zachód");
                break;
            case EAST:
                System.out.println("Ku wschodowi");
                break;
        }


    }
}
