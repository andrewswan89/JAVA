package Sem3;

public class Task2 {public static void main (String[] args) {
    int a[]={10,13,9,12,14};

    for(int i=0;i<a.length;i++){
        boolean x=false;
        if(a[i]%2==0){
            x=true;
        }
        if(!x){
            System.out.println(a[i] + "->");
        }
    }

}
}