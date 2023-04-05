import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class ExerciceNotes {

    // Écrire un algorithme qui vous demande de saisir une note et un prénom pour chacun de vos élèves
    //La saisie s’arrête dès que l’utilisateur saisit -1
    //Veuillez ensuite afficher la note de chaque élèves
    //Projet à reprendre  => Le transformer avec une (ou plusieurs classes si besoin..)

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Map<String, String> map = new HashMap<String, String>();
//        while (true) {
//            System.out.println("Mark ? ");
//            int mark = scanner.nextInt();
//
//            if (mark == -1 ) {
//                break;
//            } else {
//                System.out.println("Name ? ");
//                String name = scanner.next();
//                map.put(String.valueOf(mark), name);
//            }
//        }
//            System.out.println(map);
//    }
public static void main(String[] args) {
    Student[] students = new Student[100];

    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < students.length; i++) {
        System.out.println("Saisir prénom :");
        String firstname = scanner.next();
        if (firstname.equals("-1")) {
            break;
        }

        System.out.println("Saisir nom :");
        String name = scanner.next();
        if (name.equals("-1")) {
            break;
        }
        System.out.println("Saisir age :");
        short age = scanner.nextShort();
        if (age == -1) {
            break;
        }
        System.out.println("Saisir note :");
        int mark = scanner.nextInt();
        if (mark == -1) {
            break;
        }
        students[i] = new Student(firstname, name, mark, age);
    }
    display(students);
}

    static void display(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
            System.out.println(students[i].firstName + " --> " + students[i].mark);
        }
    }
}
