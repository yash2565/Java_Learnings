import java.util.*;
import java.io.*;

public class Airplane {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int numAirports = scanner.nextInt();
        int[] distances = new int[numAirports];
        for (int i = 0; i < numAirports; i++) {
            distances[i] = scanner.nextInt();
        }

        int numFuelStations = scanner.nextInt();
        int[] fuels = new int[numFuelStations];
        for (int i = 0; i < numFuelStations; i++) {
            fuels[i] = scanner.nextInt();
        }
        int total = scanner.nextInt();
        int InitialFuel = scanner.nextInt();



    }

    private static int Air(int n, int[] distance, int numFuelS,int[] fuels,int total,int InitialFuel){
        if(InitialFuel < total){
            return -1;
        }

        Arrays.sort(distance);
        for (int i = 0; i <distance.length ; i++) {
            if(distance[i]<InitialFuel){
                InitialFuel = distance[i-1];

            }
        }

        return -1;
    }
}