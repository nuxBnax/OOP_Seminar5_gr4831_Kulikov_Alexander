package controller;

import Service.Operations;

import model.Functions;
import view.Text;

import java.util.Scanner;

import static Service.Operations.functions;

public class Controller {


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
        cs.close();
    }
}
