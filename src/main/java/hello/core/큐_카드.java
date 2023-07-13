package hello.core;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 큐_카드 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> myQueue = new LinkedList<>();
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            myQueue.add(i);
        }

        while (myQueue.size() > 1) {
            myQueue.poll(); // 맨위 버림
            int temp = myQueue.poll(); //그다음 가드를 내려야함
            myQueue.add(temp);
        }
        System.out.println(myQueue.poll());

    }
}
