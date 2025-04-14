import java.util.Scanner;

public class Main {

    final static int minSpeed = 0;
    final static int maxSpeed = 250;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        for (int i = 1; i <= 3; i++) {
            String name = getName(scanner, i);
            int speed = getSpeed(scanner, i);

            Car car = new Car(name, speed);
            race.setCurrentWinner(car);
        }

        System.out.println("Самая быстрая машина: " + race.getWinner());

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

                if (speed > minSpeed && speed <= maxSpeed) {
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
