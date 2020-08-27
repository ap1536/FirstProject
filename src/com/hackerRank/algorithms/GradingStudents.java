/*
  HackerLand University has the following grading policy:

  Every student receives a  in the inclusive range from  to .
  Any  less than  is a failing grade.
  Sam is a professor at the university and likes to round each student's  according to these rules:

  If the difference between the  and the next multiple of  is less than , round  up to the next multiple of .
  If the value of  is less than , no rounding occurs as the result will still be a failing grade.
  For example,  will be rounded to  but  will not be rounded because the rounding would result in a number that is less than .

  Given the initial value of  for each of Sam's  students, write code to automate the rounding process.

  Function Description

  Complete the function gradingStudents in the editor below. It should return an integer array consisting of rounded grades.

  gradingStudents has the following parameter(s):

  grades: an array of integers representing grades before rounding
  Input Format

  The first line contains a single integer, , the number of students.
  Each line  of the  subsequent lines contains a single integer, , denoting student 's grade.

  Constraints

  Output Format

  For each , print the rounded grade on a new line.

  Sample Input 0

  4
  73
  67
  38
  33
  Sample Output 0

  75
  67
  40
  33
  Explanation 0

  Student 1 received a 73, and the next multiple of 5 from 73 is 75. Since 75-73 < 3, the student's grade is rounded to 75.
  Student 2 received a 67, and the next multiple of 5 from 67 is 70. Since 70-67 = 3, the grade will not be modified and the student's final grade is 67.
  Student 3 received a 38, and the next multiple of 5 from 38 is 40. Since 40-38 < 3, the student's grade will be rounded to 40.
  Student 4 received a grade below 38, so the grade will not be modified and the student's final grade is 33.
 */
package com.hackerRank.algorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        for (int i = 0; i < grades.size(); i++) {
            if(grades.get(i) > 37){
                int originalGrade = grades.get(i);
                int newGrade = ((grades.get(i) + 5) / 5) * 5;
                grades.set(i, (newGrade-originalGrade < 3)?newGrade:originalGrade);
            }
        }
        return grades;
    }
}

public class GradingStudents {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int gradesCount = Integer.parseInt(obj.nextLine().trim());
        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> obj.nextLine().replaceAll("\\s+$", "")).map(String::trim)
          .map(Integer::parseInt)
          .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);
        System.out.println(result.stream().map(Objects::toString).collect(joining("\n"))+"\n");
    }
}
