package com.codewars.fivekyu;

//        Our goal here is to run the evolution process many times. Eventually, all the chromosomes in our population
//        will have a fitness close to 1! When we feel we have done enough runs, that is the time to cut it off,
//        find the chromosome with the highest fitness, and return that as the result.
//        We'll keep this task fairly simple. You will be given an outline of a GeneticAlgorithm class with a few methods.
//        The crossover and mutate methods are self-explanatory: they take in two chromosomes or one and a probability (respectively)
//        and return a crossed-over pair or a mutated chromosome. The generate method generates a random
//        chromosome of a given length (use this in your run method to create a population).
//        The select method will take a population and a corresponding list of fitnesses and return two chromosomes selected
//        with the roulette wheel method. The run method will take a fitness function that accepts a chromosome
//        and returns the fitness of that chromosome, the length of the chromosomes to generate (should be the same length as the goal chromosome),
//        the crossover and mutation probabilities, and an optional number of iterations (default to 100).
//        Make the population size whatever you want; 100 is a good number but anywhere between 50 and 1000 will work just fine (although the bigger, the slower).
//        After the iterations are finished, the method returns the chromosome it deemed to be fittest. This fitness function will be preloaded (Helper.Fitness in C#)!
//        What the test will do is generate a random binary string of 35 digits (a random Integer with 35 bits for Ruby),
//        and your algorithm must discover that string! The fitness will be calculated in a way similar to above,
//        where the score of a chromosome is the number of bits that differ from the goal string.
//        The crossover probability we will use is 0.6 and the mutation probability we will use is 0.002.
//        Now, since the chromosome length is small, 100 iterations should be enough to get the correct answer every time.
//        The test fixture will run the algorithm 10 times on 10 different goal strings. If not all of them work, then you can try again and you'll probably be fine.

import java.util.Random;

public class BinaryGeneticAlgorithms {
    private final Random random = new Random();

    private static final String CHARACTERS =
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=[]{}|;:,.<>?";

    public String evolve(String target) {
        int populationSize = 100;
        double mutationRate = 0.01;
        int maxGenerations = 1000;
        int targetLength = target.length();

        String[] population = new String[populationSize];
        for (int i = 0; i < populationSize; i++) {
            population[i] = randomString(targetLength);
        }

        for (int generation = 0; generation < maxGenerations; generation++) {
            int[] fitness = new int[populationSize];
            for (int i = 0; i < populationSize; i++) {
                fitness[i] = calculateFitness(population[i], target);
                if (fitness[i] == targetLength) {
                    return population[i];
                }
            }

            String[] newPopulation = new String[populationSize];
            for (int i = 0; i < populationSize; i++) {
                String parent1 = selectParent(population, fitness);
                String parent2 = selectParent(population, fitness);
                String child = crossover(parent1, parent2);
                child = mutate(child, mutationRate);
                newPopulation[i] = child;
            }
            population = newPopulation;
        }

        int maxFitness = -1;
        String bestIndividual = "";
        for (String individual : population) {
            int currentFitness = calculateFitness(individual, target);
            if (currentFitness > maxFitness) {
                maxFitness = currentFitness;
                bestIndividual = individual;
            }
        }
        return bestIndividual;
    }

    private String randomString(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(randomIndex));
        }
        return sb.toString();
    }

    private int calculateFitness(String individual, String target) {
        int fitness = 0;
        for (int i = 0; i < individual.length(); i++) {
            if (individual.charAt(i) == target.charAt(i)) {
                fitness++;
            }
        }
        return fitness;
    }

    private String selectParent(String[] population, int[] fitness) {
        int totalFitness = 0;
        for (int f : fitness) {
            totalFitness += f;
        }
        int threshold = random.nextInt(totalFitness);
        int runningSum = 0;
        for (int i = 0; i < population.length; i++) {
            runningSum += fitness[i];
            if (runningSum > threshold) {
                return population[i];
            }
        }
        return population[0];
    }

    private String crossover(String parent1, String parent2) {
        int splitPoint = random.nextInt(parent1.length());
        return parent1.substring(0, splitPoint) + parent2.substring(splitPoint);
    }

    private String mutate(String individual, double mutationRate) {
        StringBuilder mutated = new StringBuilder();
        for (int i = 0; i < individual.length(); i++) {
            if (random.nextDouble() < mutationRate) {
                int randomIndex = random.nextInt(CHARACTERS.length());
                mutated.append(CHARACTERS.charAt(randomIndex));
            } else {
                mutated.append(individual.charAt(i));
            }
        }
        return mutated.toString();
    }
}
