package src.main.java;


import java.util.List;

public class Sociopath {

    public int findTheSociopath (int groupSize, List<int []> likeList) {
        //chreck for invlid group size
        if (groupSize <= 0) {
            return -1;
        }

        //omit 0
        int[] inDegree = new int[groupSize + 1];
        int[] outDegree = new int[groupSize + 1];


        //process each liking pair
        for (int[] pair : likeList) {
            int start = pair[0]; //person who likes someone
            int target = pair[1]; //person being liked by someone

            //both people need to be between 1 and group size
            if (start < 1 || start > groupSize || target < 1 || target > groupSize) {
                return -1;
            }

            //person likes someone increments
            outDegree[start]++;
            //person is liked by someone increments
            inDegree[target]++;
        }

        //sociopaths have no outgoing likes and n-1 incoming likes
        //use groupSize-1 and outDegree to find sociopath
        for (int i = 1; i<=groupSize; i++) {
            //i = person
            //inDegree of that person should be everyone except themself
            //outDegree of that person should 0
            if (inDegree[i] == groupSize -1 && outDegree[i] == 0) {
                //if conditions met,
                return i;
            }
        }
        return -1;
    }
}

