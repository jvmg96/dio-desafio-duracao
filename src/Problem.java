import java.util.Scanner;

class Problem {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int inicio, fim, horas;
        inicio = scan.nextInt();
        fim = scan.nextInt();
        horas = fim - inicio;

        if(horas == 0){
            System.out.print("O JOGO DUROU 24 HORA(S)\n");
        }else if(horas < 0){
            System.out.print("O JOGO DUROU "+(24 + horas)+" HORA(S)\n");
        }else{
            System.out.print("O JOGO DUROU "+horas+" HORA(S)\n");
        }
    }
}