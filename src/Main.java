import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;


class Record {
    private int id;
    private String patient;
    private  String symptom;
    private String diagnose;
    private Date date;
    private String krankenhaus;

    public Record(int id, String symptom, String patient, String diagnose, Date date, String krankenhaus) {
        this.id = id;
        this.symptom = symptom;
        this.patient = patient;
        this.diagnose = diagnose;
        this.date = date;
        this.krankenhaus = krankenhaus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKrankenhaus() {
        return krankenhaus;
    }

    public void setKrankenhaus(String krankenhaus) {
        this.krankenhaus = krankenhaus;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }
}

public class Main {
    public static void main(String[] args) {
       String filePath = "src/fallakten.tsv";

        try (Reader in = new FileReader(filePath)) {
            Iterable<Collectors> records = .TDF.withFirstRecordAsHeader().parse(in);
            System.out.println("TSV file read successfully:");
            for (CSVRecord record : records) {
                String name = record.get("Name");
                String age = record.get("Age");
                System.out.println("Name: " + name + ", Age: " + age);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}