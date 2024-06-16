package assignment_2_dsa;

import java.util.Random;

public class Randomizer {

    int arr[] = {-1, -1, -1, -1, -1};

    public boolean isEmpty() {
        int empty = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                empty++;
            }

        }
        if (empty == 5) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        int empty = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                empty++;
            }

        }
        if (empty == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void insert(int valaue) {
        int a = 0;
        while (a == 0) {
            Random r = new Random();
            int randomnum = r.nextInt(5);
            if (this.isFull()) {
                System.out.println("Array Is Full");
                a++;
            } else {
                if (arr[randomnum] == -1) {
                    arr[randomnum] = valaue;
                    a++;
                }
            }
        }
    }

    public int delete() {
        int valaue = -1;
        int a = 0;
        while (a == 0) {
            Random r = new Random();
            int randomnum = r.nextInt(5);
            if (this.isEmpty()) {
                System.out.println("Array Is Empty");
                a++;
            } else {
                if (arr[randomnum] != -1) {
                    valaue = arr[randomnum];
                    arr[randomnum] = -1;
                    a++;
                }

            }
        }
        return valaue;
    }

    public void dispaly() {
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }
}
