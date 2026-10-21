class Employee {
    String name;
    double Salary;
    int hiredate;
    
    int YearsOfService(int date) {
        int currentYear = 2026;
        hiredate = currentYear - date;
        return hiredate;
    }
    
    void display() {
        System.out.println("Name : " + name);
        System.out.println("Salary : " + Salary);
        System.out.println("Years Of Service : " + hiredate);
    }
    
    public static void main(String args[]) {
        Employee e = new Employee();
        
        e.name = "Om Ritesh";
        e.Salary = 55000;
        e.YearsOfService(2021);
        
        System.out.println("Employee Details:");
        e.display();
    }
}