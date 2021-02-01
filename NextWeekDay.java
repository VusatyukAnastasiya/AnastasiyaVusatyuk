
    enum WeekDays {
    SUNDAY {
        @Override
        public WeekDays execute() {
            WeekDays nextDay = WeekDays.SUNDAY.getNext(SUNDAY);
            return nextDay;
        }
    },
    MONDAY {
        @Override
        public WeekDays execute() {
            WeekDays nextDay = WeekDays.MONDAY.getNext(MONDAY);
            return nextDay;
        }
    },
    TUESDAY {
        @Override
        public WeekDays execute() {
            WeekDays nextDay = WeekDays.TUESDAY.getNext(TUESDAY);
            return nextDay;
        }
    },
    WEDNESDAY {
        @Override
        public WeekDays execute() {
            WeekDays nextDay = WeekDays.WEDNESDAY.getNext(WEDNESDAY);
            return nextDay;
        }
    },
    THURSDAY {
        @Override
        public WeekDays execute() {
            WeekDays nextDay = WeekDays.THURSDAY.getNext(THURSDAY);
            return nextDay;
        }
    },
    FRIDAY {
        @Override
        public WeekDays execute() {
            WeekDays nextDay = WeekDays.FRIDAY.getNext(FRIDAY);
            return nextDay;
        }
    },
    SATURDAY {
        @Override
        public WeekDays execute() {
            WeekDays nextDay = WeekDays.SATURDAY.getNext(SATURDAY);
            return nextDay;
        }
    };

    public abstract WeekDays execute();

    public WeekDays getNext(WeekDays arr)
        {
            int index = arr.ordinal();
            int nextIndex = index + 1;
            WeekDays[] days = WeekDays.values();
            nextIndex %= days.length;
            return days[nextIndex];
        }
}


public class NextWeekDay {
    public static void main(String[] args) {
        WeekDays day = WeekDays.THURSDAY;
        WeekDays result = day.execute();
        System.out.println("Next week day is: " + result);

    }
}
