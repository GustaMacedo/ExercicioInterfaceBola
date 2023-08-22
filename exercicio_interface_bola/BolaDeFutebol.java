public class BolaDeFutebol extends Bola {
   


    public String getNomeDaMarca( ){
        return nome_da_marca;
   }
   
    public  BolaDeFutebol(String nome_da_marca){
        super(nome_da_marca);
           
    }

    public void lancar(){
          System.out.println("ela vai rapido");
    }


    public void quicar(){

    }
}
