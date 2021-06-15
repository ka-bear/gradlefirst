import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {
    @Test

    public static void main(String[] args) {
        assertEquals(Main.add(1,2),3);
        assertEquals(Main.add(0,1,2),3);
        assertEquals(Main.add(0,1,2,3),6);
        assertEquals(Main.add(0,1,2,3,4),10);
        assertEquals(Main.subtract(4,1),3);
        ArrayList<Integer> lst = new ArrayList<Integer>();
        lst.add(1);
        lst.add(3);
        lst.add(5);
        lst.add(2);
        lst.add(4);
        ArrayList<Integer> lstt = new ArrayList<Integer>();
        lstt.add(5);
        lstt.add(4);
        lstt.add(3);
        lstt.add(2);
        lstt.add(1);
        assertEquals(Main.desSort(lst),lstt);
    }

}
