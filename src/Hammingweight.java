public class Hammingweight {
        static int Hammingweight(int n){
            int count=0;
            while(n>0){
                if((n&1)==1){
                    count++;
                }
                n=n>>1;
            }
            return count;
        }
        public static void main(String[] args){
            System.out.println(Hammingweight(11));
            System.out.println(Hammingweight(16));
            System.out.println(Hammingweight(5));
        }

}
