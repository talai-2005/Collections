package EpamCollections.Florist;

import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author Nikolai
 */

public class FlowerClassRunner {
    final static Logger logger = Logger.getLogger(String.valueOf(FlowerClassRunner.class));
    public static void main(String[] args) {

        logger.info("Entering the execute method");

        Bunch bunch = new Bunch();
        bunch.addFlowerToFlowerList(new Rose("Tea-Rose", 10, 2, 15));
        bunch.addFlowerToFlowerList(new Tulip("Yellow", 7, 3, 22));

        try {
//gets a list of sorted list of flowers by freshness
            List<Flower> listSortFlowerByFreshness = bunch.sortFlowerByFreshness();
            System.out.println(listSortFlowerByFreshness);
            logger.info("Sorted by freshness successfully");

//gets a list of sorted list of flowers by stem length
            List<Flower> listSortFlowerByStemLength = bunch.sortFlowerByFreshness();
            System.out.println(listSortFlowerByStemLength);
            logger.info("Sorted by stem length successfully");

//gets a list of sorted list of flowers by stem gange
            List<Flower> getFlowerSortedByStemRange = bunch.getFlowerByStemLengthRange(0, 100);
            System.out.println(getFlowerSortedByStemRange);

            System.out.println("The bunch price makes " + bunch.getBunchPrice() + " RUB");
            logger.info("Got bunch price successfully");

        } catch (ConcurrentModificationException e) {
            logger.severe("ConcurrentModificationException. Message: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
