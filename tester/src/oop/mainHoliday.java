package oop;

public class mainHoliday {

    public static void main(String[] args) {
        Holiday christmas = new Holiday("Christmas", 25, "December");
        Holiday newYear = new Holiday("New Year", 1, "January");
        Holiday Independence = new Holiday("Independance", 27, "August");
        Holiday[] hArr = {christmas, newYear, Independence};

        // Call avgDate method on the class, not on a specific instance
        double avgDate = Holiday.avgDate(hArr);

        System.out.println(avgDate);
    }
}
