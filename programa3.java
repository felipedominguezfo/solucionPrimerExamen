public class programa3 {
        public static void arra(int []arr){
        int suma_par= 0;
        int suma_inpar= 0;
        int resultado= 0;
        int longi= arr.length;  
     
        for (int i = 0; i <longi; i++) {
            if (arr[i]%2==0) {
                suma_par=arr[i]+suma_par;
            }else{
                suma_inpar+=arr[i];
            }
            resultado= suma_par-suma_inpar;
        }
        System.out.println("la suma de los pares es: "+suma_par);
        System.out.println("la suma de impares es: "+ suma_inpar);
        System.out.println("el Resultado es: "+resultado);
    }
    
    public static void main(String[] args) {
        int array[]= {1, 2, 3, 4, 5, 6};
        arra(array);
    
        
        
    }
}
