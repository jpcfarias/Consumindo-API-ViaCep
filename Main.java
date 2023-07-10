import java.io.IOException;
import java.util.Scanner;

import control.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        String cep;
        String json;
        
        Scanner scanner = new Scanner(System.in);
        
        cep = scanner.nextLine();

        scanner.close();

        try {
            json = controller.recebeApi(cep);
            controller.converteApiParaString(json);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
