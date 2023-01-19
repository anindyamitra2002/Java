class PrimeChecker{
    void detectPrimeNumbers(){
        boolean prime;
        boolean go;
        for(int i = 2; i < 1000; i++){
            prime = false; // initialize as well as reset these variable to false
            go = true; // this valriable is used to break the inner loop without affecting the outer loop

            int j = 2;
            while (go && j<=(int)Math.sqrt(i)+1){ // Every composite number has a proper factor less than or equal to its square root
                if (i % j != 0){ // condition to be the prime number
                    prime = true;
                }
                else if(i % j == 0 && j != i){ // condition to be the composite number
                    prime = false;
                    go = false;
                }
                j++;
            }
            if(prime){
                System.out.println(i);
            }
        }
    }
}

class PickPrimeNumbers{
    public static void main(String args[]){
        PrimeChecker pc = new PrimeChecker();
        pc.detectPrimeNumbers();
    }
}