public class Influenza_k{
    public static void main(String[] args) {
        ReadFile temp=new ReadFile();
        System.out.println(temp.getCities());
        HeapSort sort=new HeapSort();
        List<City> sortedlist = sort.HeapSort(temp.getCities());
    }
}

