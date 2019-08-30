package pl.jacob_the_liar.fun_home_help.forecast;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import pl.jacob_the_liar.fun_home_help.forecast.seven_timer.civil.Dataseries;
import pl.jacob_the_liar.fun_home_help.forecast.seven_timer.civil.DataseriesTranslator;
import pl.jacob_the_liar.fun_home_help.forecast.seven_timer.civil.SevenTimerForecast;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date : 30.08.2019 11:11
 * *
 * @className: ForecastPageController
 * *
 * *
 ******************************************************/

@Controller
public class ForecastPageController {


    private String forecastUri = "http://www.7timer.info/bin/civil.php?lon=%f&lat=%f&ac=0&unit=metric&output=json&tzshift=0";

    @GetMapping("/forecast")
    public String forecast(Model model){

        RestTemplate forecastRest = new RestTemplate();

        String forecastUriConverted = String.format(forecastUri, 17.3, 52.2);

        String result = forecastRest.getForObject(forecastUriConverted, String.class);

        model.addAttribute("uri", forecastUriConverted);


        Gson gson = new Gson();
        SevenTimerForecast sevenTimerForecast = gson.fromJson(result, SevenTimerForecast.class);
        model.addAttribute("result_length", sevenTimerForecast.getDataseries().size());

        List<DataseriesTranslator> forecastList = new ArrayList<>();

        for (Dataseries data : sevenTimerForecast.getDataseries()){
            forecastList.add(new DataseriesTranslator(data, sevenTimerForecast.getInit()));
        }

        model.addAttribute("records", forecastList);

        return "forecast";
    }


}
