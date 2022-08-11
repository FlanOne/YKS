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

    public void SistemaLineal(){
        int op;
        while(validar(p1, p2)){
            if(turno==1){
                causarDano(p1,p2);

                turno = 0;
                if(p2.getVida()<=0){
                    break;
                }
            }

            if(turno==0){
                causarDano(p2,p1);

                turno = 1;
            }

            

        }

        victoria(p1, p2);
       

    }

    public boolean validar (Personaje p1, Personaje p2){
        boolean a = false;
        if (p1.getVida()>0 && p2.getVida()>0){
            a = true;
            
        }
        return a;
    }

    public void causarDano(Personaje p1, Personaje p2){
        int op;
        try{
            
            System.out.println("Hola "+p1.getNombre() +"selecciona el ataque que quieres utilizar: ");
            System.out.println("||1.-"+p1.getAtaques()[0].getNombre());
            System.out.println("||2.-"+p1.getAtaques()[1].getNombre());
            System.out.println("||3.-"+p1.getAtaques()[2].getNombre());
            System.out.println("||4.-"+p1.getAtaques()[3].getNombre());

            op = Integer.parseInt(buffer.readLine());

            switch(op){
                case 1: p2.setVida(p2.getVida() - p1.getAtaques()[0].getDamage()); break;

                case 2: p2.setVida(p2.getVida() - p1.getAtaques()[1].getDamage()); break;

                case 3: p2.setVida(p2.getVida() - p1.getAtaques()[2].getDamage()); break;

                case 4: p2.setVida(p2.getVida() - p1.getAtaques()[3].getDamage()); break;

            }



        }catch(IOException e){
            System.out.println("||                                                                       ||");
            System.out.println("||Error de lectura desde el teclado...                                   ||");
            System.out.println("||                                                                       ||");
        }
    }

    public void victoria(Personaje p1, Personaje p2){
        if (p1.getVida() > p2.getVida() && p2.getVida()<=0){
            System.out.println("FELICIDADES "+ p1.getNombre()+" GANASTE");
        }
        else if(p2.getVida() > p1.getVida() && p1.getVida()<=0) {
            System.out.println("FELICIDADES "+ p2.getNombre()+" GANASTE");
        }
    }
    
}
