package pl.jacob_the_liar.fun_home_help.forecast.seven_timer.civil;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date : 30.08.2019 12:03
 * *
 * @className: SevenTimerForecast
 * *
 * *
 ******************************************************/

public class SevenTimerForecast {

    @SerializedName("product")
    @Expose
    private String product;
    @SerializedName("init")
    @Expose
    private String init;
    @SerializedName("dataseries")
    @Expose
    private List<Dataseries> dataseries = null;
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getInit() {
        return init;
    }

    public void setInit(String init) {
        this.init = init;
    }

    public List<Dataseries> getDataseries() {
        return dataseries;
    }

    public void setDataseries(List<Dataseries> dataseries) {
        this.dataseries = dataseries;
    }
}