package knapsack;

import java.util.ArrayList;

public class Algorithm {
	public static ArrayList<Integer> weightList = new ArrayList<>();
	public static ArrayList<Integer> valueList = new ArrayList<>();
    public static int arraySize;
    public static int maxWeight;
    public static ArrayList<Items> items = new ArrayList<>();
    public static int goalResult;
    public static void setItems(){
    	for (int i=0;i<arraySize;i++) {
    		items.add(new Items(weightList.get(i),valueList.get(i)));
    	}
    }
}