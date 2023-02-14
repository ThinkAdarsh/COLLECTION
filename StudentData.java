package Custom_Exception;

import java.util.ArrayList;
import java.util.List;

public class StudentData {

    List<String> student=new ArrayList<>();
    public void addStudent(String name)
    {
        if(student.contains(name))
        {
            throw  new userException("name is already present in the list");
        }
        else {
            student.add(name);
            System.out.println(name);
        }
    }

    public static void main(String[] args) {

        StudentData ob=new StudentData();

        try{
            ob.addStudent("aj");
            ob.addStudent("Dj");
            ob.addStudent("aj");
        }catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
