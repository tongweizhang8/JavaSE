package junit;

import domain.Employee;
import org.testng.annotations.Test;
import service.NameListService;
import service.TeamException;

/**
 * 對NameListService類的測試
 */
public class NameListServiceTest {
    @Test
    public void testGetAllEmployees() throws Exception {
        NameListService service = new NameListService();
        Employee[] employee = service.getAllEmployees();
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }
    @Test
    public void testGetEmployee(){
        NameListService service = new NameListService();
        int id  = 1;
        try {
            Employee employee = service.getEmployee(id);
            System.out.println(employee);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }

}
