public class EmailService implements IEmailService {

    @Override
    public void email(String userId, String subject, String body) {
        System.out.println(String.format("Enviando correo para usuario %s con subject %s y cuerpo %s", userId, subject, body));
    }
    
}
