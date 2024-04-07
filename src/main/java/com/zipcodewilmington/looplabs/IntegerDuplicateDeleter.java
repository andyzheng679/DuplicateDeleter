package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

        int newArraySizeCounter = 0;
        for(int i = 0; i < array.length; i++){
            int dupCounter = 0;
            for(int j = 0; j < array.length; j++){
                if(array[j] == array[i]){
                    dupCounter++;
                }
            }if(dupCounter >= maxNumberOfDuplications){
                newArraySizeCounter++;
            }
        }

        Integer[] newArray = new Integer[array.length - newArraySizeCounter];
        int index = 0;

        for(int i = 0; i < array.length; i++){
            int dupCounter = 0;
            for(int j = 0; j < array.length; j++){
                if(array[j] == array[i]){
                    dupCounter++;
                }
            }if(dupCounter < maxNumberOfDuplications){
                newArray[index] = array[i];
                index++;
            }
        }


        return newArray;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        return new Integer[0];
    }
}
