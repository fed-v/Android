package fed.funfacts;

import java.util.Random;

/**
 * Created by fed on 1/10/2015.
 */

public class RandomGenerator {

    public int getRandomNumber(int length) {

        // CREATE A RANDOM GENERATOR
        Random randomGenerator = new Random();

        // USE THE NEXT INT METHOD AND STORE IT IN A VARIABLE
        int randomNumber = randomGenerator.nextInt(length);

        return randomNumber;
    }
}
