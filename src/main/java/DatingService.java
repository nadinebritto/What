/**
 *
 * @author Nadine Silva
 *
 */


public class DatingService {

    public String whatShouldIDoOnMyDate(String day){

        if(day.equals("Sunday")){

         return "Go to church";

        }else if(day.equals("Monday")){

            return "Go t FHE";
        }
        else return "Go to the movies";
    }
}
