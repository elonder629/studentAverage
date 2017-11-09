package com.company;

import java.util.Scanner;

/**
 * Created by el693 on 11/9/17.
 */
public class StudentAverages {
    public String Name;
    public double Average;
    public StudentAverages(String studentScores) {
        Scanner sc = new Scanner(studentScores);
        Name = sc.next();
        int total = 0;
        while(sc.hasNextInt()) {
            Average += sc.nextInt();
            total++;
        }
        Average /= total;

    }
    public String getAverage() {
        return Name + ", average = " + Average;
    }
}
