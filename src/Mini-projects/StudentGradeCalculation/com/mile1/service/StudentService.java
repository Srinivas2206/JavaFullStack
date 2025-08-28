package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {
    public int findNumberOfNullMarksArray(Student[] s) {
        int count = 0;
        for (Student st : s) {
            try {
                st.getMarks();
            } catch (Exception e) {
                count++;
            }
        }

        return count;
    }

    public int findNumberOfNullName(Student[] s) {
        int count = 0;
        for (Student st : s) {
            try {
                st.getName();
            } catch (Exception e) {
                count++;
            }
        }

        return count;
    }

    public int findNumberOfNullObjects(Student[] s) {
        int count = 0;
        try {
            for (Student st : s) {
                if (st == null) {
                    count += 1;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return count;
    }
}
