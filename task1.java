
import java.util.LinkedList;
public class task1 {

    public static void main(String[] args) {

        int[] listMas = {6,1,8,3,7,2,9,0};
        LinkedList<Integer> linkList = new LinkedList<>();

        for (Integer temp : listMas) {
            linkList.add(temp);
        }
        
        int temp = 0;
        while (temp != linkList.size() - 1) {
            linkList.add(linkList.size()-temp, linkList.getFirst());
            linkList.removeFirst();
            temp++;
        }


        System.out.println("linkList = " + linkList);

        
    }
}