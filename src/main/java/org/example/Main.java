 class ParOuImpar  {
    int num;
    public ParOuImpar(int num){
        this.num = num;
    }
    public void verificar(){
        if(num % 2 == 0 ){
            System.out.println("é par ");
        }
        else{
            System.out.println("é impar ");
        }
    }

}
public class Main {
    static void main() {
        ParOuImpar p = new ParOuImpar(10002);
        p.verificar();


    }
}
