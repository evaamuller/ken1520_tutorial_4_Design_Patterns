package designpat.telephone;

import java.util.List;

/**
 * Prints things out to the screen, when needed
 * Printing to the screen:
 * System.out.println("hello");
 */
public class Screen implements Observer{
    private final PhoneModel model;

    public Screen(PhoneModel model) {
        this.model = model;
    }

    @Override
    public void update(int value, EVENT_TYPE type) {
        if (type == EVENT_TYPE.DIGIT) {
            System.out.println(value);
        }else{
            List<Integer> numbers = model.getDigits();
            System.out.print("Now dialing ");
            for(int number : numbers){
                System.out.print(number);
            }
        }
    }
}
