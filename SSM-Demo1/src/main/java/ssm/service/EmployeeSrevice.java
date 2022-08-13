package ssm.service;

import com.github.pagehelper.PageInfo;
import ssm.pojo.Employee;

import java.util.List;

public interface EmployeeSrevice {
    List<Employee> getAllEmployee();

    void deleteEmployee(Integer id);

    Employee getEmployee(Integer id);

    void save(Employee employee);

    void addEmployee(Employee employee);

    PageInfo<Employee> getEmployeeList(Integer pageNum);
}
