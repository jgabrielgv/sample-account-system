public class Main {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();

        AccountFacade facade = new AccountFacade(accountService);

        facade.changePassword("testuserid", "newfield");
    }
}
