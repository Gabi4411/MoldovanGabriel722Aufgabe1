package org.example;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.commons.csv.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

class Helper<T extends  Archiv> {
    List<T> elements;

    public Helper() {
        this.elements = new ArrayList<>();
    }

    public void addElement(T element) {
        elements.add(element);
    }

    public List<T> getAllElements() {
        return new ArrayList<>(elements);
    }

    public void readFromXml(String filename, Class<T[]> clazz) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        T[] dataArray = xmlMapper.readValue(new File(filename), clazz);
        elements.addAll(List.of(dataArray));
    }

//    public List<String> filter(int number) {
//        return elements.stream()
//                .map(T::getGlobalerEinfluss)
//                .filter(globalerEinfluss -> globalerEinfluss > number)
//                .forEach(n -> System.out::println(n.getHeld()));
//    }
}

public class Main {
    public static void main(String[] args) {
        String xmlFile = "src/main/resources/marvel_konfruntationen.xml";

        Helper<Archiv> helper = new Helper<>();
        System.out.println(helper.elements);
    }
}