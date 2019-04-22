import java.util.*;
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            int p3 = sc.nextInt();
            int k = sc.nextInt();
            double  e = 81716054175L;
            List<Double> list=new ArrayList<Double>();
    for (int i = 0;i< 20;i++){
        for (int j = 0;j< 40;j++){
            for (int g = 0;g<50;g++){

                list.add(1*Math.pow(p3,i)*Math.pow(p2,j)*Math.pow(p1,g));
            }

        }
    }
    list.sort(Comparator.naturalOrder());

                System.out.println(list.get(k - 1).longValue());

        }
    }

