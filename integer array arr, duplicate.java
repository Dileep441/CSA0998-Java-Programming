public class arrayModification
{
public static void main(String[] args)
{
int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
System.out.println("Original array: " + java.util.Arrays.toString(arr));
int length = arr.length;
for (int i = 0; i < length - 1; i++) {
if (arr[i] == 0) {
for (int j = length - 1; j > i; j--) {
arr[j] = arr[j - 1];
}
arr[i + 1] = 0;
i++;
}
}
System.out.println("Modified array: " + java.util.Arrays.toString(arr));
}
}
