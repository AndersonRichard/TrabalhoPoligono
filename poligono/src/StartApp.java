import java.util.Scanner;
//Alysson José de França
//Anderson Richard da Silva
public class StartApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digito = 0;
        int sair = 0;
        double calculo1 = 0;
        double calculo2 = 0;
        String A = "Quadrado";
        String B = "Hexágono";
        String C = "Retangulo";
        String D = "Triangulo";

        while (sair != 1){
            double area = 0;
            System.out.println(String.format("1. Polígono %s" , A));
            System.out.println(String.format("2. Polígono %s" , B));
            System.out.println(String.format("3. Polígono %s" , C));
            System.out.println(String.format("4. Polígono %s" , D));
            System.out.println("9. Sair");
            digito = sc.nextInt();
            if(digito == 1){
                System.out.println(String.format("Digite a base do %s" , A));
                calculo1 = sc.nextInt();
                area = Math.pow(calculo1,2);
                System.out.println(String.format("A área do %s é igual a: %.1f" ,A ,area));
            }else if (digito ==2){
                System.out.println(String.format("Digite o Lado do %s" , B));
                calculo1 = sc.nextInt();
                area =  (6*Math.pow(calculo1,2)*Math.sqrt(3)/4);//1.73205080756887729362772
                System.out.println(String.format("A área do %s é igual a: %.1f" ,B ,area));
            }else if (digito ==3){
                System.out.println(String.format("Digite a base do %s" , C));
                calculo1 = sc.nextInt();
                System.out.println(String.format("Digite a altura do %s" ,C));
                calculo2 = sc.nextInt();
                area = calculo1*calculo2;
                System.out.println(String.format("A área do %s é igual a: %.1f" ,C ,area));
            }else if (digito ==4){
                System.out.println(String.format("Digite a base do %s" , D));
                calculo1 = sc.nextInt();
                System.out.println(String.format("Digite a altura do %s" ,D));
                calculo2 = sc.nextInt();
                area = (calculo1*calculo2)/2;
                System.out.println(String.format("A área do %s é igual a: %.1f" ,D ,area));
            }else if (digito ==9){
                sair++;
            }else{
                System.out.println("Opção inválida! Por favor,digite uma opção correta!");
            }
            System.out.println();
        }
    }
}
