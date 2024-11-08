package Datos_Colecciones.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejemplo {

    public static void main(String[] args) {
        //Set<Integer> nums = new HashSet<>();
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(3);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println(nums);
        Set<Integer> nums2 = new HashSet<>(nums);
        System.out.println(nums2);
    }

}
