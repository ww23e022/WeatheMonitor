package fh.slm.weathermonitor.Monitor;

public class WeatherMonitor {
    private static final String INITIAL_STATUS = "Unknown";
    private static String weatherStatus = INITIAL_STATUS;

    public static String getWeatherStatus() {
        return weatherStatus;
    }

    public static String setWeatherStatus(String status) {
        if (status != null && !status.isEmpty()) {
            weatherStatus = status;
        }
        return weatherStatus;
    }

    public static void clearStatus() {
        weatherStatus = INITIAL_STATUS;
    }


}
