package ssm.mappers;

import org.apache.ibatis.annotations.Param;
import ssm.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {
    public List<Employee> getAllEmployee();

    public Employee getEmployee(@Param("Id") Integer id);

    public void deleteEmployee(@Param("Id") Integer id);

    public void save(Employee employee);

    public void addEmployee(Employee employee);
}
