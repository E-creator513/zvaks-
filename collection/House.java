package com.collection;

public class House {
    private static String name; //Поле не может быть null
    private long year; //Значение поля должно быть больше 0
    private long numberOfLifts; //Значение поля должно быть больше 0

    public House(String name, long marinesCount){

    }
    public House(String name,long year,long numberOfLifts ){
        this.name =name;
        this.year =year ;
        this.numberOfLifts=numberOfLifts;
    }

    public String getName() {
        return name;
    }

   // public void setName(String name) {
  //      this.name = name;
  //  }

    public long getYear() {
        return year;
    }

   // public void setYear(long year) {
        //this.year = year;
  //  }

    public long getNumberOfLifts() {
        return numberOfLifts;
    }

    public void setNumberOfLifts(long numberOfLifts) {
        this.numberOfLifts = numberOfLifts;
    }
    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Year: " + year + "\n" +
                "Number Of Lifts: " + numberOfLifts + "\n";
    }


    public String nameList() {

        String nameList="";
        for(House category :values()){
            nameList+= House.name() +",";
        }
        return nameList.substring(0,nameList.length()-2);
    }

    private static String name() {
        return name;
    }


    private House[] values() {

        return new House[0];
    }

   // public int compareTo(House flatObj){
 //       return id.compareTo(flatObj.getId());
  //  }


    ;



}
