package emailValidator;
import static emailValidator.EmailValidator.isEmail;

public class Client {
    /* Suponha que é necessário trocar o método de validação de email ou este método não satisfaz todos
    *  os casos necessários, em todas as classes que usam este validador, teremos um problema.
     */
    public static void main(String[] args) {
        String email = "test@gmail.com";

        if(isEmail(email)){
            System.out.println("Email válido");
        }else {
            System.out.println("Email inválido");
        }
    }
}
