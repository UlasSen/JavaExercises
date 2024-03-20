package Day3Exercises.Core.Logging;

public class FileLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Dosya gönderildi " + data);

    }
}
