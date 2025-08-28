package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {

    public String findGrades(Student studentObject) {
        int[] marks = studentObject.getMarks();
        int marksSum = 0;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 35) {
                return "F";
            } else {
                marksSum += marks[i];
            }
        }

        if (marksSum < 150)
            return "C";
        else if (marksSum >= 150 && marksSum < 200)
            return "B";
        else if (marksSum >= 200 && marksSum < 250)
            return "A";
        else
            return "A+";
    }

    public String validate(Student s) throws NullNameException, NullMarksArrayException, NullStudentObjectException {
        if (s == null) {
            throw new NullStudentObjectException();
        } else if (s.getName() == null) {
            throw new NullNameException();
        } else if (s.getMarks() == null) {
            throw new NullMarksArrayException();
        } else {
            return findGrades(s);
        }
    }
}
