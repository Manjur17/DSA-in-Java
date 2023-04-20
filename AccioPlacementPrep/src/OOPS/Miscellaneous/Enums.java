package OOPS.Miscellaneous;

interface A {
    void hello();
}

public class Enums {
    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();
        System.out.println(Week.valueOf("Monday")); // returns the enum constant
        for(Week day : Week.values()) {
            System.out.println(day);
        }
        // Calling values()
        Week[] arr = Week.values();

        // enum with loop
        for (Week day : arr) {
            // Calling ordinal() to find index of color.
            System.out.println(day + " at index " + day.ordinal());
        }
        System.out.println(week.ordinal()); //-> indexing just like in arrays
    }

    enum Week implements A {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
        // public, static and final
        // since its final you cannot create child enums
        // type is Week

        Week() {
        //toString() is overridden in java.lang.enum class, and executed separately for each enum constant at the time of enum class loading.
            System.out.println("Constructor called for " + this); //this or this.toString()
        }

        void display() {
            //Abstract methods are not allowed
        }

        @Override
        public void hello() {
            System.out.println("hey how are you");
        }
        // this is not public or protected, only private or default
        // why? we don't want to create new objects, and we want constant number of objects
        // this is not the enum concept, that's why

        /* internally: above enum Week is converted to
        class Week
        {
            public static final Color Monday = new Week();
            public static final Color Tuesday = new Week();
            public static final Color Wednesday = new Week();
            public static final Color Thursday = new Week();
            public static final Color Friday = new Week();
            public static final Color Saturday = new Week();
            public static final Color Sunday = new Week();
        }
         */
    }
}