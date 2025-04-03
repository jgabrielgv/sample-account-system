public class Main {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        LogService logService = new LogService();
        EmailService emailService = new EmailService();

        AccountFacade facade = new AccountFacade(accountService, logService, emailService);

        facade.changePassword("testuserid", "newfield");
    }
}
