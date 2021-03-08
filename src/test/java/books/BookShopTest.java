package books;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO : Add your import here
 */

public class BookShopTest {

    /**
     * TODO : Put your test here
     */
    BookShop bookShop = new BookShop("MyBookShop");

    @Test
    public void zeroBooks(){
        assertEquals(8*0,bookShop.cost(new int[]{0,0,0,0,0}));
    }

    @Test
    public void oneBooks(){
        assertEquals(8*1,bookShop.cost(new int[]{1,0,0,0,0}));
    }

    @Test
    public void twoBooksDif(){
        assertEquals(8*2*0.93,bookShop.cost(new int[]{1,1,0,0,0}));
    }

    @Test
    public void twoBooksEqual(){
        assertEquals(8*2,bookShop.cost(new int[]{2,0,0,0,0}));
    }

    @Test
    public void threeBooksDif(){
        assertEquals(8*3*0.86,bookShop.cost(new int[]{1,1,1,0,0}));
    }

    @Test
    public void fourBooksEqual(){
        assertEquals(8*4,bookShop.cost(new int[]{4,0,0,0,0}));
    }

    @Test
    public void fiveBooksEqual(){
        assertEquals(8*5,bookShop.cost(new int[]{0,0,0,5,0}));
    }

    @Test
    public void fiveBooksDif(){
        assertEquals(8*5*0.65,bookShop.cost(new int[]{1,1,1,1,1}));
    }

    @Test
    public void fiveBooksDifMultiple(){
        assertEquals(8*5+8*5*0.65,bookShop.cost(new int[]{2,2,2,2,2}));
    }

    @Test
    public void negativeBooks(){
        assertEquals(0,bookShop.cost(new int[]{-1,-1,-1,-5,-1}));
    }


}