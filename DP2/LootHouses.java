package DP2;

public class LootHouses {

	public static int maxMoneyLooted(int[] houses) {
		//Your code goes here
        if (houses.length==0){
            return 0;
        }
        int storage[] = new int [houses.length];
        storage[0]=houses[0];
        storage[1]= Math.max(houses[0],houses[1]);
        for (int i = 2; i<houses.length;i++){
            storage [i]= Math.max(houses[i]+storage[i-2],storage[i-1]);
        }
        return storage[storage.length-1];
	}

}