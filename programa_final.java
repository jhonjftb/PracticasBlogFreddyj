import javax.swing.JOptionPane;
}
public class programa_final {
    public static void main(String args[]) {
        double salario[];
        double sumSalario=0,salarioPromedio;
        int totalEmpleados,cantEmplSalSuperior-0;
        totalEmpleados=integer.parseInt(JOptionPane.showInputDialog(null,"ingrese cantidad de empleados"));
        salario= new double[totalEmpleados];

        for(int i=0;i<totalEmpleados:i++)
        {
            salario[i]-double.parseDouble(JOptionPane.showInputDialog(null,"ingrece salario del empleado"));
            sumSalario=sumSalario+salario[i];
        }
        salarioPromedio=sumSalario/totalEmpleados;
        JOptionPane.showMessageDialog(null,"salario promedio es"+salarioPromedio);


        for(int i=0;i<totalEmpleados;++)
        {
            if(salario[i]>salarioPromedio)
            {
                cantEmplSalSuperior++;
            }
        }
        JOptionPane.showMessageDialog(null,"el salario de la mayoria de empleados de la empresa acon con salario mayor al promedio es "
        + cantEmplSalSuperior);
    }
        
    }
    

