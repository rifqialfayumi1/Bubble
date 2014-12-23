import java.util.Scanner;
public class Sort{

public static void swap(int[]data,int j,int i){
int temp=data[i];
data[i]=data[j];
data[j]=temp;

public static void Bubble(int[]data){
for(int i=1;i<data.length;i++)
for(int j=data.length-1;j-1;j--)
if(data[j-1]>data[j])
swap (data,j-1,j);
}
public static void main (String[]args)
{
int[]data={6,4,3,2,1,10,11,17};
System.out.print('Nilai sebelum diurutkan:");
for (int a:data)
System.out.print(a+" ");
Bubble(data);
System.out.println();
System.out.print("Nilai sesudah diurutkan:");
for(int a:data)
System.out.print(a+" ");
System.out.println();
}
}


