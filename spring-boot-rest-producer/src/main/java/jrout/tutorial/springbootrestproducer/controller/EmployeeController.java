package jrout.tutorial.springbootrestproducer.controller;

import jrout.tutorial.springbootrestproducer.pojo.Address;
import jrout.tutorial.springbootrestproducer.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EmployeeController {

//    @Autowired
    // Service Layer;

    private static Map<Integer, Employee> employeeMap = new HashMap<>();
    static {
        Employee employee1 = new Employee(100,"Peter",new Address("Addres1","City1","State1","Coutry1",345678));
        Employee employee2 = new Employee(102,"Pan",new Address("Addres2","City2","State2","Coutry1",345678));

        employeeMap.put(100, employee1);
        employeeMap.put(102, employee2);
    }

    // http://localhost/fetchemployee?id=100
    // http://localhost/fetchemployee/100/30
//    @GetMapping("/fetchemployee/{id}")

    @GetMapping("/employee")
//    @RequestMapping(value = "/fetchemployee" ,method = RequestMethod.GET)
    public Employee fetchEmployee(@RequestParam(value = "id") int id){
        System.out.println("FetchEmployee : id = " + id);
        Employee employee = employeeMap.get(id);
        return employee;
    }

    @DeleteMapping("/employee")
//    @RequestMapping(value = "/fetchemployee" ,method = RequestMethod.DELETE)
    public String deleteEmployee(@RequestParam(value = "id") int id){
        System.out.println("Detele id = " + id);
        employeeMap.remove(id);
        return "Employee deleted...";

    }

    @GetMapping("/employee/all")
    public Map fetchAllEmployee(){
        return employeeMap;
    }

    // GET PUT DELETE POST
    // GET : Get some information
    // DELETE : Delete and Employee
    // POST : Create an Employee
    // PUT : Update and employee

}
