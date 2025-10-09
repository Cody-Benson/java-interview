public class EmployeeRepository {
    public EmployeeRepository(){};

    public Employee findEmployee(int id){
        return new Employee(id);
    }
}
