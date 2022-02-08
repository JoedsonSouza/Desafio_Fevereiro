import java.util.Scanner;

public class Notas {
    Scanner scan = new Scanner(System.in);
    private double nota1;
    private double nota2;
    private double media;

    public Notas(){
        
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;    
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void media(){
        this.media = (this.getNota1() + this.getNota2()) / 2;
    }

    //MÉTODOS PERSONALIZADOS

    public boolean verificaNota1(double nota1){
        if (nota1 < 0 || nota1 > 10) {
            System.out.println("Nota inválida!");
            return false;    
        }else{
            this.setNota1(nota1);
            return true;
        }
    }

    public boolean verificaNota2(double nota2){
        if (nota2 < 0 || nota2 > 10) {
            System.out.println("Nota inválida!");
            return false;    
        }else{
            this.setNota2(nota2);
            return true;
        }
    }

    public void menu(){
        System.out.println("\n\n::::::< NOVO CÁLCULO >::::::");
        System.out.println("[1] SIM");
        System.out.println("[2] NÃO");
        System.out.print("OPÇÃO ESCOLHIDA: ");
    }

    public void receberNotas(){
        boolean v1, v2;
        int x;

        do {

            do {
                System.out.print("Digite a primeira nota: ");
                v1 = verificaNota1(scan.nextDouble());    
            } while (v1 == false);
            
            do {
                System.out.print("Digite a segunda nota: ");
                v2 = verificaNota2(scan.nextDouble());    
            } while (v2 == false);
            
            media();
            System.out.printf("media = %.2f", getMedia());
            menu();
            x = scan.nextInt();

        } while (x == 1);        
    }
}
