public class Departamento {
    private String name;
    private Empleado[] emples= new Empleado[10];
    private int ultimoEmpleadoIndice=-1;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setEmples(Empleado[] emples) {
        this.emples = emples;
    }

    public Departamento(String name) {
        this.name = name;
    }
    public void addEmp (Empleado e){
        if(ultimoEmpleadoIndice<emples.length){
            ultimoEmpleadoIndice++;
            emples[ultimoEmpleadoIndice]=e;
        }
    }
    public Empleado[] getEmples(){
        Empleado[]empleadosactuales= new Empleado[ultimoEmpleadoIndice];
        for (int i=0; i<empleadosactuales.length;i++){
            empleadosactuales[i]=emples[i];
        }
        return empleadosactuales;
    }
    public int getContadorEmpleados(){
        return ultimoEmpleadoIndice;
    }
    public Empleado getEmpleadoxId(int Id){
        for (Empleado emp: emples){
            if(emp.getID()==Id){
                return emp;
            }
        }
        return null;
    }
    public double salarioTotall(){
        double salarioTotal=0.0;
        for (int i=0; i<= ultimoEmpleadoIndice; i++){
            salarioTotal+= emples[i].getSalario();
        }
        return salarioTotal;
    }
    public double getSalarioPromedio(){
        if(ultimoEmpleadoIndice>-1){
            return salarioTotall()/(ultimoEmpleadoIndice+1);
        }
        return 0.0;
    }
    public String toString(){
        return this.name;
    }
}
