/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Employee;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Conjunction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author NC
 */
public class EmployeeDAO {

    public List<Employee> search() {
        Session session = connection.ConnectionBuilder.hibSession();
        Criteria criteria = session.createCriteria(Employee.class);
//        ---------------------------------------------------------
//        criteria.add(Restrictions.eq("lastname", "Perera"));
//        ---------------------------------------------------------
//        // Create a conjunction of conditions
//        Conjunction and = Restrictions.conjunction();
//
//        // Add conditions to the conjunction
//        and.add(Restrictions.eq("lastname", "Perera"));
//        and.add(Restrictions.gt("salary", 50000.00));
//
//        // Apply the conjunction to the criteria
//        criteria.add(and);

        List<Employee> list = criteria.list();

        return list;
    }

    public void createUser(String employeeno) {
        System.out.println("done");
    }

    public Employee getEmployeeById(int employeeId) {
        Session session = connection.ConnectionBuilder.hibSession();
        Criteria criteria = session.createCriteria(Employee.class);
        criteria.add(Restrictions.eq("id", employeeId));
        Employee employee = (Employee) criteria.uniqueResult();
        session.close();
        return employee;
    }
}

//public class EmployeeDAO {
//
//    public List<Employee> search() {
//        List<Employee> employees = null;
//        Session session = connection.ConnectionBuilder.hibSession();
//        Criteria criteria = session.createCriteria(Employee.class);
//        //        ---------------------------------------------------------
////        criteria.add(Restrictions.eq("lastname", "Perera"));
////        ---------------------------------------------------------
////        // Create a conjunction of conditions
////        Conjunction and = Restrictions.conjunction();
////
////        // Add conditions to the conjunction
////        and.add(Restrictions.eq("lastname", "Perera"));
////        and.add(Restrictions.gt("salary", 50000.00));
////
////        // Apply the conjunction to the criteria
////        criteria.add(and);
//        List<Employee> list = criteria.list();
//        for (Employee employee : list) {
////            System.out.println(employee.getFirstname());
////            System.out.println(employee.toString());
//            System.out.println(employee.getFirstname());
//
//        }
//
//        return employees;
//    }
//
////    @Override
////    public String toString() {
////        return "Employee [ID=" + getId() + ", First Name=" + getFirstname() + ", Last Name=" + getLastname() + ", Other Fields=" + getOtherFields() + "]";
////    }
//}
