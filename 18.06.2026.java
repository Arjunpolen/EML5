/* Let's understand the question first. We need to find the smallest angle between the minute hand and the hour hand. The smallest angle can be formed either by rotating clockwise or anticlockwise between the two hands.

If you notice, a clock has 360 degrees and 12 hours, so:

360 / 12 = 30

This means the hour hand travels 30 degrees every hour.

Similarly, the minute hand completes 360 degrees in 60 minutes:

360 / 60 = 6

So the minute hand travels 6 degrees every minute.

Now, to find the angle of the minute hand, we can simply do:

6 * minutes

However, for the hour hand, we cannot just do:

30 * hour

because the hour hand keeps moving as the minutes pass. For example, at 3:30, the hour hand is not exactly at 90 degrees (3 * 30); it has already moved halfway toward 4.

To account for this, we need to find how much the hour hand moves per minute. The hour hand completes 360 degrees in 12 hours:

12 * 60 = 720 minutes

Therefore, in one minute, it moves:

360 / 720 = 0.5 degrees

So while calculating the hour hand's angle, we should use:

30 * hour + 0.5 * minutes

This includes both the hour position and the additional movement caused by the minutes. If you look at an actual clock, this will make much more sense.*/

class Solution {
    public double angleClock(int hour, int minutes) {

        double hourAngle = 30.0 * hour + 0.5 * minutes;
        double minuteAngle = 6 * minutes;
        double difference = Math.abs(hourAngle-minuteAngle);
        return Math.min(difference,360.0-difference);
        
    }
}