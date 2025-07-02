import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç Öğrenci Var? ");
        int n = input.nextInt();
        input.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("\n%d. Öğrencinin adını gir: ", i + 1);
            String name = input.nextLine();

            System.out.println(name + " için 3 tane not gir: ");
            double [] grades = new double[3];
            for (int j = 0; j < 3; j++) {
                System.out.printf("Not %d: ", j + 1);
                grades[j] = input.nextDouble();
            }
            input.nextLine();
            students[i] = new Student(name, grades);
        }
        System.out.println("\n--- Sonuçlar ---");

        double enYuksekOrt = 0;
        String enBas = "";

        for(Student s : students) {
            double ort = s.getAverage();
            s.printInfo();

            if(ort > enYuksekOrt) {
                enYuksekOrt = ort;
                enBas = s.name;
            }
        }
        System.out.printf("\nEn Başarılı Öğrenci: %s (Ortalama %.2f)\n", enBas, enYuksekOrt);
    }
}

class Student {
    String name;
    double[] grades;

    Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades;
    }

    double getAverage() {
        double total = 0;
        for (double g : grades) {
            total += g;
        }
        return total / grades.length;
    }
    void printInfo() {
        double avg = getAverage();
        System.out.printf("%s - Ortalama: %.2f - %s\n", name, avg, avg >= 50 ? "Geçti" : "Kaldı");
    }
}
