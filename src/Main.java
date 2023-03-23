import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args)

        // to handle exceptions include throws
            throws IOException {

        // load data from file
        BufferedReader bf = new BufferedReader(new FileReader("inputday1-othertime2022.txt"));
        String str;

        int caloriesElf = 0;

        List<Integer> calElfs = new ArrayList<>();
        while ((str = bf.readLine()) != null) {
            int calItem = 0;
            if (str.equals("")) {
                calElfs.add(caloriesElf);
                System.out.println(caloriesElf);
                caloriesElf = 0;
                continue;
            }
            calItem = Integer.parseInt(str);
            caloriesElf += calItem;

        }
//        System.out.println(calElfs);
        Collections.sort(calElfs);
//        System.out.println("sorted list: " + calElfs);
        System.out.println("Max calories: " + calElfs.get(calElfs.size() - 1));

        //part 2:
                System.out.println("Max calories top 3: " + (calElfs.get(calElfs.size() - 1) + calElfs.get(calElfs.size() - 2) + calElfs.get(calElfs.size() - 3)));




    }
}


//        BufferedReader bf1 = new BufferedReader(new FileReader("inputday1-2022.txt"));
//        String str1;
//        int indexElf = 0;
//        int caloriesElfMax = 0;
//        int indexElfMax = 0;
//        int caloriesElf1 = 0;
//
//
//        while ((str1 = bf1.readLine()) != null) {
//            if (str1.equals("")) {
//                System.out.println("Elf #" + indexElf + " carries " + caloriesElf1 + " calories");
//                if (caloriesElf1 > caloriesElfMax) {
//                    caloriesElfMax = caloriesElf1;
//                    indexElfMax = indexElf;
//                }
//                indexElf++;
//                caloriesElf1 = 0;
//            } else {
//                int cal = Integer.parseInt(str1);
//                caloriesElf1 += cal;
//            }
//        }




