import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

class Programming {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S = sc.nextInt();
		int X = sc.nextInt();
		sc.nextLine();
		int min = Integer.MAX_VALUE;
		Queue<Integer> queue = new LinkedList();
		String input[]=sc.nextLine().split(" ");
		for (int i=0;i<N;i++) {
			queue.add(Integer.parseInt(input[i]));
		}
		for (int i=0;i<S;i++) {
			queue.poll();
		}
		 if(queue.isEmpty()) {
				System.out.println(0);
			}
		else if(queue.contains(X)) {
			System.out.println(true);
		}
		
		else {
			for (int num : queue) {
				if(num<min) {
					min=num;
				}
			}
			System.out.println(min);
		}

	}
}
