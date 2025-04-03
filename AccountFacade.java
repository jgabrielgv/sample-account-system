public class AccountFacade {

    private final IAccountService accountService;
    private final ILogService logService;
    
        public AccountFacade(IAccountService accountService, ILogService logService) {
            this.accountService = accountService;
            this.logService = logService;
    }

    public void changePassword(String userId, String newPassword) {
        accountService.changePassword(userId, newPassword);
        logService.logInformation(userId, "Cambio de clave exitoso");
        // email
    }
}