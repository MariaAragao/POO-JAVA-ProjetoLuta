
package ultraemojicombate;

import java.util.Random;

/**
 *
 * @author eduar
 */
public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Métodos Públicos
    public void marcarLuta(Lutador l1, Lutador l2){
       if((l1.getCategoria() == l2.getCategoria())
       && l1!= l2){
          this.aprovada = true;
          this.desafiado = l1;
          this.desafiante = l2;
           
       }else{
           this.aprovada = false;
           this.desafiado =  null;
           this.desafiante = null;
       }
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("### DESAFIO ###");
           this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
           this.desafiante.apresentar();
           
           Random aleatorio = new Random();
           
           int vencedor = aleatorio.nextInt(3);
            System.out.println("==== RESULTADO LUTA ====");
           switch(vencedor){
               case 0: // Emapate
                   System.out.println("Emapatou!");
                   this.desafiado.empatarLuta();
                   this.desafiante.empatarLuta();
                   break;
                   
               case 1: //Desafiado vence
                   System.out.println("Vitória do " + this.desafiado);
                   this.desafiado.ganharLuta();
                   this.desafiante.perderLuta();
                   break;
               case 2:  //Desafiante vence 
                   System.out.println("Vitória do " + this.desafiante);
                   this.desafiante.ganharLuta();
                   this.desafiado.perderLuta();
                   break;
           }
            System.out.println("==============");
        }else{
            System.out.println("A luta não pode acontecer!");
        }
    }

    //Métodos Espciais
    
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
