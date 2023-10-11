package model;

import java.util.ArrayList;

public interface Data {
    String sum(Number numberA, Number numberB);
    String subtraction(Number numberA, Number numberB);
    String division(Number numberA, Number numberB);
    String multiplication(Number numberA, Number numberB);
    String dateTime();

    void writeHistory(String result);

    void readHistory();
}
