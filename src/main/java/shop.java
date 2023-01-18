import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class shop {

    public static final int [] Pricearr = {100, 200, 300, 400, 500, 600, 700, 800};
    public static final int [] Ramearr = {4, 8, 16, 20, 24, 28, 32};
    public static final String [] brand = {"Lenuvo", "Asos", "MacNote", "Eser", "Xamiou"};


    public static void main(String[] args) {

    int i = 1;
        ArrayList<laptop> shop = new ArrayList<>();
        while (i < 5){
            shop.add(createLaptop());
            i++;
        }
        System.out.println(shop);
        sortPrice(shop);
        sortRam(shop);
    }


    public static void sortPrice(ArrayList<laptop> arrayList){
        System.out.println("----------------\nSorted by price");
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.size()-1; j++) {
                if (arrayList.get(j).getPrice() > arrayList.get(j + 1).getPrice()) {
                    laptop temp = arrayList.get(j);
                    arrayList.remove(j);
                    arrayList.add(j, arrayList.get(j));
                    arrayList.remove(j + 1);
                    arrayList.add(j + 1, temp);
                }
            }
        }
        System.out.println(arrayList);

    }
    public static void sortRam(ArrayList<laptop> arrayList){
        System.out.println("----------------\nSorted by ram");
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.size()-1; j++) {
                if (arrayList.get(j).getRam() > arrayList.get(j+1).getRam()){
                    laptop temp = arrayList.get(j);
                    arrayList.remove(j);
                    arrayList.add(j, arrayList.get(j));
                    arrayList.remove(j + 1);
                    arrayList.add(j + 1, temp);
                }
            }
        }
        System.out.println(arrayList);

    }

    public static laptop createLaptop(){
        laptop lp = new laptop(Pricearr[addRandomPrice()],Ramearr[addRandomRam()],brand[addRandomBrand()]);
        return lp;
    }



    public static int addRandomBrand(){
        return ThreadLocalRandom.current().nextInt(brand.length);

    }
    public static int addRandomRam(){
        return ThreadLocalRandom.current().nextInt(Ramearr.length);
    }
    //random cost
    public static int addRandomPrice(){
        return ThreadLocalRandom.current().nextInt(Pricearr.length);
    }

}
