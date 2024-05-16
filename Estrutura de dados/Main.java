public class Main{
    public static void main(String[] args) {
        ListaLigada list = new ListaLigada();
        list.add("CE");
        list.add("BH");
        list.add("AC");
        list.add("PE");
        System.out.println("Tamanho: "+list.getSize());
        System.out.println("First list: "+ list.getFirst().getValue());
        System.out.println("Last list: "+ list.getLast().getValue());
        System.out.println(list.get(0).getValue());
        System.out.println(list.get(1).getValue());
        System.out.println(list.get(2).getValue());
        System.out.println(list.get(3).getValue());
    }
}