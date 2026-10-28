package ProgramPractise;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberWith50ElementsinList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        Random random = new Random();

        while (list.size() < 50) {

            int rand = random.nextInt(8) + 1;

            list.add(rand);
        }

        System.out.println(list);
        System.out.println("List size: " + list.size());
    }
}