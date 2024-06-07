package fh.slm.weathermonitor.Controller;
import fh.slm.weathermonitor.Monitor.WeatherMonitor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    @GetMapping("/status")
    public String getWeatherStatus() {
        return WeatherMonitor.getWeatherStatus();
    }

    @PostMapping("/status/{status}")
    public String setWeatherStatus(@PathVariable("status") String status) {
        return WeatherMonitor.setWeatherStatus(status);
    }
}