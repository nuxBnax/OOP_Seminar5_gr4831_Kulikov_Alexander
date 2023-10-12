package Service;

import model.Functions;
import view.CalculationView;
import view.Text;

import java.util.Scanner;


public class Operations {
    public  Functions functions = new Functions();

    CalculationView print = new CalculationView();
    /** subMenu() - Функция предоставляет выбрать операцию с числами
     /* (сложение, вычитание, умножение, деление)
     */
    public void subMenu() {
        Scanner cs = new Scanner(System.in);
        Text.chooseOperation();
        Text.allOperations();

        int oper = cs.nextInt();
//        cs.nextLine();

        switch (oper) {
            case 1 -> {

                Text.sumAB();
                Text.inputNumberA();
                double numA = cs.nextDouble();
                Text.inputNumberB();
                double numB = cs.nextDouble();
                functions.writeHistory(functions.dateTime() +
                        functions.sum(numA, numB));
                print.printResult(functions.sum(numA, numB));
                Text.loadedToHistory();
            }
            case 2 -> {
                Text.subtractionAB();
                Text.inputNumberA();
                double numA = cs.nextDouble();
                Text.inputNumberB();
                double numB = cs.nextDouble();
                functions.writeHistory(functions.dateTime() +
                        functions.subtraction(numA, numB));
                print.printResult(functions.subtraction(numA, numB));
                Text.loadedToHistory();
            }
            case 3 -> {
                Text.multiplicationAB();
                Text.inputNumberA();
                double numA = cs.nextDouble();
                Text.inputNumberB();
                double numB = cs.nextDouble();
                functions.writeHistory(functions.dateTime() +
                        functions.multiplication(numA, numB));
                print.printResult(functions.multiplication(numA, numB));
                Text.loadedToHistory();
            }
            case 4 -> {
                Text.divisionAB();
                Text.inputNumberA();
                double numA = cs.nextDouble();
                Text.inputNumberB();
                double numB = cs.nextDouble();
                functions.writeHistory(functions.dateTime() +
                        functions.division(numA, numB));
                print.printResult(functions.division(numA, numB));
                Text.loadedToHistory();
            }
            default -> Text.noThatNumber();
        }

    }
    /** subMenu() - Функция предоставляет выбрать операцию с комплексными числами
     /* (сложение, вычитание, умножение, деление)
     */
    public void subMenuComplex() {
        Scanner cs = new Scanner(System.in);
        Text.chooseComplexOperation();
        Text.allOperations();

        int oper = cs.nextInt();
        int numA;
        int numB;
        int numA2;
        int numB2;
        switch (oper) {
            case 1 -> {
                Text.complexSumAB();
                Text.inputNumberA();
                numA = cs.nextInt();
                Text.inputNumberB();
                numB = cs.nextInt();
                Text.inputNumberA2();
                numA2 = cs.nextInt();
                Text.inputNumberB2();
                numB2 = cs.nextInt();
                functions.writeHistory(functions.dateTime() +
                        functions.sumComplex(numA, numB, numA2, numB2));
                print.printResult(functions.sumComplex(numA, numB, numA2, numB2));
                Text.loadedToHistory();
            }
            case 2 -> {
                Text.complexSubtractionAB();
                Text.inputNumberA();
                numA = cs.nextInt();
                Text.inputNumberB();
                numB = cs.nextInt();
                Text.inputNumberA2();
                numA2 = cs.nextInt();
                Text.inputNumberB2();
                numB2 = cs.nextInt();
                functions.writeHistory(functions.dateTime() +
                        functions.subtractionComplex(numA, numB, numA2, numB2));
                print.printResult(functions.subtractionComplex(numA, numB, numA2, numB2));
                Text.loadedToHistory();
            }
            case 3 -> {
                Text.complexMultiplicationAB();
                Text.inputNumberA();
                numA = cs.nextInt();
                Text.inputNumberB();
                numB = cs.nextInt();
                Text.inputNumberA2();
                numA2 = cs.nextInt();
                Text.inputNumberB2();
                numB2 = cs.nextInt();
                functions.writeHistory(functions.dateTime() +
                        functions.multiplicationComplex(numA, numB, numA2, numB2));
                print.printResult(functions.multiplicationComplex(numA, numB, numA2, numB2));
                Text.loadedToHistory();
            }
            case 4 -> {
                Text.complexDivisionAB();
                Text.inputNumberA();
                numA = cs.nextInt();
                Text.inputNumberB();
                numB = cs.nextInt();
                Text.inputNumberA2();
                numA2 = cs.nextInt();
                Text.inputNumberB2();
                numB2 = cs.nextInt();
                functions.writeHistory(functions.dateTime() +
                        functions.divisionComplex(numA, numB, numA2, numB2));
                print.printResult(functions.divisionComplex(numA, numB, numA2, numB2));
                Text.loadedToHistory();
            }
            default -> Text.noThatNumber();
        }

    }
}
