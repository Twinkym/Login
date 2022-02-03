import java.util.Scanner;

public class Login {

        private static final String USUARIO = "Jalisconoterajes@gmail.com";
        private static final String PASSWORD = "123456";

        public static void main(String[] args) {

        String user = askForDataUser();
        String pwd = askForPasword();

        validateInputData(user );
        validateInputPassword(pwd);

    }

    private static  String askForDataUser() {
        System.out.println("Introdueix el usuari: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static String askForPasword() {
        System.out.println("Introdueix el Password: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static void validateInputData(String user ) {
        if (USUARIO.equals(user)){
            System.out.println("Benvingut!!!");
        }else{
            System.out.println("El camp no es correcte!! Introdueix el E-mail correcte.");
        }

    }

    private static void validateInputPassword(String pwd) {
        if (PASSWORD.equals(pwd)){
            System.out.println("Benvingut!!!");
        }else{
            System.out.println("El camp no es correcte!! Introdueix el PASSWORD correcte.");
        }
    }

}
