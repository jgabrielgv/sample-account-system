public class Main {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        LogService logService = new LogService();

        AccountFacade facade = new AccountFacade(accountService, logService);

        facade.changePassword("testuserid", "newfield");
    }
}
