public class Personaje {
    private int id;
    private String nombre;
    private Ataque [] ataques = new Ataque[4];

    Personaje(int id, String nombre, int [] list){
        this.id = id;
        this.nombre = nombre;

        for (int i=0; i<list.length; i=i+1){
            ataques[i] = buscador(list[i]);
        }
        

    }


    public String getNombre(){
        return nombre;
    }

    public int getId(){
        return id;
    }

    public Ataque buscador(int a)
    {
        Ataque ataque = new Ataque (0, " ", 0, 0); 

        for(int i=0 ; i<SetupAtaques.listaAtaque.length ; i=i+1) {
            if (a == SetupAtaques.listaAtaque[i].getId()){
                return SetupAtaques.listaAtaque[i];
            }
        }
        
        return null;

    }
    public Ataque [] getAtaques(){
        return ataques;
    }

    public String devolverAtaques(){
        String a;
        a = ("Los ataques son: "+ ataques[0].getNombre() +" " +ataques[1].getNombre() +" " +ataques[2].getNombre() +" " +ataques[3].getNombre() );

        return a;
    }
}
