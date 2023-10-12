package controller;

import Service.Operations;

import view.Text;

import java.util.Scanner;

public class Controller {

    /** menu() - Функция запускает меню с выбором
     *  вариантов вычислений с целыми, дробными или комплексными числами
     */
    public void menu() {

        Scanner cs = new Scanner(System.in);
        Operations operations = new Operations();

        boolean flag = true;
        while (flag) {
            Text.welcome();

            int num = cs.nextInt();


            switch (num) {
                case 1 -> operations.subMenu();
                case 2 -> operations.subMenuComplex();
                case 3 -> operations.functions.readHistory();
                case 4 -> flag = false;
                default -> Text.noThatNumber();
            }

        }

    }
}
