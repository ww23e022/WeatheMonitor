package unitTests;

import fh.slm.weathermonitor.Monitor.WeatherMonitor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WeatherMonitorTests {
    private static final String UNKNOWN = "Unknown";

    @Before
    public void resetStatus() {
        WeatherMonitor.clearStatus();
    }

    @Test // This test verifies the behavior of getting the weather status.
    public void testGetWeatherStatus() {
        WeatherMonitor.setWeatherStatus( UNKNOWN ); // Reset the weather status
        String status = WeatherMonitor.getWeatherStatus(); // Get the actual status
        String expected = UNKNOWN; // Expected status
        Assert.assertEquals("Status should be 'Unknown'", expected, status); // Compare actual and expected status
    }

    @Test // This test verifies the behavior of setting the weather status.
    public void testSetWeatherStatus() {
        WeatherMonitor.setWeatherStatus("Sunny"); // Set the weather status to "Sunny"
        String status = WeatherMonitor.getWeatherStatus(); // Get the actual status
        String expected = "Sunny"; // Expected status
        Assert.assertEquals("Status should be 'Sunny'", expected, status); // Compare actual and expected status
    }

    @Test // This test verifies the behavior of setting the weather status to null.
    public void testSetWeatherStatusNull() {

        WeatherMonitor.setWeatherStatus(null); // Set the weather status to null
        String status = WeatherMonitor.getWeatherStatus(); // Get the actual status
        String expected = UNKNOWN; // Expected status after setting to null
        Assert.assertEquals("Status should be 'Unknown'", expected, status); // Compare actual and expected status
    }

    @Test // This test verifies the behavior of setting the weather status to blank.
    public void testSetWeatherStatusBlank() {
        WeatherMonitor.setWeatherStatus(""); // Set the weather status to blank
        String status = WeatherMonitor.getWeatherStatus(); // Get the actual status
        String expected = UNKNOWN; // Expected status after setting to blank
        Assert.assertEquals("Status should be 'Unknown'", expected, status); // Compare actual and expected status
    }
}