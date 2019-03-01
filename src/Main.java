import no.uib.venneliste.Friend;
import no.uib.venneliste.FriendsList;
import no.uib.venneliste.Node;
import java.util.Scanner;

public class Main {

    private static FriendsList<Node> venneliste;



    public static void main(String[] args){
        int terminate = 0;
        Friend jostein = new Friend("Kongen","Dank","jostein@uib.no","12345678");
        FriendsList venneliste = new FriendsList(jostein);

        venneliste.addFriend(1,jostein);
        do{
            System.out.println("Velg en handling: ");
            System.out.println("Skriv inn tall for ønsket handling: ");
            System.out.println("1 , legge til venn");
            System.out.println("2, fjerne en venn");
            System.out.println("3, Sortere vennelisten");
            System.out.println("0, Avslutte programmet");


            Scanner kb = new Scanner(System.in);

            int num = kb.nextInt();

            switch (num){
                case 1:
                    Friend Kappa = add();
                    venneliste.addFriend(1, Kappa);
                    break;

                case 2:
                    System.out.println("Pride");
                    break;

                case 3:
                    System.out.println("LOL");
                    break;
                case 0:
                    terminate = 1;
            }
        }while(terminate == 0);
    }

    public static Friend add(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Fornavn: ");
        String fornavn = kb.next();
        System.out.println("Etternavn: ");
        String etternavn = kb.next();
        System.out.println("E-post: ");
        String epost = kb.next();
        System.out.println("Tlf: ");
        String tlf = kb.next();
        Friend addFriend = new Friend(fornavn, etternavn, epost, tlf);

        return addFriend;

    }

}
