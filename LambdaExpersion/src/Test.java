interface interf{
    public void display(int a,int b);
}

 class Test {
     public static void main(String[] args) {
         interf i=(a,b)->
            System.out.println(a+b);
         i.display(10,30);
         i.display(10,20);
     }
}
