public class BolaDeBoliche extends Bola {
    

    public String getNomeDaMarca( ){
         return nome_da_marca;
    }

    public  BolaDeBoliche(String nome_da_marca){
       
        super(nome_da_marca);
           
    }

    public void lancar(){
          System.out.println("ela vai devagar");
    }


    public void quicar(){

    }
}
