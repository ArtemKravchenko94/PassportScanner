package by.bsuir.misoi.passportscanner.utils;

import com.google.common.collect.ImmutableList;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;

import java.util.List;

public class Constants {

    public static final int HOUGH_LOCAL_MAXIMUM = 250;
    public static final int PERPENDICULAR_INFELICITY = 5;

    public static final List<String> FILTERS = ImmutableList.of("Monochrome", "Median", "Reduce Noise", "Canny", "Binary");
    public static final int WINDOW_WIDTH = 980;
    public static final int WINDOW_HEIGHT = 500;
    public static final String WINDOW_TITLE = "Passport Scanner";
    public static final String RED_COLOR = "#f87965";
    public static final String GREEN_COLOR = "#18C31F";
    public static final Font FONT =
            Font.font(
                    "Century Gothic",
                    FontPosture.REGULAR,
                    12
            );

    private Constants() {
    }
}
