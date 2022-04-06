package com.codewars.sixkyu;

//      To participate in a prize draw each one gives his/her firstname.
//      Each letter of a firstname has a value which is its rank in the English alphabet. A and a have rank 1, B and b rank 2 and so on.
//      The length of the firstname is added to the sum of these ranks hence a number som.
//      An array of random weights is linked to the firstnames and each som is multiplied by its corresponding weight to get what they call a winning number.
//      Example:
//      names: "COLIN,AMANDBA,AMANDAB,CAROL,PauL,JOSEPH"
//      weights: [1, 4, 4, 5, 2, 1]
//      PauL -> som = length of firstname + 16 + 1 + 21 + 12 = 4 + 50 -> 54
//      The *weight* associated with PauL is 2 so PauL's *winning number* is 54 * 2 = 108.
//      Now one can sort the firstnames in decreasing order of the winning numbers.
//      When two people have the same winning number sort them alphabetically by their firstnames.
//      Task:
//      parameters: st a string of firstnames, we an array of weights, n a rank
//      return: the firstname of the participant whose rank is n (ranks are numbered from 1)
//      Example:
//      names: "COLIN,AMANDBA,AMANDAB,CAROL,PauL,JOSEPH"
//      weights: [1, 4, 4, 5, 2, 1]
//      n: 4
//      The function should return: "PauL"
//      Notes:
//      The weight array is at least as long as the number of names, it may be longer.
//      If st is empty return "No participants".
//      If n is greater than the number of participants then return "Not enough participants".
//      See Examples Test Cases for more examples.

import java.util.Arrays;
import java.util.Comparator;

public class PrizeDraw {
    public static String nthRank(String st, Integer[] we, int n) {
        if (st.isEmpty()) return "No participants";
        String[] names = st.split(",");
        if (n > names.length) return "Not enough participants";
        ParticipantComparator comparator = new ParticipantComparator(we, st);
        Arrays.sort(names, comparator);
        return names[n - 1];
    }

    private static class ParticipantComparator implements Comparator<String> {

        private final Integer[] weights;
        private final String[] names;

        private ParticipantComparator(Integer[] weights, String names) {
            this.weights = weights;
            this.names = names.split(",");
        }

        @Override
        public int compare(String a, String b) {
            Integer weightA = weight(a);
            Integer weightB = weight(b);
            int compare = weightB.compareTo(weightA);
            if (compare != 0) return compare;
            return a.compareTo(b);
        }

        private int weight(String name) {
            int sum = 0;
            for (char c : name.toLowerCase().toCharArray()) {
                sum += ((int) c) - 96;
            }
            int weight = this.weights[Arrays.asList(this.names).indexOf(name)];
            return (name.length() + sum) * weight;
        }
    }
}