package collection;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        List<String> teacherNames = new ArrayList<>();
        teacherNames.add("T1");
        teacherNames.add("T2");
        teacherNames.add("T3");

        List<String> studentNames = new ArrayList<>();
        studentNames.add("S1");
        studentNames.add("S2");
        studentNames.add("S3");

        List teacherStudentList = new ArrayList();
        teacherStudentList.add(teacherNames);
        teacherStudentList.add(studentNames);

        Map<String, List> schoolMap = new HashMap<>();
        schoolMap.put("MariesSchool",teacherStudentList);
//        schoolMap.put("PeterSchool","");
//        schoolMap.put("StJonesSchool","");
        //TODO: Assignment...
    // given the schoolMap object..print all the teachers name ????
//        schoolMap.get("MariesSchool")

//        Hashtable
        Map<String,String> nameAddress = new HashMap<>();
        nameAddress.put("Peter","St. Jose Lane"); // any key , any value
        nameAddress.put("Ram","Gandhi Lane");
        nameAddress.put("Saun","Box Lane");
        nameAddress.put("Saun","Box Lane 2");

        System.out.println(nameAddress.get("Peter"));

        System.out.println(nameAddress);
    }
}
