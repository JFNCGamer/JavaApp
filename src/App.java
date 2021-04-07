import java.util.Scanner;

public class App {
    static void showtext(Integer age, String name, String likes, Boolean masculino) {
        String sexo = "";
        if (masculino == true) {
            sexo = "O";
        } else {
            sexo = "A";
        }
        System.out.println("Nome: "+name);
        System.out.println("Idade: "+age+" "+"anos");
        System.out.println("Gosta de: "+likes);
        System.out.println(sexo+" "+name+" "+"gosta de"+" "+likes+" "+"e tem"+" "+age+" "+"anos");
    }
    static void showtext2(Integer age, String name, String likes, Boolean feminino) {
        String sexo = "";
        if (feminino == true) {
            sexo = "O";
        } else {
            sexo = "A";
        }
        System.out.println("Nome: "+name);
        System.out.println("Idade: "+age+" "+"anos");
        System.out.println("Gosta de: "+likes);
        System.out.println(sexo+" "+name+" "+"gosta de"+" "+likes+" "+"e tem"+" "+age+" "+"anos");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );

        showtext(10, "João", "programar", true);
        System.out.println("");
        showtext2(4, "Joaninha", "pizza", false);
        String in;
        System.out.println("Close?");

        in = scan.nextLine();

        if (in.equalsIgnoreCase("y")) {
            System.out.println("Closing");
        } else {
            System.out.println("Closing");
        }

    }
}
    
