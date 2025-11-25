package src.main.java;
import src.main.java.Sociopath;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class SociopathTest {

    //test 1
    @Test
    public void testTwoPeopleOneLikesTwo() {
        Sociopath s = new Sociopath();
        List<int[]> likeList = List.of(
                new int[]{1, 2}
        );
        assertEquals(2, s.findTheSociopath(2, likeList));
    }

    //test 2
    @Test
    public void testThreePeopleNoOneLikesThree() {
        Sociopath s = new Sociopath();
        List<int[]> likeList = List.of(
                new int[]{1, 2}
        );
        assertEquals(-1, s.findTheSociopath(3, likeList));
    }

    //test 3
    @Test
    public void testThreePeopleEveryoneLikesThree() {
        Sociopath s = new Sociopath();
        List<int[]> likeList = List.of(
                new int[]{1, 2},
                new int[]{1, 3},
                new int[]{2, 3}
        );
        assertEquals(3, s.findTheSociopath(3, likeList));
    }

    //test 4
    @Test
    public void testTriangleNoSociopath() {
        Sociopath s = new Sociopath();
        List<int[]> likeList = List.of(
                new int[]{1, 3},
                new int[]{2, 3},
                new int[]{3, 1}
        );
        assertEquals(-1, s.findTheSociopath(3, likeList));
    }

    //test 5
    @Test
    public void testInvalidGroupSize() {
        Sociopath s = new Sociopath();
        List<int[]> likeList = List.of(
                new int[]{1, 2}
        );
        assertEquals(-1, s.findTheSociopath(0, likeList));
    }

    //test 6
    @Test
    public void testContainsZeroPerson() {
        Sociopath s = new Sociopath();
        List<int[]> likeList = List.of(
                new int[]{1, 0}
        );
        assertEquals(-1, s.findTheSociopath(3, likeList));
    }
}