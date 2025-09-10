public class HRApp {
    public static void main(String[] args) {
        System.out.println("Arranca la app");
        Empleado e1= new Empleado(250,"nehu",675456);
        Empleado e2= new Empleado(251,"nehuen",675457);
        System.out.println("Emp"+ e1);
        System.out.println("Emp"+ e2);
        Departamento d1= new Departamento("Educacion");
        d1.addEmp(e1);
        d1.addEmp(e2);
        Empleado[] emps= d1.getEmples();
        for(Empleado emp:emps){
            System.out.println("Emp: "+ emp);

        }
        System.out.println("total:" + d1.salarioTotall());
    }
}
