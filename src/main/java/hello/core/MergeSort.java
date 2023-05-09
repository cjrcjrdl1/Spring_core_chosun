package hello.core;

import java.util.Scanner;

public class MergeSort {

    private static int[] sorted;

    private static void merge_sort(int[] a, int left, int right) {
        if (left == right) { //부분리스트가 1개의 원소만 갖고 있을 경우
            //더이상 못쪼개므로 return 한다
            return;
        }

        int mid = (left + right) / 2;

        merge_sort(a, left, mid);
        merge_sort(a, mid + 1, right);

        merge(a, left, mid, right);
    }

    private static void merge(int[] a, int left, int mid, int right) {
        int l = left; //왼쪽 부분리스트 시작점
        int r = mid + 1; //오른쪽 부분리스트 시작점
        int idx = left; //채워넣은 배열의 인덱스

        while (l <= mid && r <= right) { //왼쪽 부분리스트 1번째 원소가 오른쪽 부분리스트
            //r번째 원소보다 작거나 같을 경우 왼쪽 1번째 값 넣고 idx 1증가
            if (a[l] <= a[r]) {
                sorted[idx] = a[l];
                idx++;
                l++;
            } else { //오른쪽 부분리스트 r번째 원소가 왼쪽 l번째 원소보다 작거나 같은 경우
                //오른쪽의 r번째 원소를 새 배열에 넣고 r과 idx 1 증가
                sorted[idx] = a[r];
                idx++;
                r++;
            }

        }
        //왼쪽 부분리스트가 먼저 모두 새 배열에 채워졌을경우 (l>mid)
        //오른쪽 부분리스트 원소가 아직 남아있을 경우
        //오른쪽 부분리스트이 나머지 원소들을 새 배열에 채워준다.
        if (l > mid) {
            while (r <= right) {
                sorted[idx] = a[r];
                idx++;
                r++;
            }
            //오른쪽 부분리스트가 먼저 새 배열에 채워졌을 경우(r>right)
            //왼쪽 부분리스트 원소가 아직 남아있을 경우
            //왼쪽 부분리스트의 나머지 원소들을 새 배열들을 채워준다.
        } else {
            while (l <= mid) {
                sorted[idx] = a[l];
                idx++;
                l++;
            }
        }
        for (int i = left; i <= right; i++) {
            a[i] = sorted[i];
        }

    }

    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1};
        sorted = new int[a.length];
        merge_sort(a, 0, a.length - 1);
        sorted = null;

        for (int i : a) {
            System.out.println("i = " + i);
        }

    }
}
