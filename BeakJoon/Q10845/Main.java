package Q10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class MyQue {
	private int[] que;
	private int front, back;

	MyQue() {
		que = new int[10000];
		front = -1;
		back = -1;
	}

	public void push(int X) {
		que[++back] = X;
	}

	public void pop() {
		if (que[front + 1] == 0 || (front == back)) {
			System.out.println(-1);
		} else {
			System.out.println(que[front++ + 1]);
		}
	}

	public void size() {
		System.out.println(back - front);
	}

	public void empty() {
		if (que[front + 1] == 0 || (front == back)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

	public void front() {
		if (que[front + 1] == 0 || (front == back)) {
			System.out.println(-1);
		} else {
			System.out.println(que[front + 1]);
		}
	}

	public void back() {
		if (back == -1 || (front == back)) {
			System.out.println(-1);
		} else {
			System.out.println(que[back]);
		}
	}
}

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		MyQue mq = new MyQue();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String token = st.nextToken();
			switch (token) {
			case "push":
				String token2 = st.nextToken();
				mq.push(Integer.parseInt(token2));
				break;
			case "pop":
				mq.pop();
				break;
			case "size":
				mq.size();
				break;
			case "empty":
				mq.empty();
				break;
			case "front":
				mq.front();
				break;
			case "back":
				mq.back();
				break;
			}
		}
	}
}