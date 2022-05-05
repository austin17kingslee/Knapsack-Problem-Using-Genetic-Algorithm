package main;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import algorithm.GeneticAlgorithm;
import knapsack.*;

public class Main extends Algorithm {
	private final static File p01_c = new File("dataset/p01/p01_c.txt");
	private final static File p01_w = new File("dataset/p01/p01_w.txt");
	private final static File p01_p = new File("dataset/p01/p01_p.txt");
	private final static File p02_c = new File("dataset/p02/p02_c.txt");
	private final static File p02_w = new File("dataset/p02/p02_w.txt");
	private final static File p02_p = new File("dataset/p02/p02_p.txt");
	private final static File p03_c = new File("dataset/p03/p03_c.txt");
	private final static File p03_w = new File("dataset/p03/p03_w.txt");
	private final static File p03_p = new File("dataset/p03/p03_p.txt");
	private final static File p04_c = new File("dataset/p04/p04_c.txt");
	private final static File p04_w = new File("dataset/p04/p04_w.txt");
	private final static File p04_p = new File("dataset/p04/p04_p.txt");
	private final static File p05_c = new File("dataset/p05/p05_c.txt");
	private final static File p05_w = new File("dataset/p05/p05_w.txt");
	private final static File p05_p = new File("dataset/p05/p05_p.txt");
	private final static File p06_c = new File("dataset/p06/p06_c.txt");
	private final static File p06_w = new File("dataset/p06/p06_w.txt");
	private final static File p06_p = new File("dataset/p06/p06_p.txt");
	private final static File p07_c = new File("dataset/p07/p07_c.txt");
	private final static File p07_w = new File("dataset/p07/p07_w.txt");
	private final static File p07_p = new File("dataset/p07/p07_p.txt");
	private final static File p08_c = new File("dataset/p08/p08_c.txt");
	private final static File p08_w = new File("dataset/p08/p08_w.txt");
	private final static File p08_p = new File("dataset/p08/p08_p.txt");
	//Result
	private final static File p01_s = new File("dataset/p01/p01_s.txt");
	private final static File p02_s = new File("dataset/p02/p02_s.txt");
	private final static File p03_s = new File("dataset/p03/p03_s.txt");
	private final static File p04_s = new File("dataset/p04/p04_s.txt");
	private final static File p05_s = new File("dataset/p05/p05_s.txt");
	private final static File p06_s = new File("dataset/p06/p06_s.txt");
	private final static File p07_s = new File("dataset/p07/p07_s.txt");
	private final static File p08_s = new File("dataset/p08/p08_s.txt");
	
	public static int size ;
	public static int maxWeight;
	
	public static int goalResult(File file) {
		int goalFitness = 0;
		ArrayList<Integer> selectionList = readList(file);
		for (int i=0; i<selectionList.size(); i++) {
			if (selectionList.get(i) == 1) goalFitness += Algorithm.valueList.get(i);
		}
		return goalFitness;
	}
	public static int readCapacity(File file) {
		int capacity = -1;
		try {
			Scanner scanner = new Scanner(file);
			capacity = scanner.nextInt();
			scanner.close();
			return capacity;
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return capacity;
	}
	public static ArrayList<Integer> readList(File file) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String currentLine = scanner.nextLine().trim();
				int x = Integer.parseInt(currentLine);
				list.add(x);
			}
			scanner.close();
			return list;
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}
	public static ArrayList<Integer> readWeight(File file) {
		return readList(file);
	}
	
	public static ArrayList<Integer> readValue(File file) {
		return readList(file);
	}
	public static void chooseDataset(int choice) {
		//Clearing past run
		Algorithm.weightList.clear();
		Algorithm.valueList.clear();
		Algorithm.items.clear();
		Algorithm.maxWeight = 0;
		Algorithm.arraySize = 0;
		Algorithm.goalResult = 0;
		switch(choice) {
		case 1:
			Algorithm.weightList = readWeight(p01_w);
			Algorithm.valueList = readValue(p01_p);
			Algorithm.maxWeight = readCapacity(p01_c);
			Algorithm.arraySize = weightList.size();
			Algorithm.goalResult = goalResult(p01_s);
			Algorithm.setItems();
			break;
		case 2:
			Algorithm.weightList = readWeight(p02_w);
			Algorithm.valueList = readValue(p02_p);
			Algorithm.maxWeight = readCapacity(p02_c);
			Algorithm.arraySize = weightList.size();
			Algorithm.goalResult = goalResult(p02_s);
			Algorithm.setItems();
			break;
		case 3:
			Algorithm.weightList = readWeight(p03_w);
			Algorithm.valueList = readValue(p03_p);
			Algorithm.maxWeight = readCapacity(p03_c);
			Algorithm.arraySize = weightList.size();
			Algorithm.goalResult = goalResult(p03_s);
			Algorithm.setItems();
			break;
		case 4:
			Algorithm.weightList = readWeight(p04_w);
			Algorithm.valueList = readValue(p04_p);
			Algorithm.maxWeight = readCapacity(p04_c);
			Algorithm.arraySize = weightList.size();
			Algorithm.goalResult = goalResult(p04_s);
			Algorithm.setItems();
			break;
		case 5:
			Algorithm.weightList = readWeight(p05_w);
			Algorithm.valueList = readValue(p05_p);
			Algorithm.maxWeight = readCapacity(p05_c);
			Algorithm.arraySize = weightList.size();
			Algorithm.goalResult = goalResult(p05_s);
			Algorithm.setItems();
			break;
		case 6:
			Algorithm.weightList = readWeight(p06_w);
			Algorithm.valueList = readValue(p06_p);
			Algorithm.maxWeight = readCapacity(p06_c);
			Algorithm.arraySize = weightList.size();
			Algorithm.goalResult = goalResult(p06_s);
			Algorithm.setItems();
			break;
		case 7:
			Algorithm.weightList = readWeight(p07_w);
			Algorithm.valueList = readValue(p07_p);
			Algorithm.maxWeight = readCapacity(p07_c);
			Algorithm.arraySize = weightList.size();
			Algorithm.goalResult = goalResult(p07_s);
			Algorithm.setItems();
			break;
		case 8:
			Algorithm.weightList = readWeight(p08_w);
			Algorithm.valueList = readValue(p08_p);
			Algorithm.maxWeight = readCapacity(p08_c);
			Algorithm.arraySize = weightList.size();
			Algorithm.goalResult = goalResult(p08_s);
			Algorithm.setItems();
			break;
		default:
			break;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Choose dataset: ");
		int dataset = scan.nextInt();
		chooseDataset(dataset);
		System.out.print("Input number of individuals in the population: ");
		int pop = scan.nextInt();
		System.out.print("Input max number of generations: ");
		int maxGen = scan.nextInt();
		System.out.print("Input the duplication rate: ");
		double dup = scan.nextDouble();
		System.out.print("Input the mutation rate: ");
		double mutation = scan.nextDouble();
		System.out.print("Input the crossover rate: ");
		double crossover = scan.nextDouble();
		System.out.print("Input the number of elitism in each generation: ");
		int elite = scan.nextInt();
		GeneticAlgorithm ga = new GeneticAlgorithm(pop, maxGen, dup, mutation, crossover, elite);
		ga.knapsackGA();
		System.out.println("Most optimal result for the dataset: " + Algorithm.goalResult);
		scan.close();
	}
}

