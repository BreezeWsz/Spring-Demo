package ssm.controller;

import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ssm.pojo.Employee;
import ssm.service.EmployeeSrevice;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeSrevice employeeSrevice;

    @RequestMapping(value = "/employee/page/{pageNum}",method = RequestMethod.GET)
    public String getEmployeebyPage(Model model,@PathVariable("pageNum") Integer pageNum) {
        PageInfo<Employee> page = employeeSrevice.getEmployeeList(pageNum);
        model.addAttribute("page",page);
        return "employee_list";
    }

    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public String getEmployeeList(Model model) {
        List<Employee> allEmployee = employeeSrevice.getAllEmployee();
        model.addAttribute("employeelist",allEmployee);
        return "employee_list";
    }

    @RequestMapping(value = "/employee/{id}",method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable("id") Integer Id) {
        employeeSrevice.deleteEmployee(Id);
        return "redirect:/employee/page/1";
    }

    @RequestMapping(value = "/employee/{id}",method = RequestMethod.GET)
    public String updateEmployee(Model model,@PathVariable("id") Integer id){
        Employee employee = employeeSrevice.getEmployee(id);
        model.addAttribute("employee",employee);
        return "employee_update";
    }

    @RequestMapping(value = "/employee",method = RequestMethod.PUT)
    public String saveEmployee(Employee employee) {
        if(employee.getEmpId() == null)
        employeeSrevice.addEmployee(employee);
        else{
            employeeSrevice.save(employee);
        }
        return "redirect:employee/page/1";
    }

    @RequestMapping(value = "/employeeAdd",method = RequestMethod.GET)
    public String employeeAdd() {
        return "employee_add";
    }

}
