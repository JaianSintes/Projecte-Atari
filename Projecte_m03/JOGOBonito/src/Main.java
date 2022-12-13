import javax.swing.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String opcio;
        String[] triarOpcio= {"minas","space Invaders", "atari"};

        opcio = (String) JOptionPane.showInputDialog(
                null, "Escull el Joc", "Jocs", 3,
                null, triarOpcio, triarOpcio[1]);

        switch (opcio){
            case "minas":
                break;

            case "space Invaders":
                break;

            case "atari":

                //VARIABLES
                int fila=43; //0
                int columna=25; //0
                int matriujoc[][]= new int[columna][fila];


                //INICIALITZAR TAULELL
                for (int i = 0; i < columna; i++) {
                    for (int j = 0; j < fila; j++) {
                        if(i==0 || i==columna-1)
                        matriujoc[i][j]=1;
                        else if(j==0 || j==fila-1)
                        matriujoc[i][j]=1;
                        else
                        matriujoc[i][j]=0;

                    }
                }


                //IMPRIMIR TAULELL
                for (int i = 0; i < columna; i++) {
                    for (int j = 0; j < fila; j++) {
                        if (matriujoc[i][j]==1)
                        System.out.print("#");
                        else   if (matriujoc[i][j]==0)
                            System.out.print(" ");
                    }
                    System.out.println();
                    //IMPRIMIR FILA PER FILA
                    Thread.sleep(200);
                }










                break;

            default:
                JOptionPane.showMessageDialog(null, "no has escollit res maquina", "bobo",0);
                break;

        }










        System.out.println("Hello world!");
    }
}