package list;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("kofi");
        myList.add("duro");
        myList.add("baboni");
        myList.add("kwesi");
        myList.add("King");
        myList.add("Promise");

        System.out.println(myList);

        myList.remove("guyan");

        System.out.println(myList);
    }
}
