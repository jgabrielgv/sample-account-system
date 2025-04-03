public class AccountService implements IAccountService {
    @Override
    public void changePassword(String userId, String newPassword) {
        System.out.println(String.format("Cambio de clave exitoso para el usuario %s", userId));
    }
}
