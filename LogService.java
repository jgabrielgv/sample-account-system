public class LogService implements ILogService {

    @Override
    public void logInformation(String userId, String message) {
        System.out.println(String.format("Escribiendo mensaje %s en logs para usuaro %s", message, userId));
    }

}
