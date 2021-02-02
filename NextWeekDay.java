
    
    enum WeekDays {
    SUNDAY {
        @Override
        public WeekDays execute() {
            WeekDays nextDay = getNext(SUNDAY);
            return nextDay;
        }
    },
    MONDAY {
        @Override
        public WeekDays execute() {
            WeekDays nextDay = getNext(MONDAY);
            return nextDay;
        }
    },
    TUESDAY {
        @Override
        public WeekDays execute() {
            WeekDays nextDay = getNext(TUESDAY);
            return nextDay;
        }
    },
    WEDNESDAY {
        @Override
        public WeekDays execute() {
            WeekDays nextDay = getNext(WEDNESDAY);
            return nextDay;
        }
    },
    THURSDAY {
        @Override
        public WeekDays execute() {
            WeekDays nextDay = getNext(THURSDAY);
            return nextDay;
        }
    },
    FRIDAY {
        @Override
        public WeekDays execute() {
            WeekDays nextDay = getNext(FRIDAY);
            return nextDay;
        }
    },
    SATURDAY {
        @Override
        public WeekDays execute() {
            WeekDays nextDay = getNext(SATURDAY);
            return nextDay;
        }
    };

    public abstract WeekDays execute();

    public WeekDays getNext(WeekDays arr)
        {
            final int nextIndex = arr.ordinal() + 1;
            WeekDays[] days = arr.values();
            return days[nextIndex % days.length];
        }
}

public class NextWeekDay {
    public static void main(String[] args) {
        WeekDays day = WeekDays.FRIDAY;
        WeekDays result = day.execute();
        System.out.println("Next week day is: " + result);

    }
}
