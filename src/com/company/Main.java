package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("averageStuff.txt"));
        int maxindx = -1;
        String[] studentScores = new String[1000];
        while (input.hasNext()) {
            maxindx++;
            studentScores[maxindx] = input.nextLine();
        }
        input.close();
        StudentAverages[] students = new StudentAverages[1000];
        for (int j = 0; j < maxindx; j++) {
            students[j] = new StudentAverages(studentScores[j]);
            System.out.println(students[j].getAverage());

        }
    }
}
