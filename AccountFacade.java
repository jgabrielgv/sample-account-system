public class AccountFacade {

    private final IAccountService accountService;
    private final ILogService logService;
    private final IEmailService emailService;
        
    public AccountFacade(IAccountService accountService, ILogService logService, IEmailService emailService) {
        this.accountService = accountService;
        this.logService = logService;
        this.emailService = emailService;
    }

    public void changePassword(String userId, String newPassword) {
        accountService.changePassword(userId, newPassword);
        logService.logInformation(userId, "Cambio de clave exitoso");
        emailService.email(userId, "Cambio de clave", "Importante: cambio de clave realizado");
    }
}