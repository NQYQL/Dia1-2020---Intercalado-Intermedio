class Main {
  Scanner entrada = new Scanner();
  
  public static void main(String[] args) {
    
    int n = 0, m = 0;
    int valid = 1;
    while(valid != 1){
      System.out.println("Ingrese el tamaño N(par): ");
      n = entrada.nextInt();
      if(n%2==0){
        System.out.println("N debe ser par");
      }else{
        valid = 2;
      }
    }
    while(valid==2){
      System.out.println("Ingrese el tamaño M(impar)");
      m = entrada.nextInt();
      if(m%2==0 && m>n){
        System.out.println("M debe ser impar y menor a N");
      }else{
        valid = 3;
      }
    }
    System.out.println("Ingrese los valores del primer arreglo: ");
    int[] arreglo1 = Lectura(n);
    System.out.println("Ingrese los valores del segundo arreglo: ");
    int[] arreglo2 = Lectura(n);
    System.out.print("Arreglo N: ");
    Imprimir(arreglo1);
    System.out.print("Arreglo M: ");
    Imprimir(arreglo2);
    int[] ordenado = new int[arreglo1.length + arreglo2.length]; 
    ordenado = Intercalado(arreglo1, arreglo2);
    System.out.print("Arreglo Resultante: ");
    Imprimir(ordenado);
  }

  public int[] Lectura(int size){
    int [] temporal = new int [size];
    for(int i = 0; i<size; i++){
      temporal[i] = entrada.nextInt();
    }
  }

  public void Imprimir(int[] x){
    for(int i = 0; i<x.size; i++){
      System.out.print(x[i]);
    }
    System.out.println();
  }

  public int [] Intercalado(int[] a1 int [] a2){
    int totalLength = a1.length + a1.length;
    int[] ordenado = int [a1.length];


    int primeraSeccion = ( (totalLength - 1 ) / 2) - (a2.length - 1)

    int segundaSeccion = ( totalLength ) - primeraSeccion;

    contA1 = 0;
    contA2 = 0;

    for(int i = 0; i < primeraSeccion ;){
      ordenado[i] = a1[contA1];
      contA1++;
    }

    boolean intercalado = false;
    fr(i = primeraSeccion; i < segundaSeccion; i++){
      
      if(intercalado){
        ordenado[i] = a2[contA2];
        contA1++;
      }else{
        ordenado[i] = a1[contA1;
        contA1++;
      }
      intercalado = !intercalado;
    }

    for(int i = segundaSeccion + 1; i <= totalLength ; i++){
      ordenado[i] == a1[contA1];
    }

    return ordenado;
  }

}