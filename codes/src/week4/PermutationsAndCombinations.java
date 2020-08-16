package week4;
import java.util.*;

public class PermutationsAndCombinations {


	public static void main(String[] args) {

		System.out.println("\nGenerating combinations of size 3:");
		char[] s = {'a','b','c','d','e'};
		generate_combinations_of_size(s,0,new ArrayList<Character>(),3);
		System.out.println("\nGenerating combinations of size 5:");
		generate_combinations_of_size(s,0,new ArrayList<Character>(),5);
		
		
		System.out.println("\nGenerating permutations using sets:");
		HashSet<Character> h = new HashSet<Character>();
		h.add('a');
		h.add('b');
		h.add('c');
		h.add('d');
		h.add('e');
		generate_permutation_using_set(h,new ArrayList<Character>());
		
		
		System.out.println("\nGenerating permutations by swapping:");
		generate_permutation(s,0,s.length-1);

	}
	
	// generates all combinations of the characters in the array 'characters' of length 'size'
	// the result is placed in the ArrayList 'result'
	public static void generate_combinations_of_size(char[] characters, int i, ArrayList<Character> result, int size) {
		// pruning function: if the size of result exceeds the required size, we're done
		if (result.size() > size) {
			return;
		}
		// if i reaches the end of the array, we're done
		if (i >= characters.length) {
			if (result.size() == size) {
				System.out.println(result);
				return;
			}
		}
		else {
			// current element
			Character ch = characters[i];
			// recurse, include the i-th character
			result.add(ch);
			generate_combinations_of_size(characters,i+1,result,size);
			// recurse, don't include the i-th character
			result.remove(ch);
			generate_combinations_of_size(characters,i+1,result,size);
		}
	}
	
	// generates all the permutations of the characters in the set h
	public static void generate_permutation_using_set(HashSet<Character> h, ArrayList<Character> result) {
		// if there are no more characters in h, we are done
		if (h.isEmpty()) 
			System.out.println(result);
		else {
			// need to make a new hashset here because we cannot iterate
			// and remove+add entries at the same time
			HashSet<Character> temp = new HashSet<Character>(h);
			for(Character c : temp) {
				// for each character in h pick the character and add it to our string
				// then remove it from h (so it can't be picked again)
				h.remove(c);
				result.add(c);
				generate_permutation_using_set(h,result);
				// re-add the character to h, and remove it from result (we'll try
				// a different character in the next iteration
				result.remove(c);
				h.add(c);
			}
		}
	}
	
	// generates all the permutations of the array 'result'
	public static void generate_permutation(char[] result, int start, int end) {
		if (start == end) {
			System.out.println(result); 
		}
		else {
			// please see explanation in the lecture
			for(int i = start; i <= end; i++) {
				swap(result,start,i);
				generate_permutation(result,start+1,end);
				swap(result,start,i);
			}
		}
	}
	
	// function to swap two elements in an array
	public static void swap(char[] s, int i, int j) {
		char temp = s[i];
		s[i] = s[j];
		s[j] = temp;
	}
	
	// function to print out an array
	public static void print(char[] s) {
		for(int i = 0; i < s.length; i++) {
			System.out.print(s);
		}
		System.out.println();
	}
	
}
