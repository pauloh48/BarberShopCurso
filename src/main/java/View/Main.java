package View;
import Model.Cliente;
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
        Cliente cliente = new Cliente(1, "Paulo", 'M', "000000000", "R. 10");
        Usuario user = new Usuario(0, "Paul", "P123");
        
        System.out.println(cliente.toString());
        System.out.println(user.toString());
        
       
        //System.out.printf("%s %.2f", servico.getDescricao(), servico.getValor());
    }
}
