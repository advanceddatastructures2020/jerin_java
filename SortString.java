import java.util.Arrays;
public class SortString
{
public static void main(String args[])
{
String countries[]={"Zimbabwe","South-africa","India","America","Australia","Yugoslavia","Denmark","France"};
int size=countries.length;
for(int i=0;i<size-1;i++)
{
for(int j=i+1;j<countries.length;j++)
{
if(countries[i].compareTo(countries[j])>0)
{
String temp=countries[i];
countries[i]=countries[j];
countries[j]=temp;
}
}
}
System.out.println(Arrays.toString(countries));

}
}