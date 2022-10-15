package labs_examples.enumerations.labs;



public class DaysInAMonthEnum {
    public enum Month {
        JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30),
        MAY(31), JUNE(30), JULY(31), AUGUST(31),
        SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);

        Month(int numberOfDays) {
            this.numberOfDays = numberOfDays;
        }

        private final int numberOfDays;

        public int getNumberOfDays() {
            return numberOfDays;
        }
    }
}
