public class ClaseMath {

    public static void main(String[] args) {
        
        int n =2;

        System.out.println(Math.pow(n,8)); // 256.0

        double radio = 5, area;
        area = Math.PI * radio * radio; // 78.53
        area = Math.PI * Math.pow(radio,2);// 78.53

        System.out.println(Math.ceil(area)); // 79.0
        System.out.println(Math.floor(area)); //78.0
        System.out.println(Math.round(area)); // 79
        System.out.println(Math.sqrt(area * area)); // 78.53
        System.out.println(Math.sqrt(Math.pow(n,4))); // 4.0

    }

}
