package pl.javastart.task;

public enum Season {
    SPRING("Wiosna", "marzec", "kwiecien", "maj"),
    SUMMER("Lato", "czerwiec", "lipiec", "sierpien"),
    AUTUMN("Jesien", "wrzesien", "pazdziernik", "listopad"),
    WINTER("Zima", "grudzien", "styczen", "luty");

    private String plTranslation;
    private String firstMonth;
    private String secondMonth;
    private String thirdMonth;

    Season(String plTranslation, String firstMonth, String secondMonth, String thirdMonth) {
        this.plTranslation = plTranslation;
        this.firstMonth = firstMonth;
        this.secondMonth = secondMonth;
        this.thirdMonth = thirdMonth;
    }

    public String getPlTranslation() {
        return plTranslation;
    }

    public String getFirstMonth() {
        return firstMonth;
    }

    public String getSecondMonth() {
        return secondMonth;
    }

    public String getThirdMonth() {
        return thirdMonth;
    }

    @Override
    public String toString() {
        return "[" + firstMonth + ", " + secondMonth + ", " + thirdMonth + "]";
    }
}