package week1_assignment;
public class WarehouseInventoryBalancer {
    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0, totalB = 0;
        for (int x : sectionA) totalA += x;
        for (int x : sectionB) totalB += x;
        int highest = Integer.MIN_VALUE, index = -1; String section = "";
        for (int i = 0; i < sectionA.length; i++) if (sectionA[i] > highest) { highest = sectionA[i]; index = i; section = "Section A"; }
        for (int i = 0; i < sectionB.length; i++) if (sectionB[i] > highest) { highest = sectionB[i]; index = i; section = "Section B"; }
        System.out.println("Section A Total: " + totalA + " | Section B Total: " + totalB +
                " | Status: " + (totalA == totalB ? "Balanced" : "Not Balanced"));
        System.out.println("Highest Quantity: " + highest + " (" + section + ", Item " + (index + 1) + ")");
    }
    public static void main(String[] args) { analyzeInventory(new int[]{20,15,30}, new int[]{25,10,30}); }
}
