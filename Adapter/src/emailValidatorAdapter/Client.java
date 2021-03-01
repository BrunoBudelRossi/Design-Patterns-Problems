package emailValidatorAdapter;

public interface Client {
    public static void main(String[] args) {
        String email = "test@gmail.com";
        EmailValidatorAdapter validator = new EmailValidatorAdapter();

        if(validator.isEmail(email)){
            System.out.println("Email válido");
        }else {
            System.out.println("Email inválido");
        }
    }
}
