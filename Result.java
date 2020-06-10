import java.util.List;
import java.util.ArrayList;

class Result {
  public static void main(String[] args) {
    List<Integer> a = new ArrayList<>();
    a.add(2); a.add(4);

    List<Integer> b = new ArrayList<>();
    b.add(16); b.add(32); b.add(96);

    System.out.println(getTotalX(a, b));
  }

  public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
    int count = 0;
    int start = max(a);
    int end = min(b);
    int n = a.size() > b.size() ? a.size() : b.size();

    for (int curr=start; curr<=end; curr+=start) {
      for (int i=0; i<n; i++) {
        if (i < a.size() && curr%a.get(i) != 0)
          break;
        if (i < b.size() && b.get(i)%curr != 0)
          break;
        if (i == n-1) count++;
      }
    }

    return count;
  }

  public static int min(List<Integer> l) {
    int min = Integer.MAX_VALUE;
    for (int i=0; i<l.size(); i++)
      min = Integer.min(min, l.get(i));
    return min;
  }

  public static int max(List<Integer> l) {
    int max = Integer.MIN_VALUE;
    for (int i=0; i<l.size(); i++)
      max = Integer.max(max, l.get(i));
    return max;
  }
}