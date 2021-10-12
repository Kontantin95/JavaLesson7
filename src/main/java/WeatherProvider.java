
import java.io.IOException;

public class WeatherProvider {
    public interface WeatherProvider {

        void getWeather(Periods periods) throws IOException;

    }
}
