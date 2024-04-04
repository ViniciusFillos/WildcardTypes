package application;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Object> myObjs = new ArrayList<>();
        List<Integer> myNumbers = new ArrayList<>();

        myObjs = myNumbers;
    }
}
