package knapsack;

import java.util.List;

public class Individual extends Algorithm{
    private int[] chromosome;
    private double fitness = -1;


    public Individual(int[] chromosome) {
        this.chromosome = chromosome;
    }

    public Individual(int chromosomeLength) {
        this.chromosome = new int[chromosomeLength];
        for (int gene = 0; gene < chromosomeLength; gene++) {
            if (0.5 < Math.random()) {
                this.setGene(gene, 1);
            } else {
                this.setGene(gene, 0);
            }
        }
    }

    public int[] getChromosome() {
        return this.chromosome;
    }

    public int getChromosomeLength() {
        return this.chromosome.length;
    }

    public void setGene(int index, int gene) {
        this.chromosome[index] = gene;
    }

    public int getGene(int index) {
        return this.chromosome[index];
    }

    public void setFitness(List<Items> items) {
        this.fitness = calcFitness(this.chromosome);
    }

    public double getFitness() {
        return this.fitness;
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < this.chromosome.length; i++) {
            output += this.chromosome[i];
        }
        return output;
    }

    public double calcFitness(int[] chromosome) {
        double fit = 0;
        double weight = 0;
        for (int i = 0; i < Algorithm.arraySize; i++) {
            if (chromosome[i] == 1) {
                weight += Algorithm.items.get(i).getWeight();
                fit += Algorithm.items.get(i).getValue();
            }
        }

        if (weight <= Algorithm.maxWeight) {
            this.fitness = fit;
            return fit;

        } else
            return -1;
    }
}
