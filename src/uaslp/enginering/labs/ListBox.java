package uaslp.enginering.labs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListBox extends Control{
    List<String> options;
    public ListBox(String ... options){
        this.options = new ArrayList<>(options.length);
        Collections.addAll(this.options,options);
    }

    protected void draw(){
        for (String option : options){
            System.out.print(option + " -");
        }
    }
}