import java.util.ArrayList;

public class PersonModel <person> {
    private ArrayList<person> arrPerson= new ArrayList<person>();

    public PersonModel() {
    }

    public PersonModel(ArrayList<person> arrPerson) {
        this.arrPerson = arrPerson;
    }

    public ArrayList<person> getArrPerson() {
        return arrPerson;
    }

    public void setArrPerson(ArrayList<person> arrPerson) {
        this.arrPerson = arrPerson;
    }

    public void insertPerson (person ps){
        this.arrPerson.add(ps);
    }
    public void printPerson(){
        for(person ps:arrPerson){
            ps.toString();
        }
    }
}