import java.io.*;


public class Combate {

    private Personaje p1;
    private Personaje p2;
    private int turno = 1;
    BufferedReader buffer;

    Combate(Personaje p1, Personaje p2){
        buffer = new BufferedReader(new InputStreamReader(System.in));
        this.p1 = p1;
        this.p2 = p2;
        
        
    }

    public void SistemaLineal(Personaje p1, Personaje p2){
        int op;
        while(validar(p1, p2)){
            if(turno==1){
                
            }

            try{
                System.out.println("Hola "+p1.getNombre() +"selecciona el ataque que quieres utilizar: ");
                System.out.println("||1.-"+p1.getAtaques()[0].getNombre());
                System.out.println("||2.-"+p1.getAtaques()[1].getNombre());
                System.out.println("||3.-"+p1.getAtaques()[2].getNombre());
                System.out.println("||4.-"+p1.getAtaques()[3].getNombre());
    
                op = Integer.parseInt(buffer.readLine());
    
    
    
            }catch(IOException e){
                System.out.println("||                                                                       ||");
                System.out.println("||Error de lectura desde el teclado...                                   ||");
                System.out.println("||                                                                       ||");
            }

        }
       

    }

    public boolean validar (Personaje p1, Personaje p2){
        boolean a = false;
        if (p1.getVida()<=0 && p2.getVida()<=0){
            a = true;
            
        }
        return a;
    }
    
}
