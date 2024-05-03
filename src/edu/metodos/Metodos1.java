package edu.metodos;

public class Metodos1 {
    public double somar (int num1, int num2){
        num1 = 3; 
        num2 = 4;
        
        double result = num1 + num2;

        return result;
    }
    

    public void imprimir (String texto){
        //logica
        //não precisa return
        //não terá retorno de resultado
    }


    //throws Exception: pode gerar uma exeção ao ser utilizado.
 // public double dividir (int dividendo, int divisor) throws Exception {}

    //Esse método não estará visível para as outras classes
    private void metodoPrivado(){}

    public void validar(){
        //Se o método vai validar, logo ele retorna algum valor
        // true or false
        //void não retorna valor
        // public boolean validar(){}
    }

 //    public void gravarCliente (String nome, String cpf ....){}
       // metodo com finalidade de gravar
       //informações do cliente, poruqe não criar um objeto cliente e passar como parâmetro?
       // veja abaixo
    

 //    public void gravarCliente(Cliente Cliente){}
    //ou
 //    public void gravar(Cliente Cliente){}




}
    