package me.everything.overscrolldemo.control;

import android.content.res.Resources;

import java.util.Arrays;
import java.util.List;

import me.everything.overscrolldemo.R;

/**
 * @author amit
 */
public class DemoContentHelper {

    private static List<DemoItem> sSpectrumItemsVioletToRed;
    private static List<DemoItem> sSpectrumItemsRedToViolet;

    public static List<DemoItem> getSpectrumItems(Resources res) {
        if (sSpectrumItemsVioletToRed == null) {
            sSpectrumItemsVioletToRed = Arrays.asList(
                    new DemoItem(res.getColor(android.R.color.holo_purple), "PURPLE"),
                    new DemoItem(res.getColor(android.R.color.holo_blue_dark), "BLUE"),
                    new DemoItem(res.getColor(android.R.color.holo_blue_light), "LIGHT BLUE"),
                    new DemoItem(res.getColor(R.color.spectrum_cyan), "CYAN"),
                    new DemoItem(res.getColor(android.R.color.holo_green_dark), "GREEN"),
                    new DemoItem(res.getColor(android.R.color.holo_green_light), "LIGHT GREEN"),
                    new DemoItem(res.getColor(R.color.spectrum_yellow), "YELLOW"),
                    new DemoItem(res.getColor(android.R.color.holo_orange_light), "LIGHT ORANGE"),
                    new DemoItem(res.getColor(android.R.color.holo_orange_dark), "ORANGE"),
                    new DemoItem(res.getColor(android.R.color.holo_red_light), "LIGHT RED"),
                    new DemoItem(res.getColor(android.R.color.holo_red_dark), "RED")
            );
        }
        return sSpectrumItemsVioletToRed;
    }

    public static List<DemoItem> getReverseSpectrumItems(Resources res) {
        if (sSpectrumItemsRedToViolet == null) {
            sSpectrumItemsRedToViolet = Arrays.asList(
                    new DemoItem(res.getColor(android.R.color.holo_red_dark), "RED"),
                    new DemoItem(res.getColor(android.R.color.holo_red_light), "LIGHT RED"),
                    new DemoItem(res.getColor(android.R.color.holo_orange_dark), "ORANGE"),
                    new DemoItem(res.getColor(android.R.color.holo_orange_light), "LIGHT ORANGE"),
                    new DemoItem(res.getColor(R.color.spectrum_yellow), "YELLOW"),
                    new DemoItem(res.getColor(android.R.color.holo_green_light), "LIGHT GREEN"),
                    new DemoItem(res.getColor(android.R.color.holo_green_dark), "GREEN"),
                    new DemoItem(res.getColor(R.color.spectrum_cyan), "CYAN"),
                    new DemoItem(res.getColor(android.R.color.holo_blue_light), "LIGHT BLUE"),
                    new DemoItem(res.getColor(android.R.color.holo_blue_dark), "BLUE"),
                    new DemoItem(res.getColor(android.R.color.holo_purple), "PURPLE"),

                    //多添加一些数据方便观察
                    new DemoItem(res.getColor(android.R.color.holo_red_dark), "RED_2"),
                    new DemoItem(res.getColor(android.R.color.holo_red_light), "LIGHT RED_2"),
                    new DemoItem(res.getColor(android.R.color.holo_orange_dark), "ORANGE_2"),
                    new DemoItem(res.getColor(android.R.color.holo_orange_light), "LIGHT ORANGE_2"),
                    new DemoItem(res.getColor(R.color.spectrum_yellow), "YELLOW_2"),
                    new DemoItem(res.getColor(android.R.color.holo_green_light), "LIGHT GREEN_2"),
                    new DemoItem(res.getColor(android.R.color.holo_green_dark), "GREEN_2"),
                    new DemoItem(res.getColor(R.color.spectrum_cyan), "CYAN_2"),
                    new DemoItem(res.getColor(android.R.color.holo_blue_light), "LIGHT BLUE_2"),
                    new DemoItem(res.getColor(android.R.color.holo_blue_dark), "BLUE_2"),
                    new DemoItem(res.getColor(android.R.color.holo_purple), "PURPLE_2")
            );
        }
        return sSpectrumItemsRedToViolet;
    }
}
