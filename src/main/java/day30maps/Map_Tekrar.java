package day30maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Tekrar {
    public static void main(String[] args) {
        HashMap<String, Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 3000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkey", 83000000);
        countryPopulation.put("Netherland", 18000000);
        System.out.println(countryPopulation);//{Netherland=18000000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=3000000}

        //get() methodu "key" ile calisir ve value kismini verir.
        System.out.println(countryPopulation.get("USA")); // 400000000
        System.out.println(countryPopulation.get("Turkeyy")); // null

        //Butun keyleri nasil alabiliriz?

        Set<String> keysOfCP = countryPopulation.keySet();
        System.out.println(keysOfCP); // [Netherland, USA, Turkey, Germany, Albania]

        //Butun valuelari nasil alabiliriz?

        Collection<Integer> valuesOfCP = countryPopulation.values();
        System.out.println(valuesOfCP); //[18000000, 400000000, 83000000, 83000000, 3000000]

        //Ornek : CountryPopulation mepindeki ulkelerin nufuslarinin ortalamasi nedir?

        int sum =0;
        for (Integer w:valuesOfCP) {
            sum+=w;
        }
        System.out.println(sum/ valuesOfCP.size()); // 117400000

        //Loop lar mapler ile kullanilamaz, bunun icin entrySet methodunu kullaniriz
        //entrySet() mapteki entry leri kalip halinde alip bize Set in icine koyarak verir

        Set<Map.Entry<String,Integer>> entries = countryPopulation.entrySet();
        System.out.println(entries); // [Netherland=18000000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=3000000]

        //Ornek 2 : countryPopulation Map indeki ulkelerin isimlerinin character sayisi ile nufuslarin toplamini bulunuz

        int toplam = 0;

        for (Map.Entry<String,Integer> w: entries){
            toplam=toplam+w.getKey().length()+w.getValue();
        }
        System.out.println(toplam); // 587000033

    }
}
