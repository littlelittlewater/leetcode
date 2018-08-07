/**
 * In a row of seats, 1 represents a person sitting in that seat, and 0 represents that the seat is empty.
 * There is at least one empty seat, and at least one person sitting.
 * Alex wants to sit in the seat such that the distance between him
 * and the closest person to him is maximized.
 * Return that maximum distance to closest person.
 */
public class _849_Maximize_Distance_to_Closest_Person {
    public int maxDistToClosest(int[] seats) {
        if (seats.length == 0 ) return 1;
        int max  = 1 ;
        for (int i = 0 ;i <seats.length ; i++ ){
            int tmp = 0;
            while (seats[i] == 0 ){
                i ++;
                tmp ++;
            }
            if(tmp > max) max = tmp;
        }
        return (max+1)/2;
    }
}
