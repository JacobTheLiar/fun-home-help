package pl.jacob_the_liar.fun_home_help.forecast.seven_timer.civil;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date : 30.08.2019 12:02
 * *
 * @className: Wind10m
 * *
 * *
 ******************************************************/

public class Wind10m {

    @SerializedName("direction")
    @Expose
    private String direction;
    @SerializedName("speed")
    @Expose
    private Integer speed;
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
}
