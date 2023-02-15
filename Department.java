import java.util.ArrayList;
import java.util.Collections;

public class Department {
    private ArrayList<Student> students;

    private int generateID;
    private String designation;
    private String[] directions = {"ПМиИ", "ИВТ", "Кибербезопасность"};


    {
        generateID = 1;
        designation = "МиКН";
    }

    Department(){
        students = new ArrayList<>();
    }

    public void matriculation(String surname, String name, boolean gender, int course, String group, String direction){
        Student student = new Student(surname, name, gender, course, group, direction, designation, generateID++);
        students.add(student);
    }

    private int findStudent(String surName, String name, int course, String group)
    {
        if (students.isEmpty())
            return -1;
        int index = 0;
        for(Student student: students)
            if (student.getLastName().equals(surName)   &&
                student.getFirstName().equals(name)     &&
                student.getYearStudy() == course        &&
                student.getGroup().equals(group))
                return index;
        return -1;
    }

    public void expulsion(String surName, String name, int course, String group)
    {
        int searchvalue = findStudent(surName, name, course, group);
        if( searchvalue > -1)
            students.remove(searchvalue);
        else System.out.println("Отчисление студента невозможно");
    }

    public ArrayList<Student> groupList(String group, ArrayList<Student> list)
    {
        if (list.isEmpty()) return null;
        ArrayList<Student> filter = new ArrayList<>();
        for(Student s: list)
        {
            if(s.getGroup().equals(group))
                filter.add(s);
        }
        return filter;
    }

    public ArrayList<Student> courseList(int course, ArrayList<Student> list)
    {
        if (list.isEmpty()) return null;
        ArrayList<Student> filter = new ArrayList<>();
        for(Student s: list)
        {
            if(s.getYearStudy() == course)
                filter.add(s);
        }
        return filter;
    }

    public void studentsListalphabetical(){
        System.out.println("Список студентов факультета ");
        ArrayList<Student> toPrint = sortResult(students);
        for(Student st: toPrint)
            System.out.println(" " + st.getInfo());
    }


    public void studentsList(){
        System.out.println("Список студентов факультета ");
        for (int i=1; i<=4; i++) {
            ArrayList<Student> byСourses = courseList(i, students);
            if (byСourses.isEmpty()) continue;
            System.out.println("  " + i + " курс");
            for(int gr = 0; gr < directions.length; gr++) {
                ArrayList<Student> byGroups = groupList(directions[gr], byСourses);
                if (byGroups.isEmpty()) continue;
                System.out.println("   направление " + directions[gr]);
                ArrayList<Student> toPrint = sortResult(byGroups);
                for(Student st: toPrint)
                    System.out.println("     " + st.toString());
            }
        }
    }

    public ArrayList<Student> sortResult(ArrayList<Student> list)
    {
        boolean obmen = true;
        int n = students.size();
        int k = 0;
        for (; k < n - 1 && obmen; k++)
        {
            obmen = false;
            for(int i = 0; i < n - k - 1; i++)
            {
                String prev = list.get(i).getLastName();
                String next = list.get(i+1).getLastName();
                if ( prev.compareTo(next) > 0)
                {
                    Collections.swap(list, i, i + 1);
                    obmen = true;
                }
            }
        }
        return list;
    }
}
