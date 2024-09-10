public class Varags {

    static void mostrarEnteros(int... nums){
        System.out.println("hay " +  nums.length + " enteros: ");
        for(int i = 0 ; i < nums.length; i++){
            System.out.println(nums[i] + " ");
        }
    }

    public static void main(String... args) {
        if(args.length > 0){
            System.out.println("Hola mundo con " + args.length + " args");
            for(int i = 0 ; i < args.length; i++){
                System.out.println("arg[]" + i + "] = " + args[i]);
            }
        }else{
            System.out.println("Hola mundo sin args");
        }
    }

}
