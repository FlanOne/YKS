import java.io.*;
public class Menu {
    private BufferedReader buffer;
    
    
     

     

    
    Menu(){
        buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Probando Menu");
         
        
        



        
        opciones();
    } 
    
    
    public void opciones(){
        int op;
        
        System.out.println("Seleccione las opciones que quiere utilizar: ");
        System.out.println("1 PARA VER QUE SE SAQUEN LA CHUCHA ");
        try{
            op= Integer.parseInt(buffer.readLine() );
            switch(op){
                case 1: Combate com = new Combate(Setup.perso1 , Setup.perso2); com.SistemaLineal();

            }

        }catch(IOException e){
            System.out.println("ERROR");
        }

        





    }
}
