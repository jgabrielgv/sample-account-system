public class AccountFacade {

    private final IAccountService accountService;
    private final IEmailService emailService;
    
        public AccountFacade(IAccountService accountService, IEmailService emailService) {
            this.accountService = accountService;
            this.emailService = emailService;
        }

    public void changePassword(String userId, String newPassword) {
        accountService.changePassword(userId, newPassword);
        emailService.email(userId, "Cambio de clave", "Importante: cambio de clave realizado");
    }
}