package controller;

import Service.Operations;

import view.Text;

import java.util.Scanner;

import static Service.Operations.functions;

public class Controller {

    /** menu() - Функция запускает меню с выбором
     *  вариантов вычислений с целыми, дробными или комплексными числами
     */
    public static void menu() {

        Scanner cs = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            Text.welcome();

            int num = cs.nextInt();


            switch (num) {
                case 1:
                    Operations.subMenu();
                    break;
                case 2:
                    Operations.subMenuComplex();
                    break;
                case 3:
                    functions.readHistory();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    Text.noThatNumber();
                    break;
            }

        }

    }
}
