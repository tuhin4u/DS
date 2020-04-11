package com.ds.queue;

/**
 * Created by U6042192 on 27-Jan-17.
 */
class PetrolPump{
    int petrol;
    int distance;

    public PetrolPump(int petrol, int distance) {
        this.petrol = petrol;
        this.distance = distance;
    }
}
public class CircularTourProblem {
    public int tour(PetrolPump arr[]){
        int currentPetrol;
        boolean found=false;

        for (int start=0;start<arr.length && found!=true;start++){
            //int start=i;
            int k=start;

            currentPetrol=arr[k].petrol-arr[k].distance;
            k++;
            while(k!=start || currentPetrol<0){
                currentPetrol=currentPetrol+arr[start].petrol-arr[start].distance;
                k=k++%(arr.length-1);
            }
            if(k==start){

            }
        }
        return -1;
    }
}
