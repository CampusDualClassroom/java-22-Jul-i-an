package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {
    private static List<String> stringList;

    public static List<String> createArrayList() {
        stringList = new ArrayList<String>(0);

        addElementToList(stringList, "GKFFD");
        addElementToList(stringList, "TNANA");
        addElementToList(stringList, "MPMSL");
        addElementToList(stringList, "PSWME");
        addElementToList(stringList, "LZMLF");
        addElementToList(stringList, "JYEBV");
        addElementToList(stringList, "YELNT");
        addElementToList(stringList, "JSNKR");
        addElementToList(stringList, "JFESF");
        addElementToList(stringList, "TMJLL");

        return stringList;

    }

    public static void printElementsAndIndex(List<String> customList) {
        for(int i = 0; i < customList.size(); i++){
            System.out.println(customList.get(i) + "->" + i);
        }
    }

    public static boolean addElementToList(List<String> customList, String element) {
        return customList.add(element);
    }

    public static void main(String[] args) {

        stringList = createArrayList();

        addElementToList(stringList, "AAAAA");

        printElementsAndIndex(stringList);

    }


}
