import java.util.Scanner;

public class HemoglobinRangeProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the gender (M for male, F for female, C for children, N for newborn): ");
        String gender = scanner.nextLine();

        if (gender.equalsIgnoreCase("C")) {
            System.out.println("Enter the age in months (1-12): ");
            int age = scanner.nextInt();

            System.out.println("Enter the hemoglobin count: ");
            double hemoglobin = scanner.nextDouble();

            if (age >= 1 && age <= 12) {
                if (hemoglobin >= 11.0 && hemoglobin <= 13.5) {
                    System.out.println("Hemoglobin count is within the normal range for children (1 month - 12 months).");
                } else {
                    System.out.println("Hemoglobin count is outside the normal range for children (1 month - 12 months).");
                }
            } else {
                System.out.println("Invalid age input for children.");
            }
        } else if (gender.equalsIgnoreCase("N")) {
            System.out.println("Enter the age in months (0-3): ");
            int age = scanner.nextInt();

            System.out.println("Enter the hemoglobin count: ");
            double hemoglobin = scanner.nextDouble();

            if (age >= 0 && age <= 3) {
                if (hemoglobin >= 13.5 && hemoglobin <= 20.0) {
                    System.out.println("Hemoglobin count is within the normal range for newborn babies (0-3 months).");
                } else {
                    System.out.println("Hemoglobin count is outside the normal range for newborn babies (0-3 months).");
                }
            } else {
                System.out.println("Invalid age input for newborn babies.");
            }
        } else {
            System.out.println("Enter the age: ");
            int age = scanner.nextInt();

            System.out.println("Enter the hemoglobin count: ");
            double hemoglobin = scanner.nextDouble();

            if (gender.equalsIgnoreCase("M")) {
                if (age > 18) {
                    if (hemoglobin >= 12.1 && hemoglobin <= 15.1) {
                        System.out.println("Hemoglobin count is within the normal range for adult males.");
                    } else {
                        System.out.println("Hemoglobin count is outside the normal range for adult males.");
                    }
                } else {
                    if (hemoglobin >= 12.0 && hemoglobin <= 16.0) {
                        System.out.println("Hemoglobin count is within the normal range for male minors.");
                    } else {
                        System.out.println("Hemoglobin count is outside the normal range for male minors.");
                    }
                }
            } else if (gender.equalsIgnoreCase("F")) {
                if (age > 18) {
                    if (hemoglobin >= 12.1 && hemoglobin <= 15.1) {
                        System.out.println("Hemoglobin count is within the normal range for adult females.");
                    } else {
                        System.out.println("Hemoglobin count is outside the normal range for adult females.");
                    }
                } else {
                    if (hemoglobin >= 12.0 && hemoglobin <= 16.0) {
                        System.out.println("Hemoglobin count is within the normal range for female minors.");
                    } else {
                        System.out.println("Hemoglobin count is outside the normal range for female minors.");
                    }
                }
            } else {
                System.out.println("Invalid gender input.");
            }
        }
    }
}
