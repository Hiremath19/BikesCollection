package BikesCollections;
import java.util.*;
public class BikesCollection
{

    public static void main(String args[])
    {
        String[] oldbikes = {"Splender", "Plantena", "Discover", "Honda"};
        String[] newbikes = {"Duke", "Harleydevidson", "Avenger", "RoyalEnfield"};
        String[] Both={"Splender","RoyalEnfield","Discover","Avenger"};


        ArrayList<String> OldBike = new ArrayList<String>();
        ArrayList<String> NewBike = new ArrayList<String>();
        ArrayList<String>  BothBikes=new ArrayList<String>();



        OldBike.addAll(Arrays.asList(oldbikes));
        NewBike.addAll(Arrays.asList(newbikes));
        BothBikes.addAll(Arrays.asList(Both));





        System.out.println("Welcome to the Usage of HashMap");

        HashMap<Integer, List<String>> hashbikecollection = new HashMap<>();
        HashMap<Integer,List<String>> integerListHashSet=new HashMap<>();


        hashbikecollection.put(251, OldBike);
        hashbikecollection.put(651, NewBike);
        integerListHashSet.put(251,BothBikes);

        System.out.println("HashMap\n");
        System.out.println(hashbikecollection);


        System.out.println("List 1= " + "Old Bikes Through HashMap : " + hashbikecollection.get(251));
        System.out.println("List 1= " + "New Bikes Through HashMap : " + hashbikecollection.get(651));
        System.out.println("list 1= " + "Both Bikes Through Hashmap: " +integerListHashSet.get(251));


        Collections.sort(hashbikecollection.get(251));
        Collections.sort(hashbikecollection.get(651));
        Collections.sort(integerListHashSet.get(251));

        System.out.println("HashMap: List 1 and List 2, Old Bikes and New Bikes Sorted Through Collection.sort");
        System.out.println(hashbikecollection.get(251));
        System.out.println(hashbikecollection.get(651));
        System.out.println(integerListHashSet.get(251));
        System.out.println();


        /*System.out.println("Bikes speed limit below 100");

        System.out.println("enter the speed of the bike");
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        ArrayList<String> speed = new ArrayList<String>();
        speed.addAll(Arrays.asList(oldbikes));
        int speed1 =100;

        if (speed1 <=100) {
            System.out.println("your are safe:" +speed );

        } else {
            if (speed1 >= 100)
                System.out.println("your not safe:" +speed);
          */
        }

    }

