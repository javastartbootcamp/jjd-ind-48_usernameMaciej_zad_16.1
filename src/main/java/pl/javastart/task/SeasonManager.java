package pl.javastart.task;

import java.util.*;

public class SeasonManager {

    public void run(Scanner scanner) {
        List<Season> seasons = List.of(Season.SPRING, Season.SUMMER, Season.AUTUMN, Season.WINTER);
        System.out.println("Podaj porę roku:");
        for (Season season : seasons) {
            System.out.println(season.getPlTranslation());
        }
        String userSeason = scanner.nextLine().toLowerCase();
        for (Season season : seasons) {
            if (season.getPlTranslation().toLowerCase().contains(userSeason)) {
                System.out.println(season);
            }
        }
    }
}
