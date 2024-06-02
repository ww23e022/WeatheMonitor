package fh.slm.weathermonitor.Monitor;

public class WeatherMonitor {
    private static String weatherStatus = "Unknown";

    public static String getWeatherStatus() {
        return weatherStatus;
    }

    public static String setWeatherStatus(String status) {
        if (status != null && !status.isEmpty()) {
            weatherStatus = status;
        }
        return weatherStatus;
    }
}
