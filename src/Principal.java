
import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {
        
         String menu ="Selecccione una de las siguientes opciones:\n"
                    +"1 Rectangulo\n"
                    + "2 Circular\n"
                    + "3 Triangular\n"
                    + "4 Salir\n";
     
      
       int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
       
        switch (opcion){
            case 1:
                double base=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la base"));
                double altura=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la altura"));
                Rectangulo rec=new Rectangulo(base, altura);
                JOptionPane.showMessageDialog(null, "Rectangulo:\n Area: "+rec.area()+"\nPerimetro: "+rec.perimetro(),"Figuras Geometricas",JOptionPane.QUESTION_MESSAGE);
                break;
            case 2:
                 double radio=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese radio del circulo"));
                 Circulo rad=new Circulo(radio);
                 JOptionPane.showMessageDialog(null, "Circulo:\n Area: "+rad.area()+"\nPerimetro: "+rad.perimetro(),"Figuras Geometricas",JOptionPane.QUESTION_MESSAGE);
                break;
            case 3:
                double bas=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la base"));
                double altur=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la altura"));
                Triangulo tri=new Triangulo(bas, altur);
                JOptionPane.showMessageDialog(null, "Triangulo:\n Area: "+tri.area()+"\nPerimetro: "+tri.perimetro(),"Figuras Geometricas",JOptionPane.QUESTION_MESSAGE);
                break;
            case  4:
                System.exit(0);
                    break;
        }
    }
}
