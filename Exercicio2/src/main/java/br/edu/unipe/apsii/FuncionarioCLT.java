package br.edu.unipe.apsii;

public class FuncionarioCLT extends Funcionario  {
    public Double valetransporte;
    public Double valerefeicao;
     public FuncionarioCLT (String nome, String matricula, Double salariobase, String dataadimissao,Double valetransporte, Double valerefeicao) {
         super(nome,matricula,salariobase,dataadimissao);
          this.valetransporte = valetransporte;
          this.valerefeicao = valerefeicao;
     }
     @Override
     public  double calcularSalario (){
         return super.calcularSalario()
                 +valerefeicao
                 +valetransporte;
     }

        @Override
        public double calcularDesconto (){
           return super.calcularDesconto() + 50.00;
        }
}
