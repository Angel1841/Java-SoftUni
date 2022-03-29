import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int climberGroups = Integer.parseInt(scanner.nextLine());

        double p1=0;
        double p2=0;
        double p3=0;
        double p4=0;
        double p5=0;

        int allPeople = 0;

        for(int i=0; i<climberGroups;i++){

            int peoplePerGroup = Integer.parseInt(scanner.nextLine());


            if(peoplePerGroup <= 5) p1+= peoplePerGroup;

            if(peoplePerGroup <=12 && peoplePerGroup >=6) p2+= peoplePerGroup;

            if(peoplePerGroup <=25 && peoplePerGroup >=13) p3+= peoplePerGroup;

            if(peoplePerGroup <=40 && peoplePerGroup >=26) p4+= peoplePerGroup;

            if(peoplePerGroup >=41) p5 += peoplePerGroup;


            allPeople += peoplePerGroup;
        }


        double p1Percentage = (p1/allPeople) * 100;
        double p2Percentage = (p2/allPeople) * 100;
        double p3Percentage = (p3/allPeople) * 100;
        double p4Percentage = (p4/allPeople) * 100;
        double p5Percentage = (p5/allPeople) * 100;

        System.out.printf("%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%",p1Percentage,p2Percentage,p3Percentage,p4Percentage,p5Percentage);



    }
}
