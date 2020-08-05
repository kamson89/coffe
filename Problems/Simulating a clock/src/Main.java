class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {

        minutes++;
        
        if (hours == 12 && minutes == 60) {

            hours = 1;
            minutes = 0;

        } else if (minutes == 60) {

            hours++;
            minutes = 0;
        }
    }
}