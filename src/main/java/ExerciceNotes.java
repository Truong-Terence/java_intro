import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class ExerciceNotes {

    // Écrire un algorithme qui vous demande de saisir une note et un prénom pour chacun de vos élèves
    //La saisie s’arrête dès que l’utilisateur saisit -1
    //Veuillez ensuite afficher la note de chaque élèves
    //Projet à reprendre  => Le transformer avec une (ou plusieurs classes si besoin..)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<String, String>();
        while (true) {
            System.out.println("Mark ? ");
            int mark = scanner.nextInt();

            if (mark == -1 ) {
                break;
            } else {
                System.out.println("Name ? ");
                String name = scanner.next();
                map.put(String.valueOf(mark), name);
            }
        }
            System.out.println(map);
    }
}
