import java.util.ArrayList;
import java.util.List;

public abstract class SubjectElement implements Subject, Elemente{

    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer obs){
        observers.add(obs);
    }

    public void detach(Observer obs){
        observers.remove(obs);
    }

    /*public void notifyObservers(){
        observers.forEach(Observer::update);
    }*/

    public void Add(Elemente x){

    }
    public void Remove(Elemente x){

    }
    public Elemente getElement(int index){
        return null;
    }
    public void Print(){

    }
    public void acceptVisitor(Visitor v){

    }
}