import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prog {

        public static void main(String[] args) {

            List<Laptop> laptopList = new ArrayList<>();

            for (int i = 0; i <= 1000; i++) {
                laptopList.add(new Laptop());
            }

            Collections.sort(laptopList);

            for (Laptop laptop : laptopList) {
                System.out.println(laptop);
            }

        }
    }

