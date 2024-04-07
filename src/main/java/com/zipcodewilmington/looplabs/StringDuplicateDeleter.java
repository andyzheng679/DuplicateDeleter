package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] stringArray) {
        super(stringArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {

        int newArraySizeCounter = 0;
        for(int i = 0; i < array.length; i++){
            int dupCounter = 0;
            for(int j = 0; j < array.length; j++){
                if(array[j].equals(array[i])){
                    dupCounter++;
                }
            }if(dupCounter >= maxNumberOfDuplications){
                newArraySizeCounter++;
            }
        }

        String[] newArray = new String[array.length - newArraySizeCounter];
        int index = 0;

        for(int i = 0; i < array.length; i++){
            int dupCounter = 0;
            for(int j = 0; j < array.length; j++){
                if(array[j].equals(array[i])){
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
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        int newArraySizeCounter = 0;
        for(int i = 0; i < array.length; i++){
            int dupCounter = 0;
            for(int j = 0; j < array.length; j++){
                if(array[j].equals(array[i])){
                    dupCounter++;
                }
            }if(dupCounter == exactNumberOfDuplications){
                newArraySizeCounter++;
            }
        }

        String[] newArray = new String[array.length - newArraySizeCounter];
        int index = 0;

        for(int i = 0; i < array.length; i++){
            int dupCounter = 0;
            for(int j = 0; j < array.length; j++){
                if(array[j].equals(array[i])){
                    dupCounter++;
                }
            }if(dupCounter != exactNumberOfDuplications){
                newArray[index] = array[i];
                index++;
            }
        }


        return newArray;
    }
}
