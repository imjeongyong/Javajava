package q10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class MyStack {
	int[] stackAr;
	int pointer;

	MyStack() {
		stackAr = new int[10000];
		pointer = -1;
	}

	public void push(int X) {
		stackAr[++pointer] = X;
	}

	public void pop() {
		if (pointer == -1) {
			System.out.println(pointer);
		} else {
			System.out.println(stackAr[pointer--]);
		}
	}

	public void size() {
		System.out.println(pointer + 1);
	}

	public void empty() {
		if (pointer == -1) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

	public void top() {
		if (pointer == -1) {
			System.out.println(pointer);
		} else {
			System.out.println(stackAr[pointer]);
		}
	}
}

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());

		MyStack stk = new MyStack();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String token = st.nextToken();

			switch (token) {
			case "push":
				String token2 = st.nextToken();
				stk.push(Integer.parseInt(token2));
				break;
			case "pop":
				stk.pop();
				break;
			case "size":
				stk.size();
				break;
			case "empty":
				stk.empty();
				break;
			case "top":
				stk.top();
				break;
			}
		}
	}
}