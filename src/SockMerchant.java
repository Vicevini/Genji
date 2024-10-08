package src;

import java.util.HashMap;

public class SockMerchant {

    public static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> sockCount = new HashMap<>();
        int totalPairs = 0;

        for (int sock : ar) {
            if (sockCount.containsKey(sock)) {
                sockCount.put(sock, sockCount.get(sock) + 1); 
            } else {
                sockCount.put(sock, 1); 
            }
            
            if (sockCount.get(sock) == 2) {
                totalPairs++;
                sockCount.put(sock, 0); 
            }
        }

        return totalPairs;
    }

    public static void main(String[] args) {
        int n = 11;
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20, 50, 30};
        int result = sockMerchant(n, ar);
        System.out.println("Total de pares: " + result);
    }
}
