import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        model.setInitialBarriers(Constance.LOWER_BOUNDARY, Constance.UPPER_BOUNDARY);
        model.setSecretValue();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            int scanned = scanUserMessage(scanner, model.getMinBarrier(), model.getMaxBarrier());
            boolean isSecret = model.checkValue(scanned);
            if (isSecret) {
                view.printMessage(View.CONGRATULATION + model.getSecretValue());
                break;
            }
        }
    }

    private int scanUserMessage(Scanner scanner, int minPossibleValue, int maxPossibleValue) {
        view.printMessage(String.format(View.UNSUCCESSFUL_MESSAGE_PATTERN, minPossibleValue, maxPossibleValue));
        int value;
        while (true) {
            try {
                value = scanner.nextInt();
                if (value < minPossibleValue || value > maxPossibleValue) {
                    view.printMessage(View.WRONG_INPUT_INT_DATA);
                } else {
                    return value;
                }
            } catch (InputMismatchException exception) {
                view.printMessage(View.WRONG_INPUT_INT_DATA);
                scanner.nextLine();
            }
        }
    }
}
