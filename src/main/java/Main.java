import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        for (int i = 0; i < 3; i++) {
            String name = getName(scanner, i + 1);
            int speed = getSpeed(scanner, i + 1);

            cars.add(new Car(name, speed));
            race.setCurrentWinner(cars.get(i));
        }

        System.out.println("Самая быстрая машина: " + race.winner);

        scanner.close();
    }

    public static String getName(Scanner scanner, int carNumber) {
        String name;

        while (true) {
            System.out.printf("Название машины %d:\n", carNumber);
            name = scanner.nextLine().trim();

            if (!name.isEmpty()) {
                break;
            } else {
                System.out.println("Неправильное название\n");
            }
        }

        return name;
    }

    public static int getSpeed(Scanner scanner, int carNumber) {
        int speed;

        while (true) {
            System.out.printf("Скорость машины %d:\n", carNumber);

            if (scanner.hasNextInt()) {
                speed = scanner.nextInt();

                if (speed > 0 && speed <= 250) {
                    break;
                } else {
                    System.out.println("Неправильная скорость\n");
                }
            } else {
                scanner.next();
                System.out.println("Неправильная скорость\n");
            }
        }
        scanner.nextLine();
        return speed;
    }
}
