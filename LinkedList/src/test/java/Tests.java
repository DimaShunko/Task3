import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    private LinkedList list = new LinkedList();

    public Tests(){
        list.add(4);
        list.add(7);
        list.add(1);
    }

    @Test
    public void addTest(){
        assertEquals(3, list.size());
    }

    @Test
    public void removeTest() throws LinkedIndexOutOfBoundsException {
        list.remove(0);
        assertEquals(2,list.size());
    }

    @Test
    public void getTest() throws LinkedIndexOutOfBoundsException {
        Object n = list.get(1);
        assertEquals(7,n);
    }

    @Test
    public void sizeTest(){
        assertEquals(3, list.size());
    }
}

