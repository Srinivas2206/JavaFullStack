package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {
    static Student data[] = new Student[10];

    StudentMain() {
        for (int i = 0; i < data.length; i++) {
            data[i] = new Student();
        }

        data[0] = new Student("Sekar", new int[] { 85, 75, 95 });
        data[1] = new Student(null, new int[] { 11, 22, 33 });
        data[2] = null;
        data[3] = new Student("Manoj", null);
        data[4] = new Student("John", new int[] { 90, 92, 80 }); // TC1
        data[5] = new Student("Bob", new int[] { 35, 40, 50 }); // TC2
        data[6] = new Student("Alice", new int[] { 25, 29, 28 }); // TC3
        data[7] = null; // TC4
        data[8] = new Student(null, new int[] { 25, 29, 28 }); // TC5
        data[9] = new Student("Arnold", null); // TC6
    }

    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        StudentReport studentReport = new StudentReport();
        StudentMain studentMain = new StudentMain();

        System.out.println("Grade Calculation ");
        String grade = null;

        for (int i = 0; i < StudentMain.data.length; i++) {
            try {
                grade = studentReport.validate(StudentMain.data[i]);
                System.out.println("Grade: " + grade);
            } catch (NullNameException e) {
                e.printStackTrace();
            } catch (NullMarksArrayException e) {
                e.printStackTrace();
            } catch (NullStudentObjectException e) {
                e.printStackTrace();
            }

        }

        System.out.println(
                "Number of Objects with marks array as null: "
                        + studentService.findNumberOfNullMarksArray(StudentMain.data));
        System.out.println(
                "Number of Objects with name as null: " + studentService.findNumberOfNullName(StudentMain.data));
        System.out.println("Number of Objects that are entirely null: "
                + studentService.findNumberOfNullObjects(StudentMain.data));
    }
}
