package gifts;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.List;

public class GiftFactoryTests {

    private GiftFactory factory;

    Gift firstGift;
    Gift secondGift;

    @Before
    public void setup(){
        factory = new GiftFactory();

        firstGift = new Gift("Magical", 2.54);
        secondGift = new Gift("Water", 3.18);
        
        factory.createGift(firstGift);
        factory.createGift(secondGift);
    }

    @Test
    public void testSize(){
        int count = factory.getCount();

        Assert.assertEquals(2, count);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForExceptionWhenCreatingExistingGift(){
        factory.createGift(firstGift);
    }

    @Test(expected = NullPointerException.class)
    public void testForNullPointerWhenRemovingGift(){
        factory.removeGift(null);
    }

    @Test
    public void testRemovingGift(){
        Assert.assertTrue(factory.removeGift("Water"));
    }


    @Test
    public void testLeastMagicMethod(){
        Gift presentWithLeastMagic = factory.getPresentWithLeastMagic();

        Assert.assertEquals("Magical", presentWithLeastMagic.getType());
    }

    @Test
    public void testGetPresent(){
        Gift present = factory.getPresent("Magical");

        Assert.assertEquals("Magical", present.getType());
    }

    @Test
    public void testGetPresentsList(){
        Collection<Gift> giftsList = factory.getPresents();

        Assert.assertEquals(2, giftsList.size());
    }
}
