package pl.jacob_the_liar.fun_home_help.forecast.seven_timer.civil;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date : 30.08.2019 13:02
 * *
 * @className: ForecastTranslator
 * *
 * *
 ******************************************************/

public class DataseriesTranslator {

    private final Dataseries dataseries;
    private final String init;

    public DataseriesTranslator(Dataseries dataseries, String init) {
        this.dataseries = dataseries;
        this.init = init;
    }

    public String getTimepoint() {
        String fromPattern = "yyyyMMddHH";
        String toPattern = "dd. HH";

        LocalDateTime initDate = stringToDateTime(fromPattern, init);

        return dateTimeToString(toPattern, initDate.plusHours(dataseries.getTimepoint())) + "h";
    }

    public String getCloudcover() {
        switch (dataseries.getCloudcover()) {
            case 1:
                return "0-6%";
            case 2:
                return "6-19%";
            case 3:
                return "19-31%";
            case 4:
                return "31-44%";
            case 5:
                return "44-56%";
            case 6:
                return "56-69%";
            case 7:
                return "69-81%";
            case 8:
                return "81-94%";
            case 9:
                return "94-100%";
            default:
                return "n/a";
        }
    }

    public String getLiftedIndex() {
        switch (dataseries.getLiftedIndex()) {
            case -10:
                return "below -7 (very unstable)";
            case -6:
                return "-7 to -5 (very unstable)";
            case -4:
                return "-5 to -3 (unstable)";
            case -1:
                return "-3 to 0 (unstable)";
            case 2:
                return "0 to 4 (slightly unstable)";
            case 6:
                return "4 to 8 (stable)";
            case 10:
                return "8 to 11 (very stable)";
            case 15:
                return "over 11 (very stable)";

            default:
                return "n/a";
        }
    }

    public String getPrecType() {
        return dataseries.getPrecType();
    }

    public String getPrecAmount() {

        switch (dataseries.getPrecAmount()) {
            case 0:
                return "---";
            case 1:
                return "<0.25mm";
            case 2:
                return "0.25-1mm";
            case 3:
                return "1-4mm";
            case 4:
                return "4-10mm";
            case 5:
                return "10-16mm";
            case 6:
                return "16-30mm";
            case 7:
                return "30-50mm";
            case 8:
                return "50-75mm";
            case 9:
                return "> 75mm";
            default:
                return "n/a";
        }
    }

    public String getTemp2m() {
        return dataseries.getTemp2m()+" °C";
    }

    public String getRh2m() {
        return dataseries.getRh2m()+" mm/hg";
    }

    public String getWindSpeed() {
        switch (dataseries.getWind10m().getSpeed()) {

            case 1:
                return "below 0.3m/s";
            case 2:
                return "0.3-3.4m/s";
            case 3:
                return "3.4-8.0m/s";
            case 4:
                return "8.0-10.8m/s";
            case 5:
                return "10.8-17.2m/s";
            case 6:
                return "17.2-24.5m/s";
            case 7:
                return "24.5-32.6m/s";
            case 8:
                return "over 32.6m/s";
            default:
                return "n/a";
        }
    }

    public String getWindDirection() {
        return dataseries.getWind10m().getDirection();
    }


    public String getWeather() {
        return dataseries.getWeather();
    }

    public LocalDateTime stringToDateTime(String format, String stringDateTime){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(format);
        return LocalDateTime.parse(stringDateTime, dateTimeFormatter);
    }


    public String dateTimeToString(String format, LocalDateTime dateTime){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(format);
        return dateTime.format(dateTimeFormatter);
    }
}
