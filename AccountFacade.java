public class AccountFacade {

    private final IAccountService accountService;
    
        public AccountFacade(IAccountService accountService) {
            this.accountService = accountService;
    }

    public void changePassword(String userId, String newPassword) {
        accountService.changePassword(userId, newPassword);
    }
}