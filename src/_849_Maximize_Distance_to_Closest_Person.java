/**
 * In a row of seats, 1 represents a person sitting in that seat, and 0 represents that the seat is empty.
 * There is at least one empty seat, and at least one person sitting.
 * Alex wants to sit in the seat such that the distance between him
 * and the closest person to him is maximized.
 * Return that maximum distance to closest person.
 */
public class _849_Maximize_Distance_to_Closest_Person {
    public int maxDistToClosest(int[] seats) {
        if (seats.length == 0) return 1;
        int max = 1;
        int lastPostion = -1;
        int nextPostion = -1;
        for (int i = 0; i <= seats.length; i++) {
            //find next 1
            if (i == seats.length) {
                if (max < i - nextPostion -1 ) max = i - nextPostion -1;
            } else if (seats[i] == 1) {
                lastPostion = nextPostion;
                nextPostion = i;
                if (lastPostion == -1 && nextPostion != -1) {
                    if (max < nextPostion) max = nextPostion;
                } else {
                    if (max < (nextPostion - lastPostion ) / 2) max = (nextPostion - lastPostion ) / 2;
                }
            }
        }
        return max;
    }
}
