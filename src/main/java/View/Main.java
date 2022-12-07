package View;
import Model.Agendamento;
import Model.Cliente;
import Model.Pessoa;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author PAULO
 */
public class Main {
    public static void main(String[] args){
        
        String nome = "Paulo";
        System.out.println(nome);
       
        Servico servico = new Servico(1, "Barba", 30);
        Cliente cliente = new Cliente(1, "Paulo", "R. teste", "00000000");
        Usuario user = new Usuario(0, "O cortador", "C123!");
        
        System.out.println(cliente.getNome());
        System.out.println(user.getNome());
        
        Agendamento agendamento = new Agendamento(0, cliente, servico, 40, "10/01/1999 10:25");
        
        
               
        //System.out.printf("%s %.2f", servico.getDescricao(), servico.getValor());
    }
}
