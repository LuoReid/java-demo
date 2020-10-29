import java.util.Vector;

public class MyVector extends Vector {
  public MyVector(){super(1,1);}
  public void addInt(int i){
    addElement(new Integer(i));
  }
  public void addFloat(float f){
    addElement(new Float(f));
  }
  public void AddString(String s){
    addElement(s);
  }
  public void addCharArray(char a[]){
    addElement(a);
  }
  public void printVector(){
    Object o;
    int length = size();
    System.out.println("Number of vector elements is "+length+" and they are:");
    for(int i=0;i<length;i++){
      o=elementAt(i);
      if(o instanceof char[]){
        System.out.println(String.copyValueOf((char[])o));
      }else{
        System.out.println(o.toString());
      }
    }
  }
  public static void main(String[] args) {
    // MyVector v = new MyVector();
    // int digit = 5;
    // float real = 3.14f;
    // char letters[] = {'a','b','c','d'};
    // String s = new String("Hi there!");
    // v.addInt(digit);
    // v.addFloat(real);
    // v.AddString(s);
    // v.addCharArray(letters);
    // v.printVector();

    Test3(4);
  }
  public static void Test3(int n){
    int k,i,j,a[][] = new int[n][n];
    k=1;
    for (i=0;i<n;i++){
      if(i%2 == 0){
        for(j=0;j<=i;j++){
          a[i][j] = k++;
        }
        for(j=i;j<=i;j++){
          a[j][i]=k++;
        }
      }else{
        for(j=0;j<=i;j++){
          a[j][i]=k++;
        }
        for(j=i-1;j>=0;j--){
          a[i][j] = k++;
        }
      }
    }
    for(i=0;i<n;i++){
      for(j=0;j<n;j++){
        System.out.print(a[i][j]);
        System.out.print(',');
      }
      System.out.println();
    }
  }
}
