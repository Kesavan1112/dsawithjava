public class digitfindnarray {
    public static void main(String[] args) {
        
int a=3000;
int arr[]={77,889,77,334,877,88,99,89,556};
System.out.println(digitfind(a)); 

System.out.println(numberfind(arr));

System.out.println(arrayeven(arr));
}

static int numberfind(int y[]){
int count=0;
for(int u:y){
    if(even(u)){count++;}
 } return count; 
}

static boolean even(int num){
    int num1=digitfind(num);
    return num1%2==0;


}
    static int digitfind(int v){
        int count=0;
        
        while(v>0){
            count++;
            v=v/10;

        }

    return count;
    }

static String arrayeven(int a[]){
int count=0;
int odd=0;
    for(int y:a){
if(y%2==0){
        count++;
}
else{
    odd++;
}
    }

return "even="+count+"\nodd="+odd;
}


}
//conve