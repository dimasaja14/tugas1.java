import java.util.Scanner;

public class codelab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean selesai = false;

        while (!selesai) {
            System.out.println("===== Library System =====");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter your NIM: ");
                    String studentNIM = scanner.next();
                    if (studentNIM.length() >= 15 && "202310370311391".equals(studentNIM)) {
                        System.out.println("Successful Login as Student");
                    } else {
                        System.out.println("User Not Found");
                    }
                    break;
                case 2:
                    System.out.print("Enter your username (admin): ");
                    String username = scanner.next();
                    System.out.print("Enter your password (admin): ");
                    String password = scanner.next();
                    if (username.equals("admin") && password.equals("admin")) {
                        System.out.println("Successful Login as Admin");
                    } else {
                        System.out.println("Admin User Not Found!!");
                    }
                    break;
                case 3:
                    selesai = true;
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
            }
        }

        scanner.close();
    }
}