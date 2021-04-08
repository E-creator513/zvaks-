package com.collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * @author Emmanuel Tafadzwa Zvavamwe
 */

@XmlRootElement (name="FlatJunior")
@XmlAccessorType (XmlAccessType.NONE)
public class Flat  {
    /**Field ID*/
    @XmlElement
    private int id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    @XmlElement
    private String name; //Поле не может быть null, Строка не может быть пустой
    @XmlElement
    private Coordinates coordinates; //Поле не может быть null
    @XmlElement
    private java.util.Date creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    @XmlElement
    private long area; //Максимальное значение поля: 975, Значение поля должно быть больше 0
    @XmlElement
    private int numberOfRooms; //Значение поля должно быть больше 0
    @XmlElement
    private Integer livingSpace; //Значение поля должно быть больше 0
    @XmlElement
    private Furnisher furnish; //Поле не может быть null
    @XmlElement
    private View view; //Поле не может быть null
    @XmlElement
    private House house; //Поле может быть null

    public Flat(int id, String name, Coordinates coordinates, String now, double askFurnish, Furnisher askView, View askHouse, Object askArea, Object askLivingSpace, House askNoOFRooms) {
    }

    public Flat(int generateNextId, String askName, Coordinates askCoordinates, String now, long askView, int askNoOFRooms, View askArea, Furnisher askLivingSpace, int askHouse) {
    }

    public Flat(Object generateNextId, String askName, Coordinates askCoordinates, LocalDateTime now, double askHealth, Object askArea, Furnisher askFurnish, House askHouse) {
    }

    public Flat(int generateNextId, String askCoordinates, Coordinates askCoordinates1, String now, long askArea, Integer askNoOFRooms, View askFurnish, Furnisher askView, Coordinates askHouse) {
    }

    public Flat(long intId, String receiveName, Coordinates receiveCoordinates, String returnCreationDate, long receiveArea, Furnisher receiveFurnish, View receiveView) {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setarea(long area) {
        this.area = area;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setFurnish(Furnisher furnish) {
        this.furnish = furnish;
    }

    public void setView(View view) {
        this.view = view;

    }

    public void setHouse(House house) {

        this.house = house;
    }

    public void setLivingSpace(Integer livingSpace) {
        this.livingSpace = livingSpace;
    }
    public Flat(int id, String name, Coordinates coordinates, java.util.Date creationDate, long area, int numberOfRooms, Integer livingSpace, Furnisher furnish, View view , House house ){
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.area = area;
        this.numberOfRooms = numberOfRooms;
        this.livingSpace = livingSpace;
        this.furnish=furnish ;
        this.view= view ;
        this.house = house;

    }

    public String getName() {
        return name;
    }

    public House getHouse() {
        return house;
    }

    public View getview() {
        return view;
    }

    public void setId(int id) {
        this.id =id;
    }

    public  int getId() {
        return Math.toIntExact(id);
    }

    public java.util.Date getCreationDate() {
        return creationDate;
    }



    @Override
    public String toString() {
        return "_______________________" + "\n" +
                "Id: " + id + "\n" +
                "Name: " + name + "\n" +
                "Coordinates: " + coordinates + "\n" +
                "CreationDate: " + creationDate + "\n" +
                "Area: " + area + "\n" +
                "NumberOfRooms: " + numberOfRooms + "\n" +
                "livingSpace: " + livingSpace + "\n" +
                "furnish: " + furnish + "\n" +
                "View: " + view + "\n";
        //"House: " + house + "\n";
    }

  /*  @Override
    public int compareTo(Object o) {
        int thisValue = -1;
        if (this.getview() != null) thisValue = this.getview().value;
        int oValue = -1;
        //if (((Flat) o).() != null) oValue = this.getMeleeWeapon().value;

        return thisValue - oValue;
    }*/

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public long getArea() {
        return area;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public Furnisher getFurnish() {
        return furnish;
    }

    public Integer getLivingSpace() {
        return livingSpace ;
    }
    public String returnCreationDate(){
        return ZonedDateTime.now().toString();
    }
}



