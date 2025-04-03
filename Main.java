public class Main {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        EmailService emailService = new EmailService();

        AccountFacade facade = new AccountFacade(accountService, emailService);

        facade.changePassword("testuserid", "newfield");
    }
}
