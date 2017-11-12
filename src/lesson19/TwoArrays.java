package lesson19;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by student on 11/12/2017.
 */
public class TwoArrays {
    public static void main(String[] args) {
        LinkedList<HeavyBox> boxes = new LinkedList<>();
        boxes.add(new HeavyBox(250));
        boxes.add(new HeavyBox(150));
        boxes.add(new HeavyBox(300));
        boxes.add(new HeavyBox(450));
        boxes.add(new HeavyBox(50));

        LinkedList boxes1 = sort(boxes);
        System.out.println(sort(boxes1));
        System.out.println(boxes);
    }

    public static LinkedList sort(LinkedList list){
        LinkedList<HeavyBox> boxes = new LinkedList<>();
        Iterator<HeavyBox> iterator = list.iterator();
        while (iterator.hasNext()){
            HeavyBox box = iterator.next();
            if (box.getWeight() > 300){
                boxes.add(box);
                list.remove(box);
            }
        }
        return boxes;
    }
}
